import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Leitor = new Scanner(System.in);

        System.out.println("Digite valor de N1: ");
        int n1 = Leitor.nextInt();

            System.out.println("Digite valor de N2: ");
        int n2 = Leitor.nextInt();

        System.out.println("Digite valor de N3: ");
        int n3 = Leitor.nextInt();

        System.out.println("Digite valor de N4: ");
        int n4 = Leitor.nextInt();

        int soma = n1 + n2 + n3+ n4;

        System.out.println("A soma dos valores é: " + soma);

    }
}
