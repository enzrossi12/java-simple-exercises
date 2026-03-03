package Condicoes;

public class IfElse {
    public static void main(String[] args) {

        /*
         * IF e ELSE - Condicoes
         * Objetivo: passar o ninja de nivel de acordo com o numero de missoes
         * */


        //Ninja naruto
        String nome = "Naruto Uzumaki";
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 9;
        String rank;

        //se (condicao) {faca isso}


        if (numeroDeMissoes >= 10 && idade > 14){
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20){
            System.out.println("Rank:Jounin");
        }
        else {
            System.out.println("Rank: Gennin");
        }

    }
}

