package br.edu.atitus.winicius_bertoncello.zoo_digital.animais;

import br.edu.atitus.winicius_bertoncello.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.winicius_bertoncello.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.winicius_bertoncello.zoo_digital.especies.Mamifero;

public final class Lobo extends Mamifero implements Corrida, Predacao {

    public Lobo(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        this.comer("carne de cervos");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está uivando para a lua!");
    }

    @Override
    public void correr() {
        System.out.println(this.getNome() + " está correndo em matilha pela floresta!");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando em bando na floresta.");
    }
}
