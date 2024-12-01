package br.com.phcs.domain;

public class Convidado implements Comparable<Convidado>{

    private String nome;
    private String genero;

    public Convidado(String nome, String genero){
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome(){return nome;}
    public String getGenero() {return genero;}

    public String toString(){return "Nome: " + nome + "\nGênero: " + genero + "\n";}

    public int compareTo(Convidado outroConvidado) {return this.nome.compareTo(outroConvidado.getNome());}
}