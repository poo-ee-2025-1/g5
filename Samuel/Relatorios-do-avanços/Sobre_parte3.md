
# Explicação Simples do Código Controller1

Este código é parte de uma aplicação JavaFX usando a arquitetura MVC (Model-View-Controller).
O **Controller1** é o controlador responsável por ligar a interface gráfica com a lógica do programa.

## O que o código faz

### 1. **Login e Registro**
- Permite que o usuário **faça login** e **registre uma conta** com email e senha.
- Após o login, o usuário pode ver outras abas da aplicação.

### 2. **Cadastrar Empresas**
- O usuário pode **cadastrar uma empresa** informando nome, estado e CNPJ.
- As empresas cadastradas aparecem em um menu suspenso (MenuButton).

### 3. **Cadastrar Equipamentos**
- Cada equipamento pertence a uma empresa.
- O usuário pode preencher vários campos como nome, categoria, tempo de uso, etc.
- Ao clicar em **Salvar**, o equipamento é salvo em uma lista.
- Existem também botões para **Adicionar**, **Atualizar**, **Remover** e **Cancelar**.

### 4. **Interface com o Usuário**
- O controller usa elementos do JavaFX como:
  - `TextField` (caixa de texto)
  - `Button` (botões)
  - `Tab` (abas)
  - `MenuButton` (menu com opções)
  - `TableView` (tabela de dados - comentada no momento)

### 5. **Outras Funções**
- Desativa ou ativa botões e abas dependendo das ações do usuário.
- Exibe alertas para o usuário com mensagens de sucesso ou erro.

## Lógica Interna
- Há listas (`listaEmpresas`, `listaEquipamentos`) que guardam os dados temporariamente.
- O código ainda não está totalmente ligado a um banco de dados, mas tem espaço para isso.

## Observação
- Alguns métodos estão vazios ou com partes comentadas — são espaços reservados para melhorias futuras.

---

Este controller é a ponte entre a **interface visual (View)** e os **dados (Model)**.
