import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.File;
import java.net.URL;

/**
 * Interface Gráfica (GUI) 
 * 
 * @author 
 * @version 0.01
 */
public class View extends Application
{
    private FXMLLoader loader;
    private URL url;
    
    public View() {
        this.loader = new FXMLLoader();
        try {
            this.url = new File("1-teladelogin.fxml").toURI().toURL();
        } catch (Exception e) {
            System.out.println("Erro na carga do FXML:" + e);
        }
        this.loader.setLocation(this.url);        
    }
    
    public void setController(Controller controller) {
        this.loader.setController(controller);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = loader.<Pane>load();
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        //primaryStage.show();
    }
/**public void abrirMenu // fazer outro metodo que quando clicar no botao Login (no controlador) ele inicia outro arquivo scenebuilder(fxml)(nesse caso sendo o 2-telamenu)
 * //assim abrindo a outra interface que seria onde teria as opçoes do nosso programa em si.
 * 
 * 
 */
}
