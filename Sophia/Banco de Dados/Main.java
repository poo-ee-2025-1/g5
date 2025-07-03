import java.sql.SQLException;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TarifasRepository repository = null;
        Scanner scanner = new Scanner(System.in);
        
        try {
            repository = new TarifasRepository();
            
            System.out.println("--- Cálculo de Gasto ---");
            
            System.out.print("Digite a sigla do estado (ex: SP, RJ, MG): ");
            String estado = scanner.nextLine().toUpperCase();
            
            System.out.print("Potência do equipamento (em Watts): ");
            double potencia = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Hora de início (HH:MM): ");
            LocalTime inicio = LocalTime.parse(scanner.nextLine());
            
            System.out.print("Hora de término (HH:MM): ");
            LocalTime fim = LocalTime.parse(scanner.nextLine());
            
            // Buscar a tarifa e fazer o cálculo
            Tarifas tarifa = repository.buscarEstado(estado);
            
            if (tarifa == null) {
                System.out.println("\nEstado '" + estado + "' não encontrado!");
                return;
            }
            
            CalcularGasto calculo = new CalcularGasto(inicio, fim, potencia, estado, repository);
            
            // Exibe resultados
            System.out.printf("\nTarifas em %s:%n", estado);
            System.out.printf("- Horário de Ponta (18h-21h): R$ %.4f/kWh%n", tarifa.getPonta());
            System.out.printf("- Fora de Ponta: R$ %.4f/kWh%n", tarifa.getForaPonta());
            
            System.out.println("\n--- Resultados ---");
            System.out.printf("Horas Ponta: %.2f h%n", calculo.horasPonta());
            System.out.printf("Horas Fora Ponta: %.2f h%n", calculo.horasForaPonta());
            System.out.printf("Consumo Total: %.3f kWh%n", calculo.calcularConsumo());
            System.out.printf("Custo Total: R$ %.2f%n", calculo.calcularGasto());
            
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            try {
                if (repository != null) repository.close();
                scanner.close();
            } catch (Exception e) {
                System.out.println("Aviso: " + e.getMessage());
            }
        }
    }
}