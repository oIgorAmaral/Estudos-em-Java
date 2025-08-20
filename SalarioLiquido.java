import java.util.Scanner;

public class SalarioLiquido {
    public static void calcular(Scanner scanner) {
        System.out.println(">> Opção 6: Salário a receber <<");
        System.out.print("Digite o salário base: R$ ");
        double salarioBase = scanner.nextDouble();
        double gratificacao = salarioBase * 0.05;
        double imposto = salarioBase * 0.07;
        double salarioAReceber = salarioBase + gratificacao - imposto;
        System.out.printf("\nRESULTADO:\nSalário a Receber: R$ %.2f\n", salarioAReceber);
    }
}