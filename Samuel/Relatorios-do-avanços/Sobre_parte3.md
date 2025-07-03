
# Explicação Simples do Código Controller1

Este código é parte de uma aplicação JavaFX usando a arquitetura MVC (Model-View-Controller).
O **Controller1** é o controlador responsável por ligar a interface gráfica com a lógica do programa.

## O que o código faz

### 1. **Login e Registro**
- Permite que o usuário **faça login** e **registre uma conta** com email e senha.
- Após o login, o usuário pode ver outras abas da aplicação.
![Captura de tela 2025-07-02 214854](https://github.com/user-attachments/assets/3bac70a6-66c2-43b6-a5e5-4d4f42404ba5)

### 2. **Cadastrar Empresas**

- O usuário pode **cadastrar uma empresa** informando nome, estado e CNPJ.
- As empresas cadastradas aparecem em um menu suspenso (MenuButton).
- ![Captura de tela 2025-07-02 144929](https://github.com/user-attachments/assets/fb8ba84e-b9eb-4f7f-9943-89e2a0202809)
- em que esse menu tem o codigo em que permite a conexao de empresas com os equipamentos , instanciando-os.
- ![Captura de tela 2025-07-02 220032](https://github.com/user-attachments/assets/075b55f0-76f8-4020-89af-2e52168a2e79)


### 3. **Cadastrar Equipamentos**
- Cada equipamento pertence a uma empresa.
- O usuário pode preencher vários campos como nome, categoria, tempo de uso, etc.
- Ao clicar em **Salvar**, o equipamento é salvo em uma lista.
- Existem também botões para **Adicionar**, **Atualizar**, **Remover** e **Cancelar**.

## Observação
- Alguns métodos estão vazios ou com partes comentadas — são espaços reservados para melhorias futuras. Poderiam ser arrumadas pórem o tempo para isso nao esta disponivel ,então isso pode ser uma melhora futura, para quando quisermos aprofundar nesse GUI,  projeto de interface grafica.
- Esse relatorio tem com objetivo de apenas apresentar as mudanças e ser simples.
---

Este controller é a ponte entre a **interface visual (View)** e os **dados (Model)**.
