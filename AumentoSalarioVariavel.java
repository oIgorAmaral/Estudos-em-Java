import java.util.Scanner;

public class AumentoSalarioVariavel {
    public static void calcular(Scanner scanner) {
        System.out.println(">> Opção 5: Aumento e novo salário com percentual variável <<");
        System.out.print("Digite o salário atual: R$ ");
        double salario = scanner.nextDouble();
        System.out.print("Digite o percentual de aumento (ex: 15 para 15%%): ");
        double percentual = scanner.nextDouble();
        double valorAumento = salario * (percentual / 100.0);
        double novoSalario = salario + valorAumento;
        System.out.printf("\nRESULTADO:\nValor do aumento: R$ %.2f\n", valorAumento);
        System.out.printf("Novo salário: R$ %.2f\n", novoSalario);
    }
}