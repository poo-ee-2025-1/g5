package controller;
import view.View;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.control.TableView;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tab;
import javafx.scene.Node;

/**
 * Escreva uma descrição da classe controller1 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Controller1
{   Stage stage;
    @FXML
    private TextField cEmail;
    @FXML
    private PasswordField cSenha;
    @FXML
    private TextField uEmail;
    @FXML
    private PasswordField uSenha;
    @FXML 
    private Tab cadastrarEquupamento;
    @FXML
    private Tab abaLogin;
    @FXML
    private Tab abaRegister;
    @FXML
    private Tab abaVisualizar;
    @FXML
    private Tab abaRegistrarEmpresas;
    @FXML
    private Tab abaRegistrarEquipamentos;
    //botoes de cadastrar equipamentos
    @FXML
    private Button bAdd;
    @FXML
    private Button bAtualizar;
    @FXML
    private Button bRemover;
    @FXML
    private Button bSalvar;
    @FXML
    private Button bCancelar;
    //campos de textos de cadastrar equipamentos
    @FXML
    private TextField tCategoria;
    @FXML
    private TextField tPeriodo;
    @FXML
    private TextField tTempo;
    @FXML
    private TextField tPotencia;
    @FXML
    private TextField tFatorP;
    @FXML
    private TextField tSetor;
    @FXML
    private TextField tDataDeAqui;
    @FXML
    private TextField tCertificacao;
    @FXML
    private TextField tVidaUtil;
    
    
    
    View view;
    
    public Controller1(){
        this.stage = new Stage();
        this.view = new View();
        this.view.setController(this);
    }
    
    public void iniciar() throws Exception {
        this.view.start(this.stage);
        this.stage.show();
        
    }
    public void botaoRegistrarClicado(Event e){
        try{
            String email= cEmail.getText();
            String senha= cSenha.getText();
            //string confirmsenha = confsenha.gettext();
            //if(senha.equals(confirmsenha){
            //    roda o codigo, construtor
            //else{ caixa de texto da senha vazia e senha errada
            
            //salva esses valores no banco de dados e atribui um id a eles /ao usuario
        }
        catch(NumberFormatException exception){
            //error
        }
    }
    public void botaoLoginClicado(Event e){
        try{
            String email= uEmail.getText();
            String senha= uSenha.getText();
            //chama a verificaçao de dados(no caso email e senha) do banco de dados, la na main.
            //metodo da main
            
            //salva esses valores no banco de dados e atribui um id a eles /ao usuario
            //if para saber se as credenciais esto corretas:
            //caso estejam, execute :
            desabilitarLoginCadastrar(false, true);
            //else :(erro e esvazia a caixa de texto)
        }
        catch(NumberFormatException exception){
            //error
        }
    }
    private void desabilitarLoginCadastrar(boolean desabilitado,boolean desabilitado2){
        //objetivo:quando concluir o login , ele abilite empresas equipamentos e viaualizar, e desabilite login e registrar.
        abaRegister.setDisable(desabilitado);
        abaLogin.setDisable(desabilitado);
        abaRegistrarEmpresas.setDisable(desabilitado2);
        abaRegistrarEquipamentos.setDisable(desabilitado2);
        abaVisualizar.setDisable(desabilitado2);

    }
    private void desabilitarBotoes(boolean desabilitado_1, boolean desabilitado_2){
        try{
            bAdd.setDisable(desabilitado_1);
            // pro ENGENHEIRO:     bAtualizar.setDisable(desabilitado_2);
            bRemover.setDisable(desabilitado_2);
            bSalvar.setDisable(desabilitado_2);
            bCancelar.setDisable(desabilitado_2);
            tCategoria.setDisable(desabilitado_2);
            tPeriodo.setDisable(desabilitado_2);   
            tTempo.setDisable(desabilitado_2);
            tPotencia.setDisable(desabilitado_2);
            tFatorP.setDisable(desabilitado_2);
            tSetor.setDisable(desabilitado_2);
            tDataDeAqui.setDisable(desabilitado_2);
            tCertificacao.setDisable(desabilitado_2);
            tVidaUtil.setDisable(desabilitado_2);
        }
        catch(NumberFormatException exception){
            //error
        }
    }
    private void visualizarCampos(boolean visivel, boolean visivelresto){
        try{
            
            //metodo apenas para o Adm engenheiro , para ele poder visualizar  o botao atualizar 
            // quando adm apertar em add , vai aparecer atualizar e desaparecer salvar.
            bAtualizar.setVisible(visivel); 
            bSalvar.setVisible(visivelresto);
            
        }
        catch(NumberFormatException exception){
            //error
        }
    }
    public void addClicado(Event e){
        try{
            // fazer um if que verifica se o usuario é adm ou comum,
                //caso seja adm, execute:
                    //visualizarCampos(true, false);
                //caso seja comum :
                    //visualiarCampos(false, true);
                    
            desabilitarBotoes(true, false);
            
            
            
        }
        catch(NumberFormatException exception){
            
        }
    }
    public void atzClicado(Event e){
        try{
            desabilitarBotoes(true, false);
            
            
            
        }
        catch(NumberFormatException exception){
            
        }
    }
    public void removeClicado(Event e){
        try{
            desabilitarBotoes(true, false);
            
            
            
        }
        catch(NumberFormatException exception){
            
        }
    }
    public void salvarClicado(Event e){
        try{
            desabilitarBotoes(false, true);
            
            
            
        }
        catch(NumberFormatException exception){
            
        }
    }
    public void cancelarClicado(Event e){
        try{
            desabilitarBotoes(true, false);
            
            
            
        }
        catch(NumberFormatException exception){
            
        }
    }
    
        
    }
    
