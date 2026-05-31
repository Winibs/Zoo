package br.edu.atitus.winicius_bertoncello.zoo_digital.animais;

import br.edu.atitus.winicius_bertoncello.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.winicius_bertoncello.zoo_digital.comportamentos.Nado;
import br.edu.atitus.winicius_bertoncello.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.winicius_bertoncello.zoo_digital.especies.Mamifero;

public final class Cachorro extends Mamifero implements Corrida, Nado, Predacao {

    public Cachorro(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        this.comer("ração");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está latindo!");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando estilo cachorrinho!");
    }

    @Override
    public void correr() {
        System.out.println(this.getNome() + " está correndo por todo o pátio!");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando a meia que roubou.");
    }
}
