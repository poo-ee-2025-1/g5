import java.util.Date;
import java.text.SimpleDateFormat;
import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.DataType;

@DatabaseTable(tableName = "tarifas")
public class Tarifas {  
    
    @DatabaseField(id = true, columnName = "Estado")
    private String estado;
    
    @DatabaseField (columnName = "Ponta")
    private double ponta;
    
    @DatabaseField (columnName = "Fora Ponta") 
    private double foraPonta;
    
    public Tarifas() {}
    
    public Tarifas(String estado, double ponta, double foraPonta) {
        this.estado = estado;
        this.ponta = ponta;
        this.foraPonta = foraPonta;
    }

    public String getEstado(){
        
        return estado;
    }
  
    public void setEstado(String estado){
        
        this.estado = estado;
    }

    public double getPonta() { 
        
        return ponta; 
    }

    public void setPonta(double ponta){
        
        this.ponta = ponta;
    }
    
    public double getForaPonta(){
        
        return this.foraPonta;
    }

    public void setForaPonta(double foraPonta) {
        
        this.foraPonta = foraPonta;
    }
}


