import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("1 - Cº -> F");
        System.out.println("2 - Cº -> K");
        //menu simples
        String pergunta;

        do {
            System.out.print("Digite qual tipo de conversão você quer efetuar: ");
            double ctrlvar = teclado.nextDouble();
            //usuario escolhe quais das operações disponiveis ele quer realizar
            if (ctrlvar == 1) {
                System.out.print("Digite a temperatura: ");
                double C = teclado.nextDouble();
                double conversao = C * 1.8 + 32;
                System.out.println("O resultado é: " + conversao + " F");
            } else if (ctrlvar == 2) {
                System.out.print("Digite a temperatura: ");
                double C = teclado.nextDouble();
                double conversao = C + 273.15;
                System.out.println("O resultado é: " + conversao + " K");
                //caso ele escolha uma opção indisponivel entra no else
            } else
                System.out.println("Opção invalida.");
            System.out.print("Gostaria de tentar novamente ? [s/y] ");
            pergunta = teclado.next();
        } while (pergunta.equals("s"));
        System.out.println("Fim do programa. ");
    }
}
//teste