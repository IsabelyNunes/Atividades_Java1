/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7_3;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Ex7_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float vPagar;
        int idade;
        String nome;

        System.out.print("Digite o nome: ");
        nome = input.nextLine();

        System.out.print("Digite a idade ");
        idade = Integer.parseInt(input.nextLine());

        if (idade <= 10) {
            vPagar = 80;
        } else if (idade >= 10 && idade <= 30) {
            vPagar = 120;
        } else if (idade >= 30 && idade <= 45) {
            vPagar = 210;
        } else if (idade >= 45 && idade <= 60) {
            vPagar = 350;
        } else {
            vPagar = 450;
        }

        System.out.println(nome );
        System.out.println(vPagar );
    }
}
