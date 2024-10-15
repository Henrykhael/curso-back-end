import java.util.Scanner;

public class tarefaWrappers {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("\n\nVamos transformar a sua variável númerica pra você\n\n");
        System.out.print("Digete o número que voicê deseja: ");
        long numero = s.nextLong();

        try {
            System.out.println("Iniciando operação...");

            Thread.sleep(3000);

        } catch (InterruptedException e) {
            System.err.println("A operação foi interrompida.");
        }

        Long numerozao = numero;

        System.out.println("\n Operação concluída!");

        System.out.println("Seu numero: "+ numerozao + " foi transformado e um Wrapper com sucesso !!");
    }
}
