package br.edu.atitus.winicius_bertoncello.zoo_digital.animais;

import br.edu.atitus.winicius_bertoncello.zoo_digital.comportamentos.Nado;
import br.edu.atitus.winicius_bertoncello.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.winicius_bertoncello.zoo_digital.especies.Peixe;

public class Tubarao extends Peixe implements Nado, Predacao {

    public Tubarao(String nome, Integer idade) {
        super(nome, idade, "Salgada");
    }

    @Override
    public void comer() {
        this.comer("focas e peixes grandes");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está borbulhando silenciosamente!");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando velozmente pelo oceano!");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando sua presa com precisão.");
    }
}
