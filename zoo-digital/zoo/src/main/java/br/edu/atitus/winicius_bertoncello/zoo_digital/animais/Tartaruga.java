package br.edu.atitus.winicius_bertoncello.zoo_digital.animais;

import br.edu.atitus.winicius_bertoncello.zoo_digital.comportamentos.Nado;
import br.edu.atitus.winicius_bertoncello.zoo_digital.especies.Reptil;

public class Tartaruga extends Reptil implements Nado {

    public Tartaruga(String nome, Integer idade) {
        super(nome, idade, false);
    }

    @Override
    public void comer() {
        this.comer("algas e medusas");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está emitindo sons graves suaves!");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando calmamente no oceano!");
    }
}
