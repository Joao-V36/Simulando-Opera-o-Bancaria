package Desafio1;

import java.util.Scanner;
public class OperacaoBancaria {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double saldo = 0;
        double saque;
        System.out.println("Bem Vindo ao bando Dio.me !!");
        System.out.println("Vamos iniciar seu atendimento ... " + "Tecle o numero da operação que deseja realizar: ");
        while (true) {
            System.out.println("(1):Depósito , (2):Saque , (3):Consultar Saldo , (0):Encerrar");
            int opcao = ler.nextInt();
            switch (opcao){
                case 1:{
                    System.out.println("Insira o valor que deseja deposita: ");
                    saldo = ler.nextDouble();
                    break;
                }
                case 2:{
                    System.out.println("Informe o valor que deseja sacar: ");
                    saque = ler.nextDouble();
                    if (saque > 0 && saque <= saldo ){
                        System.out.println("Saque Realizado com Sucesso !!");
                        saldo = saldo - saque;
                }
                    else {
                        System.out.println("Saldo insuficiênte");
                    }
                    break;
                }
                case 3:{
                    System.out.println("Seu saldo Atual é de R$: " + saldo);
                    break;
                }
                case 0:{
                    System.out.println("Atendimento Encerrado !!");
                    ler.close();

                    return;
                }
                default:
                    System.out.println("Opção Inválida. Tente Novamente.");

            }

        }


    }
}
