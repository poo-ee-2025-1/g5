package model;


/**
 * Escreva uma descrição da classe UsuarioAdm aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Admins extends Usuario
{   
    public Admins(String nome, String email, String aSenha){
        this.nome =nome;
        this.email =email;
        this.aSenha= aSenha;
    }
}