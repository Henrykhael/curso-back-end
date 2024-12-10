package br.com.phcs;

public class PessoaFisica extends Pessoa implements Comparable<PessoaFisica>  {

    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public int compareTo(PessoaFisica humano) {return this.getNome().compareTo(humano.getNome());}
}
