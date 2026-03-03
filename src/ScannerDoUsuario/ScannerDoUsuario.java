package ScannerDoUsuario;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
        *
        * Scanner = É um jeito de trazer o usuario para dentro da aplicacoa
        * Objetivo: O usuario vai cirar um ninja e vamos validar os dados
        *
        * */

        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Escreva aqui o nome do seu ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: "+ nomeDoNinja);

        System.out.println("Escreva aqui a idade do seu ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do seu ninja é: " + idadeDoNinja);

        if (idadeDoNinja >= 18){
            System.out.println("Esse ninja já é maior de idade, pode ir para missoes fora da vila");
        } else {
            System.out.println("Esse ninja ainda é muito novo");
        }

        caixaDeTexto.close();
    }
}
