package atividade3;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Atividade3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nome;
        System.out.print("Digite seu nome: ");
        nome = input.nextLine();
        
        int idade;
        System.out.print("Digite sua idade: ");
        idade = Integer.valueOf(input.nextLine());
        
        float peso;
        System.out.print("Digite seu peso: ");
        peso = Float.parseFloat(input.nextLine());
        
        char genero;
        System.out.print("Digite seu genero F ou M: ");
        genero = input.nextLine().charAt(0);
        
        boolean matriculado;
        System.out.print("Falso ou Verdadeiro V ou F: ");
        matriculado = Boolean.parseBoolean(input.nextLine());
        
        
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(peso);
        System.out.println(genero);
        System.out.println(matriculado);
        
    }
    
}
