package br.edu.atitus.winicius_bertoncello.zoo_digital.animais;

import br.edu.atitus.winicius_bertoncello.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.winicius_bertoncello.zoo_digital.comportamentos.Nado;
import br.edu.atitus.winicius_bertoncello.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.winicius_bertoncello.zoo_digital.especies.Reptil;

public class Crocodilo extends Reptil implements Nado, Corrida, Predacao {

    public Crocodilo(String nome, Integer idade) {
        super(nome, idade, false);
    }

    @Override
    public void comer() {
        this.comer("grandes presas");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está rosnando ameaçadoramente!");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando silenciosamente pelo rio!");
    }

    @Override
    public void correr() {
        System.out.println(this.getNome() + " está correndo em direção à sua presa!");
    }

    @Override
    public void cacar() {
        System.out.println(this.getNome() + " está caçando à espreita às margens do rio.");
    }
}
