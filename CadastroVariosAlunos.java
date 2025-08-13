import java.util.Scanner;

class Aluno {
    String nome;
    String matricula;
    int idade;
}

public class CadastroVariosAlunos {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Quantos alunos você deseja cadastrar? ");
        int quantidadeDeAlunos = ler.nextInt();
        ler.nextLine();

        Aluno[] listaDeAlunos = new Aluno[quantidadeDeAlunos];

        for (int i = 0; i < quantidadeDeAlunos; i++) {
            System.out.println("\n--- Cadastro do Aluno " + (i + 1) + " ---");

            listaDeAlunos[i] = new Aluno();

            System.out.print("Digite o nome do aluno: ");
            listaDeAlunos[i].nome = ler.nextLine();

            System.out.print("Digite a matrícula do aluno: ");
            listaDeAlunos[i].matricula = ler.nextLine();

            System.out.print("Digite a idade do aluno: ");
            listaDeAlunos[i].idade = ler.nextInt();
            ler.nextLine();
        }

        System.out.println("\n--- Lista de Alunos Cadastrados ---");
        for (int i = 0; i < listaDeAlunos.length; i++) {
            System.out.println("\nAluno " + (i + 1) + ":");
            System.out.println("  Nome: " + listaDeAlunos[i].nome);
            System.out.println("  Matrícula: " + listaDeAlunos[i].matricula);
            System.out.println("  Idade: " + listaDeAlunos[i].idade + " anos");
        }

        ler.close();
    }
}