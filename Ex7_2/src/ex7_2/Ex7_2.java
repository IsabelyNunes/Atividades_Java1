/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7_2;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Ex7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float vCompra, desconto, vFinal;

        System.out.print("Digite o valor da compra: ");
        vCompra = Float.parseFloat(input.nextLine());

        if (vCompra >= 5000) {
            desconto = vCompra * 0.20f;
        } else {
            if (vCompra >= 3000 && vCompra <= 5000) {
                desconto = vCompra * 0.15f;
            } else {
                desconto = vCompra * 0.10f;
            }
        }

        vFinal = vCompra - desconto;

        System.out.println(desconto);

        System.out.println(vFinal);

    }
}
