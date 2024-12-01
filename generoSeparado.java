package br.com.phcs;

import br.com.phcs.domain.Convidado;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class generoSeparado {

    public static void main(String[] args){

        System.out.println("\n \n *** Criação de lista de convidados ***  \n");
        System.out.println("** Vamos precisar confirmar o nomes dos convidados seguidos do genero**");

        criaLista();

    }

    public static void criaLista(){

        Scanner s = new Scanner(System.in);
        String more;

        List<Convidado> listaMasculina = new ArrayList<>();
        List<Convidado> listaFeminina = new ArrayList<>();

        do{

            System.out.print("\nDigite o nome do convidado: ");
            String nome = s.nextLine();

            String genero;

            do{
                System.out.print("Digite o genero do convidado (M / F): ");
                genero = s.nextLine().trim();

                if(!"m".equalsIgnoreCase(genero) && !"f".equalsIgnoreCase(genero)){
                    System.out.print("\nÉ preciso informar uma das opções corretas. \n");
                }
            }while(!"m".equalsIgnoreCase(genero) && !"f".equalsIgnoreCase(genero));

            if ("m".equalsIgnoreCase(genero)) {
                listaMasculina.add(new Convidado(nome, genero));
            } else {
                listaFeminina.add(new Convidado(nome, genero));
            }

            do{
                System.out.print("\n Cadastrar mais convidados? (S / N): ");
                more = s.nextLine().trim();

                if(!"s".equalsIgnoreCase(more) && !"n".equalsIgnoreCase(more)){
                    System.out.print("\nÉ preciso informar uma das opções corretas \n");
                }
            }while(!"s".equalsIgnoreCase(more) && !"n".equalsIgnoreCase(more));

        }while("s".equalsIgnoreCase(more));

        s.close();


        Collections.sort(listaMasculina);
        System.out.println("\nLista de Convidados Masculinos:");
        for (Convidado homens : listaMasculina) {
            System.out.println(homens);
        }

        Collections.sort(listaFeminina);
        System.out.println("\nLista de Convidados Femininos:");
        for (Convidado mulheres : listaFeminina) {
            System.out.println(mulheres);
        }
    }
}