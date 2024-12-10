package br.com.phcs;

public class PessoaJuridica extends Pessoa implements Comparable<PessoaJuridica>{

    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public int compareTo(PessoaJuridica juridica) {return this.getNome().compareTo(juridica.getNome());}
}
