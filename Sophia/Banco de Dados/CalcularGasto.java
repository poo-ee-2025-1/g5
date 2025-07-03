import java.time.LocalTime;
import java.time.Duration;
import java.sql.SQLException;

public class CalcularGasto extends PeriodoUso {

    private double potencia; //em W
    private String estado;
    private TarifasRepository tarifasRepository;
    
    //definir o intervalo hora ponta para calculo do gasto de acordo com o horário

    private static LocalTime inicioPonta = LocalTime.of(18, 0); //(hora, minuto)
    private static LocalTime fimPonta = LocalTime.of(21, 0);
    
    public CalcularGasto(LocalTime inicio, LocalTime fim, double potencia, String estado, TarifasRepository tarifasRepository){
        
        super(inicio, fim);
        this.potencia = potencia;
        this.estado = estado;
        this.tarifasRepository = tarifasRepository; 
    }
    
    public double horasPonta(){
    
        LocalTime inicio = getInicio();
        LocalTime fim = getFim();
        
        //necessário criar uma exceção para caso o horário de operação não seja em momento algum no Hora Ponta, para que o resultado do consumo não seja negativo
       
        if (fim.isBefore(inicioPonta) || inicio.isAfter(fimPonta)) {
        return 0.0;
        }
        
        LocalTime inicioHoraPonta;
        if (inicio.isBefore(inicioPonta)){
            
            inicioHoraPonta = inicioPonta;
            
        } else{
            
            inicioHoraPonta = inicio;
        }
        
        
        LocalTime fimHoraPonta;
        if(fim.isAfter(fimPonta)){
        
            fimHoraPonta = fimPonta;
        
        } else{
        
            fimHoraPonta = fim;
        }
        
        return  Duration.between(inicioHoraPonta, fimHoraPonta).toMinutes()/60;

    }
    
    public double horasForaPonta(){
    
        double horasTotal = Duration.between(getInicio(), getFim()).toMinutes()/60;

        return horasTotal - horasPonta();
    
    }
    
    public double calcularConsumo(){ //valor diário
    
        return potencia * (horasPonta() + horasForaPonta())/ 1000; //divide´po 1000 para o consumo ser em kWh
    }
    
    public double calcularGasto() throws SQLException{
        
        Tarifas tarifa = tarifasRepository.buscarEstado(estado);
        
        if (tarifa == null) {
            
            throw new SQLException("Tarifas não encontradas para o estado: " + estado);
        
        }
        
        return potencia * ((tarifa.getPonta() * horasPonta()) + (tarifa.getForaPonta() * horasForaPonta()));
    
    }
    
    public double getPotencia() { 
        
        return this.potencia; 
    }
    
    public void setPotencia(double potencia) {
        
        this.potencia = potencia; 
    }

}
