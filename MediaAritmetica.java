import java.util.Scanner;

public class MediaAritmetica {
    public static void calcular(Scanner scanner) {
        System.out.println(">> Opção 2: Média Aritmética de 3 notas <<");
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("\nRESULTADO: A média aritmética é: %.2f\n", media);
    }
}