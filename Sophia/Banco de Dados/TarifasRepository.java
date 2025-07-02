import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class TarifasRepository {
    private final Dao<Tarifas, String> dao;
    private final Database database;
    
    public TarifasRepository() throws SQLException {
        this.database = new Database("tarifas.db");

        this.dao = DaoManager.createDao(database.getConnection(), Tarifas.class);
        TableUtils.createTableIfNotExists(database.getConnection(), Tarifas.class);

    }
    
    

    public Tarifas buscarEstado(String estado) throws SQLException {
        List<Tarifas> todasTarifas = dao.queryForAll();
        
        for (Tarifas tarifa : todasTarifas) {
            
            if (tarifa.getEstado().equals(estado)) {
                return tarifa;
            }
        }
        return null;
    }

    public void close() {
        if (database != null) {
            try {
                
            database.getConnection().close();
            
            }    catch (Exception e) {

            System.out.println("Erro ao fechar conexão: " + e.getMessage());
            
            
            }
        }
    }
}