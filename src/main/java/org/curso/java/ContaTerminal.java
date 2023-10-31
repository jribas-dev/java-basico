package org.curso.java;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBanco conta = new ContaBanco();

        System.out.println("Por favor, digite o número da Agência:");
        conta.setAgencia(sc.next());
        System.out.println("Por favor, digite o número da Conta:");
        conta.setNumeroConta(Integer.parseInt(sc.next()));
        System.out.println("Agora, informe o nome do Cliente:");
        conta.setNomeCliente(sc.next());
        System.out.println("Informe o saldo da conta:");
        conta.setSaldoCliente(Double.parseDouble(sc.next()));

        System.out.println(conta);
        sc.close();
    }
}