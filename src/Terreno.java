import java.util.Scanner;

public class Terreno {

//    Classe para calcular a area de um espaço em específico

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("\n \n Vamos medir o tamanho dos seus sonhos ?\n \n");
        System.out.println("Qual a largura do seu terreno: ");
        int largura = s.nextInt();
        System.out.println("Qual a profundidade do seu terreno: ");
        int profundidade = s.nextInt();
        s.close();

        calculaAreaDoTerreno(largura, profundidade);

    }

    public static void calculaAreaDoTerreno (int largura, int profundidade) {
        int area = largura * profundidade;
        System.out.println("O tamanho do seu terreno é: "+ area);
    }
}
