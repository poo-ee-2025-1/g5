
# Sobre a parte 3

## da interface grafica do nosso sistema de eficiencia energetica 

Este código é parte de uma aplicação JavaFX usando a arquitetura MVC (Model-View-Controller).
O **Controller1** é o controlador responsável por ligar a interface gráfica com a lógica do programa.

## O que o código faz

### 1. **Login e Registro**
- Permite que o usuário **faça login** e **registre uma conta** com email e senha.
- Após o login, o usuário pode ver outras abas da aplicação. Foi se ultilizado um metodo que atribuia valores booleanos para a "visibilidade" das abas.
![Captura de tela 2025-07-02 214854](https://github.com/user-attachments/assets/3bac70a6-66c2-43b6-a5e5-4d4f42404ba5)

### 2. **Cadastrar Empresas**

- O usuário pode **cadastrar uma empresa** informando nome, estado e CNPJ.
- As empresas cadastradas aparecem em um menu suspenso (MenuButton).
![Captura de tela 2025-07-02 144929](https://github.com/user-attachments/assets/fb8ba84e-b9eb-4f7f-9943-89e2a0202809)
- em que esse menu tem o codigo em que permite a conexao de empresas com os equipamentos , instanciando-os.
![Captura de tela 2025-07-02 220032](https://github.com/user-attachments/assets/075b55f0-76f8-4020-89af-2e52168a2e79)
- No qual ele recebe os conteudos dos textfield's e guardam numa variavel , e depois ele chama um metodo para instanciar um objeto empresa e guardaria no banco de dado. Usei como exemplo o for, no qual ele vai instanciando uma empresa e adicionando.
- 

### 3. **Cadastrar Equipamentos**
- Cada equipamento pertence a uma empresa. Tem o menuButton "Empresas", no qual o usuario deve selecionar uma empresa na qual ele queira cadastrar equipamentos.
  
![Captura de tela 2025-07-03 085634](https://github.com/user-attachments/assets/a3d2d652-d080-4dcc-92b6-35f75020e22a)
- aqui tem o codigo em que executa um alerta(aparece em um label da interface grafica) avisando que ele precisa selecionar uma empresa para poder cadastrar os equipamentos
- 
- O usuário tem que preencher vários campos como nome, categoria, tempo de uso, etc, para assim passar as informaçoes nescessarias dos equipamentos para o engenheiro fazer o orçamento com sucesso.
- Ao clicar em **Salvar**, o equipamento é salvo em uma lista.

  ![Captura de tela 2025-07-03 085944](https://github.com/user-attachments/assets/58b3b6ca-7cef-4ac7-aa06-889c4a1584e7)
  
  -  em salvar, ele desabilita os botoes novamente e  volta pro estado inicial( onde so o add é disponivel) , ele recebe o conteudo dos textfield em cada variavel
  -  logo depois ele instanci um equipamento com esses dados coletados, e teria que enviar esse equipamento para o banco de dados, coloquei como exemplo , ele enviando esse equipamento para uma lista (temporaria). 

- Existem também botões para **Adicionar**, **Atualizar**, **Remover** e **Cancelar**.

### 4. **Visualizar Orçamento**

Essas abas estaram visiveis e habilitadas apenas para adms.

![Captura de tela 2025-07-03 094250](https://github.com/user-attachments/assets/c771f2bf-8417-4b18-b48c-512a918c127a)

-  Aqui vai ter um botao de selecionar empresa semelhante ao botao de empresas (menuButton) la de cadastrar equipamentos . Apos essa seleçao , vai ter outro botao, agora o de gerar Orçamento no qual vai identificar se o usuario é comum ou admin, e depois dessa identificaçao ele vai atribuir a funçao de editar o campo de texto (caso seja Admin) e assim instanciar um objeto orçamento que vai ser salvo num banco de dados , e referenciado a empresa no qual ele selecionou.Ja para o usuario comum vai aparecer apenaso campo de texto sem que ele possa editar e o botao gerarOrçamento , no qual ele vai clicar e vai chamar do banco de dados , um orçamento gerado da empresa que ele selecionar(obs: esse orçamento vai ser o mesmo que o engenheiro fez, porem se o engenheiro ainda nao ter feito esse orçamento, vai aparecer uma mensagem dizendo que "ainda nao esta disponivel o orçamento".

   
![Captura de tela 2025-07-03 094340](https://github.com/user-attachments/assets/df5f1a39-b7e5-4e8f-92c5-698418d02240)
   

## Observação
- Alguns métodos estão vazios ou com partes comentadas — são espaços reservados para melhorias futuras. Poderiam ser arrumadas pórem o tempo para isso nao esta disponivel ,então isso pode ser uma melhora futura, para quando quisermos aprofundar nesse GUI,  projeto de interface grafica.
- Esse relatorio tem com objetivo de apenas apresentar as mudanças e ser simples.

  ## Possiveis melhorias:
  - Organização do codigo, por mais que eu tenha tentado nao deixar bagunçado , o codigo ainda nao esta organizado, isso prejudica e muito o trabalho entre equipes.Acredito que tem como organizar mais, como adicionando metodos que faziam atividades repetitivas e organizando os blocos de codigo em diferentes classificaçoes, como "codigo para o funcionamento geral", "Codigo para o funcionamento da Aba de registro e login".
  - Preencher todo o codigo que faltava, que so ia levar tempo.
  - Arrumar a aba de registrar, poderia colocar um confirmar senha que poderia verificar se a senha é a mesma.
---

Este controller é a ponte entre a **interface visual (View)** e os **dados (Model)**.
