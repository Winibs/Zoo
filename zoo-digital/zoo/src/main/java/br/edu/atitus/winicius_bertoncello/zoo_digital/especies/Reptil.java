package br.edu.atitus.winicius_bertoncello.zoo_digital.especies;

public abstract class Reptil extends Animal {

    private Boolean venenoso;

    public Reptil(String nome, Integer idade, Boolean venenoso) {
        super(nome, "Réptil", idade);
        this.venenoso = venenoso;
    }

    public Boolean getVenenoso() {
        return venenoso;
    }

    public void setVenenoso(Boolean venenoso) {
        this.venenoso = venenoso;
    }

    public void termorregular() {
        System.out.println(this.getNome() + " está se aquecendo ao sol.");
    }
}
