import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("1 - Cº -> F");
        System.out.println("2 - Cº -> K");
        System.out.println("Digite qual tipo de conversão você quer efetuar: ");
        double ctrlvar = teclado.nextDouble();
        if (ctrlvar == 1) {
            System.out.println("Digite a temperatura: ");
            double C = teclado.nextDouble();
            double conversao = C * 1.8 + 32;
            System.out.println("O resultado é: " + conversao);

        }
    }
}
