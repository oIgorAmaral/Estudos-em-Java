import java.util.Scanner;

public class CalculadoraUniversal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Calculadora Universal ---");
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Somar 4 números inteiros");
            System.out.println("2 - Calcular Média Aritmética de 3 notas");
            System.out.println("3 - Calcular Média Ponderada");
            System.out.println("4 - Calcular novo salário com aumento de 25%");
            System.out.println("5 - Calcular aumento e novo salário com percentual variável");
            System.out.println("6 - Calcular salário a receber (com gratificação e imposto)");
            System.out.println("0 - Sair do programa");
            System.out.print("Digite a opção desejada: ");

            opcao = scanner.nextInt();
            System.out.println("----------------------------------\n");

            switch (opcao) {
                case 1:
                    // Chama o método da classe SomaQuatroNumeros
                    SomaQuatroNumeros.calcular(scanner);
                    break;
                case 2:
                    // Chama o método da classe MediaAritmetica
                    MediaAritmetica.calcular(scanner);
                    break;
                case 3:
                    // Chama o método da classe MediaPonderada
                    MediaPonderada.calcular(scanner);
                    break;
                case 4:
                    // Chama o método da classe AumentoSalarioFixo
                    AumentoSalarioFixo.calcular(scanner);
                    break;
                case 5:
                    // Chama o método da classe AumentoSalarioVariavel
                    AumentoSalarioVariavel.calcular(scanner);
                    break;
                case 6:
                    // Chama o método da classe SalarioLiquido
                    SalarioLiquido.calcular(scanner);
                    break;
                case 0:
                    System.out.println("Encerrando o programa. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha um número de 0 a 6.");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}