package com.conversor.principal;

import com.conversor.servicos.ConversorApi;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    ConversorApi conversor = new ConversorApi();
    Scanner scanner = new Scanner(System.in);

    public void exibirMenu(){
        while (true) {
            System.out.println("""
             Escolha a conversão de moedas:
             1 - [USD] para [BRL]
             2 - [BRL] para [USD]
             3 - [EUR] para [BRL]
             4 - [BRL] para [EUR]
             5 - [USD] para [EUR]
             6 - [BRL] para [GBP]
             0 - Sair
             """);

            int escolha = scanner.nextInt();

            if (escolha == 0) {
                System.out.println("Saindo...");
                break;
            }

            System.out.println("Digite a quantidade a ser convertida:");
            double quantidade = scanner.nextDouble();


            try {
                double resultado = 0;
                switch (escolha) {
                    case 1:
                        resultado = conversor.converter("USD", "BRL", quantidade);
                        System.out.printf("%.2f USD é igual a %.2f BRL%n", quantidade, resultado);
                        break;
                    case 2:
                        resultado = conversor.converter("BRL", "USD", quantidade);
                        System.out.printf("%.2f BRL é igual a %.2f USD%n", quantidade, resultado);
                        break;
                    case 3:
                        resultado = conversor.converter("EUR", "BRL", quantidade);
                        System.out.printf("%.2f EUR é igual a %.2f BRL%n", quantidade, resultado);
                        break;
                    case 4:
                        resultado = conversor.converter("BRL", "EUR", quantidade);
                        System.out.printf("%.2f BRL é igual a %.2f EUR%n", quantidade, resultado);
                        break;
                    case 5:
                        resultado = conversor.converter("USD", "EUR", quantidade);
                        System.out.printf("%.2f USD é igual a %.2f EUR%n", quantidade, resultado);
                        break;
                    case 6:
                        resultado = conversor.converter("BRL", "GBP", quantidade);
                        System.out.printf("%.2f BRL é igual a %.2f GBP%n", quantidade, resultado);
                        break;
                    default:
                        System.out.println("Escolha inválida.");
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


