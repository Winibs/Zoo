package br.edu.atitus.winicius_bertoncello.zoo_digital.animais;

import br.edu.atitus.winicius_bertoncello.zoo_digital.comportamentos.Nado;
import br.edu.atitus.winicius_bertoncello.zoo_digital.especies.Mamifero;

public final class Baleia extends Mamifero implements Nado {

    public Baleia(String nome, Integer idade) {
        super(nome, idade, false);
    }

    @Override
    public void comer() {
        this.comer("krill e pequenos peixes");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está cantando no oceano!");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando majestosamente no oceano!");
    }
}
