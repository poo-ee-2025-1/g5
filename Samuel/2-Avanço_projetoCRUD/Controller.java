import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.event.Event;

public class Controller {
    
    Stage stage;
    View view;
    Usuario teste;
    @FXML
    
    //public Button myButton; // Corresponde ao fx:id="myButton" no FXML
    public Label firstlabel;
    public TextField textFieldEmail;
    public PasswordField aSenha;
    public PasswordField cSenha;
    public Label visu;
    public Controller()
    {
        this.stage = new Stage();
        this.view = new View();
        this.view.setController(this);
    }
    public void iniciar() throws Exception {
        this.view.start(this.stage);
        this.stage.show();
    }
    public void BotaoClicado(Event e){
        try{
            String email = textFieldEmail.getText();
            String senha = aSenha.getText();
            String confirmaSenha= cSenha.getText();
            Usuario usuario = new Usuario(email, senha, confirmaSenha);
            this.visu.setText(usuario.conf());
    }
        catch(NumberFormatException exception){
            visu.setText("Por favor informe as credenciais");
        }}
        
    public void loginClicado(Event e){
        try{
            String email = textFieldEmail.getText();
            String senha = aSenha.getText();
            Usuario usuario = new Usuario(email, senha,"null");
            usuario.verificaLogin(email,senha);
        }
        catch(NumberFormatException exception){
            
        }
    }
    }
    
    
    
    
