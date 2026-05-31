package br.edu.atitus.winicius_bertoncello.zoo_digital.animais;

import br.edu.atitus.winicius_bertoncello.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.winicius_bertoncello.zoo_digital.especies.Ave;

public class Avestruz extends Ave implements Corrida {

    public Avestruz(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void comer() {
        this.comer("sementes e insetos");
    }

    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " está roncando!");
    }

    @Override
    public void correr() {
        System.out.println(this.getNome() + " está correndo a 70 km/h pela savana!");
    }
}
