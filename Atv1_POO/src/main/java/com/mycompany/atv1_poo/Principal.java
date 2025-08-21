/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.atv1_poo;

public class Principal {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joao Baitola", 21, "123.456.789-00", 1.75f);
        Pessoa p2 = new Pessoa("Guilherminho", 19, "987.654.321-00", 1.80f);
        Pessoa p3 = new Pessoa("Maria Silva", 25, "111.222.333-44", 1.65f);

        // Exemplo de uso do método seApresentar()
        p1.SeApresentar();
        p2.SeApresentar();
        p3.SeApresentar();

        Carro c1 = new Carro("Honda Civic", 2017, "Amarelo");
        Carro c2 = new Carro("Motinha Biz", 1999, "Rosa");
        Carro c3 = new Carro("Carro Pika", 1944, "Vermelho e Preto");
        
        c1.qPropietario(p3);
        c2.qPropietario(p2);
        c3.qPropietario(p1);
    }
}
