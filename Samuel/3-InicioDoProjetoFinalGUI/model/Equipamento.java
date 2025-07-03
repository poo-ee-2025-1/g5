package model;


/**
 * Escreva uma descrição da classe Equipamento aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Equipamento
{
    private String nome;
    private String categoria;
    private double periodos_de_uso;
    private double tempo_de_uso;
    private int potencia;
    private int fator_de_potencia;
    private String setor;
    private int data_aquisicao;
    private String certificacao;
    private String vida_util;
    
    private Empresa empresa; // Atributo para associar à empresa
    //Construtor :
    public Equipamento(String nome , String categoria , Empresa empresa)//todos os outros atributos
    {
        this.nome=nome;
        this.categoria =categoria;
        this.empresa = empresa;
        
    }
    // metodos getters e setters para todos os atributos:
    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}