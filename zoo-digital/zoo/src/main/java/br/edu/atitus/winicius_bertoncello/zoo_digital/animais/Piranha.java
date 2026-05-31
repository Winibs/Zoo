package br.edu.atitus.winicius_bertoncello.zoo_digital.animais;

import br.edu.atitus.winicius_bertoncello.zoo_digital.comportamentos.Nado;
import br.edu.atitus.winicius_bertoncello.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.winicius_bertoncello.zoo_digital.especies.Peixe;

public class Piranha extends Peixe implements Nado, Predacao {

    public Piranha(String nome, Integer idade) {
        super(nome, idade, "Doce");
    }

    @Override
    public void comer() {
        this.comer("carne");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está borbulhando agressivamente!");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando em cardume no rio!");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando em bando no rio Amazonas.");
    }
}
