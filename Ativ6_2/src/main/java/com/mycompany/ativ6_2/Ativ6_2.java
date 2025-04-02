/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ativ6_2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ativ6_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float n1, n2;

        System.out.print("n1: ");
        n1 = Float.parseFloat(input.nextLine());

        System.out.print("n2: ");
        n2 = Float.parseFloat(input.nextLine());

        if (n1 <= n2) {
            System.out.println(n2);
        } else {
            System.out.println(n1);
        }
    }
}
