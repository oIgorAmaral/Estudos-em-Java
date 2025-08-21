/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv1_poo;

public class Pessoa{
    private String nome;
    private int idade;
    private String cpf;
    private float altura;
    
    public Pessoa(String p_nome, int p_idade,  String p_cpf, float p_altura){
        this.nome = p_nome;
        this.idade = p_idade;
        this.cpf = p_cpf;
        this.altura = p_altura;
    } 
    
    /*
    Metodo que se APRESENTA
    */
    public void SeApresentar(){
    System.out.println("Olá, meu nome e: "+ nome + "e minha idade e:" + idade);
    }
    
    public String getNome(){
        return nome;
    }
}
