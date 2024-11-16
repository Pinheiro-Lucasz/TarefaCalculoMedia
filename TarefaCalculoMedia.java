public class TarefaCalculoMedia {

    public static void main(String args[]){
        operacaoMedia();
    }

    private static void operacaoMedia() {
        System.out.println("**** Média notas ****");
        int nota1 = 70;
        int nota2 = 30;
        int nota3 = 50;
        double nota4 = 8.5;

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println(media);
    }
}
