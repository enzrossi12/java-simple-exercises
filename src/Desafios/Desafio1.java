package Desafios;

public class Desafio1 {
    public static void main(String[] args) {

        String nomeNinja1 = "Neji";
        int idade1 = 14;
        String nomeDaMissao1 = "Salvar naruto";
        char nivelDificuldade1 = 'A';
        boolean statusMissao1;

        String nomeNinja2 = "Obito";
        int idade2 = 16;
        String nomeDaMissao2 = "Destruir o mundo";
        char nivelDificuldade2 = 'S';
        boolean statusMissao2;

        String nomeNinja3 = "Sasuke";
        int idade3 = 13;
        String nomeDaMissao3 = "Matar o irmao";
        char nivelDificuldade3 = 'D';
        boolean statusMissao3;

        if (idade1 >= 15 || nivelDificuldade1 == 'C' || nivelDificuldade1 == 'D') {
            statusMissao1 = true;
        } else {
            statusMissao1 = false;
        }
        if (idade2 >= 15 || nivelDificuldade2 == 'C' || nivelDificuldade2 == 'D') {
            statusMissao2 = true;
        } else {
            statusMissao2 = false;
        }
        if (idade3 >= 15 || nivelDificuldade3 == 'C' || nivelDificuldade3 == 'D') {
            statusMissao3 = true;
        } else {
            statusMissao3 = false;
        }

        System.out.println(
                "Ninja: " + nomeNinja1 +
                "\nIdade: " + idade1 +
                "\nNome da Missao: " + nomeDaMissao1 +
                "\nNivel de Dificuldade: " + nivelDificuldade1 +
                "\nStatus: " + (statusMissao1 ? "concluída" : "não concluída"));

        System.out.println(
                "Ninja: " + nomeNinja2 +
                "\nIdade: " + idade2 +
                "\nNome da Missao: " + nomeDaMissao2 +
                "\nNivel de Dificuldade: " + nivelDificuldade2 +
                "\nStatus: " + (statusMissao2 ? "concluída" : "não concluída"));

        System.out.println(
                "Ninja: " + nomeNinja3 +
                "\nIdade: " + idade3 +
                "\nNome da Missao: " + nomeDaMissao3 +
                "\nNivel de Dificuldade: " + nivelDificuldade3 +
                "\nStatus: " + (statusMissao3 ? "concluída" : "não concluída"));

    }

}
