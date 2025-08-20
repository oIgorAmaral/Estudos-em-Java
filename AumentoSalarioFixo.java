import java.util.Scanner;

public class AumentoSalarioFixo {
    public static void calcular(Scanner scanner) {
        System.out.println(">> Opção 4: Novo salário com aumento de 25% <<");
        System.out.print("Digite o salário atual: R$ ");
        double salarioAtual = scanner.nextDouble();
        double novoSalario = salarioAtual * 1.25;
        System.out.printf("\nRESULTADO: O novo salário será de: R$ %.2f\n", novoSalario);
    }
}