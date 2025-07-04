import java.time.LocalTime;
import java.time.Duration;
import java.sql.SQLException;

public class CalcularGasto extends PeriodoUso {

    private double potencia; //em W
    private String estado;
    private TarifasRepository tarifasRepository;
    
    //definir o intervalo hora ponta para calculo do gasto de acordo com o horário

    private static LocalTime inicioPonta = LocalTime.of(18, 00); //(hora, minuto)
    private static LocalTime fimPonta = LocalTime.of(21, 00);
    
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
        
        return  Duration.between(inicioHoraPonta, fimHoraPonta).toMinutes()/60.0;

    }
    
    public double horasForaPonta(){

        
        LocalTime inicio = getInicio();
        LocalTime fim = getFim();
    
        //para caso o horário de operação não seja em momento algum no ForaPonta
        
        if (fim.isBefore(inicioPonta) || inicio.isAfter(fimPonta)) {
            
            return Duration.between(inicio, fim).toMinutes() / 60.0;
        }
    
        //para caso  o horário de operação estiver somente no horário Ponta
        
        if (inicio.isAfter(inicioPonta) && fim.isBefore(fimPonta)) {
            
            return 0.0;
        }
    
        //para caso começar antes do horario HoraPonta e acabar depois do horario HoraPonta 
        
        if (inicio.isBefore(inicioPonta) && fim.isAfter(fimPonta)) {
            
            return Duration.between(inicio, inicioPonta).toMinutes() / 60.0 + Duration.between(fimPonta, fim).toMinutes() / 60.0;
        }
    
        //para caso começar antes do horario Horaponta e terminar dentro do intervalo de HoraPonta
        
        if (inicio.isBefore(inicioPonta)) {
            
            return Duration.between(inicio, inicioPonta).toMinutes() / 60.0;
        }
    
        //para caso começar dentro do intervalo Horaponta e terminar fpra desse intervalo 
        
        return Duration.between(fimPonta, fim).toMinutes() / 60.0;
        
        }
        

    
    public double calcularConsumo(){   //valor diário daquele equipamento
    
        
        return (potencia * horasPonta() + potencia * horasForaPonta())/1000;   //divide´po 1000 para o consumo ser em kWh
    }
    
    
    public double calcularGasto() throws SQLException{
        
        Tarifas tarifa = tarifasRepository.buscarEstado(estado);
        
        if (tarifa == null) {
            
            throw new SQLException("Tarifas não encontradas para o estado: " + estado);
        
        }
        
        return (potencia * ((tarifa.getPonta() * horasPonta()) + (tarifa.getForaPonta() * horasForaPonta())))/1000;
    
    }
    
    public double getPotencia() { 
        
        return this.potencia; 
    }
    
    public void setPotencia(double potencia) {
        
        this.potencia = potencia; 
    }

}