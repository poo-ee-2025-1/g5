
## Tela de Login
   - A seguir montei o designe da tela de login ,do aplicativo do projeto, baseando no exemplo passado pelo professor em tutorials. Montando assim a tela de login e de cadastro , onde o cliente vai se cadastrar/logar e vai ter uma autentificaçao validada e terá um id unico no qual servirá para identifica-lo.

### Tela de login:
   - A principio esta sera a tela de login : onde o codigo vai pegar os textos inseridos no email e senha e vai varrer o banco de dados para achar a dupla email,senha que corresponde aos inseridos.

![Tela_de_login](https://github.com/user-attachments/assets/a5d9b931-a415-452b-ba56-c344cc6db9d0)


### Tela de cadastro:

   - A principio a tela de cadastro nao tem muita diferença ou avanço, pretende-se colocar um mecanismo de cadastro com cofirmar senha, mas nao ha muita nescessidade agora , por causa do tempo para o projeto.No cadastro ele vai pegar os emails e senhas cadastradas aqui no campos da interface e vai instanciar uma classe de usuario (ou comum ou admim) e vai salvar no banco de dados.
   
![Tela_de_cadastro](https://github.com/user-attachments/assets/f54a4f63-9038-47f3-a79c-ec8c4b4ec03e)

### Tela de cadastrar Equipamentos:
   - Aqui vai ter o botao de selecionar qual empresas ele queira adicionar os respectivos equipamentos( na empresa que ele cadastrou em cadastro de empresas), ele vai ter que inserir todas essas informações para que o engenheiro possa fazer o orçamento.Tem uma tela de visualização dos equipamentos cadastrados, e tem os botoes com suas funcionalidades, o botao add vem de adicionar, que serve pra dar inicio ao cadastro de equipamentos, atualizar é um botao acessivel apenas para engenheiro(adm) no qual ele vai poder pegar as informações do equipamento ,cadastrado pelo usuario comum em uma empresa , e atulaizar da meneira que ele acha melhor em relaçao a eficiencia energetica e vai mandar esses dados atualizados para o orçamento.(obs Equipamentos vai ser uma classe, com suas informaçoes sendo seus atributos); remover sendo um botão para remover um equipamento; cancelar, para deixar de cadastrar o equipamento e Salvar servira para salvar o equipamento cadastrado no banco de dados e instanciar essa classe equipamento.

![teladecadastequipa](https://github.com/user-attachments/assets/1aa359c6-c198-4194-a280-9bd79b8ff86a)

### Tela de cadastrar Empresas:
 - Essa tela vai servir para o cliente cadastrar a sua empresa, (que tambem vai ser outra classe, que vao ter as informaçoes como atributos) aqui vai monstrar um ID, da empresa , onde ela vai ser identificada, para melhor trabalho do engenheiro ao procurar. Com 3 botoes:
 * Cancelar: vai cancelar o cadastro da empresa.
 * Deletar: vai excluir os dados e a empresa.
 * Cadastrar: que vai instanciar essa empresa e salvar no banco de dados.
   
![teladecadastrempresas](https://github.com/user-attachments/assets/cfad2870-ead9-4aaf-96e4-50d6515b4002)

### Visualizar Orçamento:
- Na tela de visualizar orçamento ,coloquei um botao para selecionar empresas, em que o cliente selecionara a empresa na qual quer receber seu orçamento, entao essa caixa em branca do lado vai exibir o orçamento com todas as informaçoes, logo o cliente nao consegue editar nem escrever nada nessa caixa, ja o Engenheiro(ADM) consegue e sera ali onde ele montara orçamento da empresa que ele selecionar. Por enquanto nao esta tudo formulado e ainda faltam alguns botoes para o engenheiro, caso essa opção nao de certo optaremos por criar outra aba onde o engenheiro podera criar o orçamento e assim ele enviara esse orçamento para a aba VIzualizar orçamento.
- 
![teladevisualizar](https://github.com/user-attachments/assets/9d6e6d16-4cc9-4590-b438-eb97658e8d04)

