package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCase {
    public static void main(String[] args) {
        /*
        *
        * SwitchCases: Que servem para gerar casos especificos
        * Objetivo: Pedir pro usuario escolher entre os Ninjas
        * switchCase
        * */

        Scanner scanner = new Scanner(System.in);

        //Opcoes para o usuario escolher
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        //Pedir para o usuario escolher uma das opcoes
        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Voce digitou o numero: " + escolhaDoUsuario);

        //Reacao ao escolher um personagem

        switch (escolhaDoUsuario){
            case 1:
                System.out.println("O usuario escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuario escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("O usuario escolheu a Sakura Haruno");
                break;
            default:
                System.out.println("Você não digitou uma resposta valida, tente novamente!");
        }
    }
}
