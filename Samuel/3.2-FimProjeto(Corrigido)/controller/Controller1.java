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
import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import java.util.List;
import java.util.ArrayList;
import model.Empresa;
import model.Equipamento;
import javafx.scene.control.TableColumn;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;





/**
 * Escreva uma descrição da classe controller1 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Controller1
{   Stage stage;
    /*@FXML
    private TableView<Equipamento> tabelaEquipamentos;
    @FXML
    private TableColumn<Equipamento, String> colCategoria;
    @FXML
    private TableColumn<Equipamento, String> colPeriodo;
    @FXML
    private TableColumn<Equipamento, String> colTempo;
    @FXML
    private TableColumn<Equipamento, String> colPotencia;
    */
    
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
    private TextField tNome;
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
    @FXML
    private MenuButton menubuttonEmpresa;
    @FXML
    private Label aviso_cequi;
    //cria uma lista
    private ObservableList<Equipamento> listaEquipamentos = FXCollections.observableArrayList();
    
    // cadastrar Empresas
    @FXML
    private TextField tfNomeDaEmpresa;
    @FXML
    private TextField tfEstadoDaEmpresa;
    @FXML
    private TextField tfCnpjDaEmpresa;
    @FXML
    private TextField tfIdDaEmpresa;
    
    

    
    private model.Empresa empresaSelecionada;
    
    @FXML
    
    public void initialize() {
        carregarEmpresasNoMenuButton();
        //configurarTabela();
    
    }
    
    /*private void configurarTabela() {
        colCategoria.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        colPeriodo.setCellValueFactory(new PropertyValueFactory<>("periodo"));
        colTempo.setCellValueFactory(new PropertyValueFactory<>("tempo"));
        colPotencia.setCellValueFactory(new PropertyValueFactory<>("potencia"));
        tabelaEquipamentos.setItems(listaEquipamentos);
    }*/    
    public Controller1() {
        
    }

    public void iniciar() {
        View.setController(this);
        Application.launch(View.class); // inicia o JavaFX
    }
    private boolean identficaAdmin(){
        //aqui vai identificar se o usuario é admin ou nao, ele pode ver por um atributo booleano chamado "adm', em que se estiver true , entao o usuario é engenheiro, se tiver false ele é usuario comum.
        /* if(usuario.adm == true){
        /*      return true
            }
            else{
             return false
            }
      */
          return true;// apenas para nao dar erro no codigo
    }
    
    private void carregarEmpresasNoMenuButton() {
        // Limpa quaisquer MenuItems existentes 
        menubuttonEmpresa.getItems().clear();

        // lista de empresas (substitua pela lógica de banco de dados)
        // exemplo
        
        listaEmpresas.add(new model.Empresa(1, "Empresa Hugo"));
        listaEmpresas.add(new model.Empresa(2, "Empresa Samel"));
        

        // Substitua isso pela sua chamada ao serviço de empresas
        // Exemplo:
        // List<Empresa> empresasDoBM = empresaService.buscarTodasEmpresas();
        // listaEmpresas.addAll(empresasDoBM);

        for (Empresa empresa : listaEmpresas) {
            MenuItem menuItem = new MenuItem(empresa.getNome());
            
            menuItem.setUserData(empresa);

            
            menuItem.setOnAction(event -> {
                Empresa selected = (Empresa) menuItem.getUserData();
                this.empresaSelecionada = selected; // Armazena a empresa selecionada
                menubuttonEmpresa.setText(selected.getNome()); // Atualiza o texto do MenuButton
                //aparece na tela : 
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Sucesso");
                    alert.setHeaderText(null);
                    alert.setContentText("Empresa selecionada com sucesso!");
                    alert.showAndWait();

            });

            menubuttonEmpresa.getItems().add(menuItem);
        }
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
            cEmail.clear();
            cSenha.clear();
        }
        catch(Exception error){
            //error
        }
    }
    private boolean validarLogin(String email, String senha) {
        //exemplo
        return email.equals("samuel@lopes.com") && senha.equals("1234");
        //onde esse email  "admin@exemplo.com" e senha "1234" sao apenas ilustrativos, no lugar deles seria nescessario colocar uma varredura de emails,senha do banco de dados.
    }

    public void botaoLoginClicado(Event e){
        try{
            String email= uEmail.getText();
            String senha= uSenha.getText();
            //chama a verificaçao de dados(no caso email e senha) do banco de dados, la na main.
            //metodo da main
            
            //salva esses valores no banco de dados e atribui um id a eles /ao usuario
            
            if (validarLogin(email, senha) == true) {
                desabilitarLoginCadastrar(true, false);
                
            } else {
                uEmail.clear();
                uSenha.clear();
                // mostrar alerta de erro
            }

        }
        catch(Exception error){
            uEmail.clear();
            uSenha.clear();
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
            tNome.setDisable(desabilitado_2);
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
        catch(Exception error){
            //error
        }
    }
    private void limparCamposEquipamento() {
        tCategoria.clear();
        tPeriodo.clear();
        tTempo.clear();
        tPotencia.clear();
        tFatorP.clear();
        tSetor.clear();
        tDataDeAqui.clear();
        tCertificacao.clear();
        tVidaUtil.clear();
    }

    private void visualizarCampos(boolean visivel, boolean visivelresto){
        try{
            
            //metodo apenas para o Adm engenheiro , para ele poder visualizar  o botao atualizar 
            // quando adm apertar em add , vai aparecer atualizar e desaparecer salvar.
            bAtualizar.setVisible(visivel); 
            bSalvar.setVisible(visivelresto);
            
        }
        catch(Exception error){
            //error
        }
    }
    
    //-------------------Cadastrar Equipamentos----------------------
    
    
    public void addClicado(Event e){
        try{    
        if (empresaSelecionada == null) {
            // Exibir mensagem de erro para o usuário selecionar uma empresa
            aviso_cequi.setText("Selecione uma empresa antes .");
            return;
        }
        
            // fazer um if que verifica se o usuario é adm ou comum,
                //caso seja adm, execute:
                    //visualizarCampos(true, false);
                //caso seja comum :
                    //visualiarCampos(false, true);
        
        desabilitarBotoes(true, false);
            
            
            
        }
        catch(Exception erro){
            
        }
    }
    public void atzClicado(Event e){
        try{
            desabilitarBotoes(true, false);
            // envia/salva um objeto equipamento( copia do que ele editou) no banco de dados.
            
            
        }
        catch(Exception error){
            //error
        }
    }
    public void removeClicado(Event e){
        try{
            desabilitarBotoes(true, false);
            limparCamposEquipamento();
            
            
        }
        catch(Exception error){
            //error
        }
    }
    public void salvarClicado(Event e){
        try{
            desabilitarBotoes(false, true);
            String nomeEquipamento = tNome.getText();
            String categoriaEquipamento = tCategoria.getText();
            // outros atributos da  interface na aba de cadastrar equipaamentos.
        
            Equipamento novoEquipamento = new Equipamento(nomeEquipamento, categoriaEquipamento, empresaSelecionada);            
            //chama um metodo do banco de dados para salvar equipamento.
            limparCamposEquipamento();
            Equipamento eq = new model.Equipamento(nomeEquipamento, categoriaEquipamento, empresaSelecionada);
            listaEquipamentos.add(eq);

            
            
        }
        catch(Exception error){
            new Alert(AlertType.ERROR, "Erro ao Salvar: "+error.getMessage()).show();
            
        }
    }
    public void cancelarClicado(Event e){
        try{
            desabilitarBotoes(true, false);
            limparCamposEquipamento();
            
            
        }
        catch(Exception error){
            //error
            
        }
    }
    
    //-------------------------Cdastrar Empresas----------------------
    
    List<Empresa> listaEmpresas = new ArrayList<>();
    private void visibilidadeAdm(){
        //  deixa os botoes que so o adm pode usar visiveis, como salvar ,etc, e os textfields  dos atributos nescessarios para o orçamento.
    }
    private void limparCamposCEmpresas(){
        tfIdDaEmpresa.clear();
        tfNomeDaEmpresa.clear();
        tfEstadoDaEmpresa.clear();
        tfCnpjDaEmpresa.clear();
    }
    public void cadastrarClicado(Event e){
        try{
            //desabilitarBotoes(false, true);
            
            //int idEmpresa= Integer.parseInt(tfIdDaEmpresa);// = id_gerado_pelo_banco_de_dados
            String nomeDaEmpresa = tfNomeDaEmpresa.getText();
            // outros atributos da  interface na aba de cadastrar equipaamentos.
        
                 
            //chama um metodo do banco de dados para salvar equipamento.
            //obs: id sera atribuido pelo banco de dados:
            
            //fazendo um for que vai varrer a lista colocando os id's:
            for (int i=1; i <= listaEmpresas.size();i++){
                Empresa empresa = new model.Empresa(i, nomeDaEmpresa);
            
                listaEmpresas.add(empresa);
            }
            
            limparCamposCEmpresas();  
            
        }
        catch(Exception error){
            new Alert(AlertType.ERROR, "Erro ao Cadastrar: "+error.getMessage()).show();
            
        }
          
    }
    public void cancelarCEmpresas(Event e){
        limparCamposCEmpresas();
    }
    public void delCEmpresas(Event e){
        //colocar o mesmo codigo onde a gente seleciona uma empresa cadastrada na lista e deleta/exclui ela do banco de dados
    }
    
    //--------------------------------VIsualizar Orçamentos -------------------------------------
    public void gerarOrcamento(Event e){
        if(identficaAdmin() == true){
            visibilidadeAdm();
            //aqui vai permitir com que ele acesse os outros textfields e as opçoes que so os engenheiros(admin) podem ver.
            
        }
        
        // vai chamar metodos para pegar as informações enviadas pelo engenheiro e printa-las no campoDeTexto
        // vai ultilizar o codigo do menubutton para selecionar qual empresa ele vai querer.
    
        
    }
    //colocar um mesmo metodo para menuButton empresas, soque desta vez referenciar com gerar orçamento
    /* public void botaoSalvarClicadoVisu(Event e){
    /*    //botao apenas do admin
     *      pega os dados dos textfields , guardam em uma variavel e envia para o banco de dados (instanciando um orçamento)
     *      }
     */
    
}

    
