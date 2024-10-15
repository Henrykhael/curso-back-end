import java.util.Scanner;

public class tarefaControleDeFluxos {

        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);

            System.out.println("\n \n Verificação de média do aluno\n \n");
            System.out.println("Nome do Aluno: ");
            String aluno = s.nextLine();
            System.out.println("Qual a matéria que iremos caucular: ");
            String materia = s.nextLine();

            String[] perguntas = {
                    "Qual a nota do primeiro semestre em " + materia + ": ",
                    "Qual a nota do segundo semestre em " + materia + ": ",
                    "Qual a nota do terceiro semestre em " + materia + ": ",
                    "Qual a nota do quarto semestre em " + materia + ": "
            };

            int[] nota = new int[4];

            for (int i = 0; i < nota.length; i++) {
                System.out.print(perguntas[i]);
                nota[i] = s.nextInt();
            }

            int soma = 0;

            for (int n : nota) {
                soma = soma + n;
            }

            double media = (double) soma / nota.length;

            if(media > 7){
                System.out.println("O aluno " + aluno + " está aprovado com media: " + media + " na materia de " + materia + "." );
            }else if (media < 7 && media >= 5){
                System.out.println("O aluno " + aluno + " está em recuperação com media: " + media + " na materia de " + materia + "." );
            }else{
                System.out.println("O aluno " + aluno + " está reprovado com media: " + media + " na materia de " + materia + "." );
            }

        }
}
