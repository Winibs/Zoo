package br.edu.atitus.winicius_bertoncello.zoo_digital.animais;

import br.edu.atitus.winicius_bertoncello.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.winicius_bertoncello.zoo_digital.especies.Reptil;

public class Cobra extends Reptil implements Predacao {

    public Cobra(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        this.comer("roedores");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está sibilando!");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando usando seu veneno.");
    }
}
