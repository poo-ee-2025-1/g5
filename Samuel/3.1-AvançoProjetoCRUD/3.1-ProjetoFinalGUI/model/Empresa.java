package model;


/**
 * 
 * 
 * @author (Samuel_Lopes) 
 * 
 */
public class Empresa
{
    private int id;
    private String nome_da_empresa;
    private String estado;
    private int cnpj;
    //construtor simplificado:
    public Empresa(int id, String nome_da_empresa){
        this.id = id;
        this.nome_da_empresa = nome_da_empresa;
    }
    // metodos getters e setters para todos os atributos:
    public int getId(){
        return id;
    }
    
    public String getNome(){
        return nome_da_empresa;
    }
    public void setNome(){
        //caso precise
        
    }
}