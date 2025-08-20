import java.util.Scanner;

public class SomaQuatroNumeros {
    public static void calcular(Scanner scanner) {
        System.out.println(">> Opção 1: Soma de 4 números inteiros <<");
        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int n3 = scanner.nextInt();
        System.out.print("Digite o quarto número: ");
        int n4 = scanner.nextInt();
        int soma = n1 + n2 + n3 + n4;
        System.out.println("\nRESULTADO: A soma dos quatro números é: " + soma);
    }
}