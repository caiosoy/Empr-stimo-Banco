package Empre;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o seu salário: ");
        double salario = sc.nextDouble();
        System.out.println("Insira o valor dos descontos: ");
        double descontos = sc.nextDouble();
        System.out.println("Insira o valor do empréstimo: ");
        double emprestimo = sc.nextDouble();
// ira encontrar o valor líquido do salário
        double líquido = salario - descontos;


// irá realizar o cálculo do valor máximo do empréstimo
        double vlemprestimo = líquido * 0.30;
// irá verificar se o valor do empréstimo solicitado e menor ou igual ao valor máximo permitido
        if (emprestimo <= vlemprestimo) {
            System.out.println("Empréstimo Aprovado!");
        } else {
            System.out.println("Empréstimo Reprovado!");
        }
        sc.close();

    }
}
