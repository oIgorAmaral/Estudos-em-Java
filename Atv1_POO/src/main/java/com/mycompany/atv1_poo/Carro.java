/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv1_poo;

public class Carro{
    private String modelo;
    private int ano;
    private String cor;
    
    /* Método construtor */
    
    public Carro(String p_modelo, int p_ano,  String p_cor){
        this.modelo = p_modelo;
        this.ano = p_ano;
        this.cor = p_cor;
    } 
    
   public void qPropietario(Pessoa p){
    System.out.println("O proprietário do carro " + modelo + " é oh: " + p.getNome());
    }
}
