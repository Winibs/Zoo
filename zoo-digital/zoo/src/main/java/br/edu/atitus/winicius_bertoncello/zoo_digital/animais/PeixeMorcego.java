package br.edu.atitus.winicius_bertoncello.zoo_digital.animais;

import br.edu.atitus.winicius_bertoncello.zoo_digital.comportamentos.Nado;
import br.edu.atitus.winicius_bertoncello.zoo_digital.especies.Peixe;

public class PeixeMorcego extends Peixe implements Nado {

    public PeixeMorcego(String nome, Integer idade) {
        super(nome, idade, "Salgada");
    }

    @Override
    public void comer() {
        this.comer("pequenas algas");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está borbulhando!");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando tranquilamente!");
    }
}
