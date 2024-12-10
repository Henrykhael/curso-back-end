package br.com.phcs;

// import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;

public class programa {

    public static void  main(String[] args){
        Set<PessoaFisica> listaPessoaFisica = new TreeSet<>();
        Set<PessoaJuridica> listaPessoaJuridica = new TreeSet<>();

        boasVindas(listaPessoaFisica, listaPessoaJuridica);
    }

    public static void boasVindas(Set<PessoaFisica> listaPessoaFisica, Set<PessoaJuridica> listaPessoaJuridica){

        Scanner s = new Scanner(System.in);
        String opcao;

        System.out.println("\n\n *** Bem vindo ao cadastro de Clientes *** \n\n");

        do{
            System.out.println("*** Escolha qual o tipo de cadastro que vamos realizar ***");
            System.out.println("1 - Cadastrar Pessoa física");
            System.out.println("2 - Cadastrar Pessoa Jurídica");
            System.out.print("Opção: ");

            opcao = s.nextLine();

            switch (opcao) {
                case "1":
                    cadastrarPessoaFisica(listaPessoaFisica);
                    break;
                case "2":
                    cadastrarPessoaJuridica(listaPessoaJuridica);
                    break;
                default:
                System.out.println("\n\n\n ***>>>> Escolha uma das opções corretas <<<<*** \n\n");
            }

        }while(!"1".equalsIgnoreCase(opcao) && !"2".equalsIgnoreCase(opcao));

        s.close();
    }

    public static void cadastrarPessoaFisica(Set<PessoaFisica> listaPessoaFisica){

        Scanner s = new Scanner(System.in);
        String nome;
        String cpf;
        String cadastroFisico;

        do{

            System.out.println("\nPara cadastrar uma pessoa física vamos precisar de alguns dados");


            do{
                System.out.print("Nome: ");
                nome = s.nextLine();

                if(!nome.chars().allMatch(c -> Character.isLetter(c) || c == ' ')){
                    System.out.println("\n\n>>>*** Ainda não existem nomes de pessoas com números ou caracteres especiais ***<<<");
                    System.out.println("\n   >>>*** Digite apenas letras XD ***<<<");
                }

            }while(!nome.chars().allMatch(c -> Character.isLetter(c) || c == ' '));

            do {
                System.out.print("CPF: ");
                cpf = s.nextLine();

                if (cpf.length() != 11 || !cpf.chars().allMatch(Character::isDigit)) {
                    System.out.println("CPF inválido! Digite exatamente 11 números.");
                }

            }while(cpf.length() != 11 || !cpf.chars().allMatch(Character::isDigit));

            do{
                System.out.println("Você deseja cadastrar mais Pessoas físicas ?\n" +
                        "1 - Sim\n" +
                        "2 - Não");
                System.out.print("Opção: ");
                cadastroFisico = s.nextLine();

                if(!cadastroFisico.equals("1") && !cadastroFisico.equals("2")){
                    System.out.println("\n\n\n ***>>>> Escolha uma das opções corretas <<<<*** \n\n");
                }
            }while(!cadastroFisico.equals("1") && !cadastroFisico.equals("2"));

            listaPessoaFisica.add(new PessoaFisica(nome, cpf));
        }while("1".equalsIgnoreCase(cadastroFisico));

        s.close();
    }

    public static void cadastrarPessoaJuridica(Set<PessoaJuridica> listaPessoaJuridica){
        Scanner s = new Scanner(System.in);
        String nome;
        String cnpj;
        String cadastroJuridico;

        do{

            System.out.println("\nPara cadastrar uma pessoa Jurídica vamos precisar de alguns dados");


            do{
                System.out.print("Nome: ");
                nome = s.nextLine();

                if(!nome.chars().allMatch(c -> Character.isLetter(c) || c == ' ')){
                    System.out.println("\n\n>>>*** Ainda não existem nomes de pessoas com números ou caracteres especiais ***<<<");
                    System.out.println("\n   >>>*** Digite apenas letras XD ***<<<");
                }

            }while(!nome.chars().allMatch(c -> Character.isLetter(c) || c == ' '));

            do {
                System.out.print("CNPJ: ");
                cnpj = s.nextLine();

                if (cnpj.length() != 11 || !cnpj.chars().allMatch(Character::isDigit)) {
                    System.out.println("CPF inválido! Digite exatamente 11 números.");
                }

            }while(cnpj.length() != 11 || !cnpj.chars().allMatch(Character::isDigit));

            do{
                System.out.println("Você deseja cadastrar mais Pessoas físicas ?\n" +
                        "1 - Sim\n" +
                        "2 - Não");
                System.out.print("Opção: ");
                cadastroJuridico = s.nextLine();

                if(!cadastroJuridico.equals("1") && !cadastroJuridico.equals("2")){
                    System.out.println("\n\n\n ***>>>> Escolha uma das opções corretas <<<<*** \n\n");
                }
            }while(!cadastroJuridico.equals("1") && !cadastroJuridico.equals("2"));

            listaPessoaJuridica.add(new PessoaJuridica(nome, cnpj));
        }while("1".equalsIgnoreCase(cadastroJuridico));

        s.close();
    }
}