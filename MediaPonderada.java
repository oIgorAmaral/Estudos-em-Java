import java.util.Scanner;

public class MediaPonderada {
    public static void calcular(Scanner scanner) {
        System.out.println(">> Opção 3: Média Ponderada <<");
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite o peso da primeira nota: ");
        double peso1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite o peso da segunda nota: ");
        double peso2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Digite o peso da terceira nota: ");
        double peso3 = scanner.nextDouble();

        double somaNotasPonderadas = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
        double somaPesos = peso1 + peso2 + peso3;
        double mediaPonderada = somaNotasPonderadas / somaPesos;
        System.out.printf("\nRESULTADO: A média ponderada é: %.2f\n", mediaPonderada);
    }
}