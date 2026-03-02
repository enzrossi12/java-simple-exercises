package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados nao primitivos: String, Array, Class, enum
        * Objetivo: criar um ninja e atribuir metodos a ele.
        * */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // vai colocar tudo em capslock
        System.out.println("Esse texto esta em CAPSLOCK: "+ nomeUpperCase);
        System.out.println("Esse texto esta normal: " + nome);

        String aldeia = "Aldeia da Folha";
        String aldeiaLowerCase = aldeia.toLowerCase(); // vai colocar tudo em minusculo
        System.out.println("Esse texto esta tudo em minusculo: " + aldeiaLowerCase);

    }
}
