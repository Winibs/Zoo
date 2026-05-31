package br.edu.atitus.winicius_bertoncello.zoo_digital.animais;

import br.edu.atitus.winicius_bertoncello.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.winicius_bertoncello.zoo_digital.comportamentos.Voo;
import br.edu.atitus.winicius_bertoncello.zoo_digital.especies.Ave;

public class Aguia extends Ave implements Voo, Predacao {

    public Aguia(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void comer() {
        this.comer("pequenos mamíferos");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está grasnando altivamente!");
    }

    @Override
    public void voar() {
        System.out.println(this.getNome() + " está planando sobre as montanhas!");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando em voo rasante sobre o campo.");
    }
}
