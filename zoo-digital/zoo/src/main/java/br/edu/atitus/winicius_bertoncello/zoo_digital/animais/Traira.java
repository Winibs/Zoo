package br.edu.atitus.winicius_bertoncello.zoo_digital.animais;

import br.edu.atitus.winicius_bertoncello.zoo_digital.comportamentos.Nado;
import br.edu.atitus.winicius_bertoncello.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.winicius_bertoncello.zoo_digital.especies.Peixe;

public class Traira extends Peixe implements Nado, Predacao {

    public Traira(String nome, Integer idade) {
        super(nome, idade, "Doce");
    }

    @Override
    public void comer() {
        this.comer("lambaris");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está borbulhando!");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando no rio!");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando lambaris nas margens do rio.");
    }
}
