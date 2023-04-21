import java.util.Scanner;

public class treino {
    public static void main (String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        int numAlunos = 5;
        double[] notaAlunos = new double[numAlunos];

        for (int i = 0; i < numAlunos; i++) {
            System.out.println("Digite a nota do " + (i+1) + " aluno");
            notaAlunos[i] = input.nextDouble();
        }

        for (int i = 0; i < numAlunos; i++) {
            System.out.println("NOTAS- " + (i+1) + " ALUNO " + notaAlunos[i]);
        }

        double soma = 0;
        for (int i = 0; i < numAlunos; i++) {
            soma += notaAlunos[i];
        }

        double media;
        for (int i = 0; i < 1; i++) {
            media = soma/numAlunos;
            System.out.printf("MÉDIA DA TURMA: %.2f", media);
        }
    }
}