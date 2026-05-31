package br.edu.atitus.winicius_bertoncello.zoo_digital.animais;

import br.edu.atitus.winicius_bertoncello.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.winicius_bertoncello.zoo_digital.comportamentos.Nado;
import br.edu.atitus.winicius_bertoncello.zoo_digital.especies.Reptil;

public class Iguana extends Reptil implements Corrida, Nado {

    public Iguana(String nome, Integer idade) {
        super(nome, idade, false);
    }

    @Override
    public void comer() {
        this.comer("folhas e frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está bufando!");
    }

    @Override
    public void correr() {
        System.out.println(this.getNome() + " está correndo pelas rochas!");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando no rio para escapar de predadores!");
    }
}
