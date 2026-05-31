package br.edu.atitus.winicius_bertoncello.zoo_digital.especies;

public abstract class Animal {

    // Atributo estático - pertence à classe, compartilhado entre todas as instâncias
    private static int contador = 0;

    public static int getContador() {
        return contador;
    }

    public final String VERSAO_APP = "2.5";

    // Atributos
    private String nome;
    private String especie;
    private Integer idade;

    // Construtor
    public Animal(String nome, String especie, Integer idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        Animal.contador++;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    // Sobrecarga de método - Polimorfismo estático
    public void comer() {
        this.comer("alguma coisa");
    }

    // Método final - não pode ser sobrescrito
    public final void comer(String alimento) {
        System.out.println(this.getNome() + " está comendo " + alimento);
    }

    // Sobrescrita do toString herdado de Object - Polimorfismo dinâmico
    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "; Espécie: " + this.getEspecie() + "; Idade: " + this.getIdade() + " anos.";
    }

    // Método abstrato - obriga as subclasses concretas a implementarem
    public abstract void emitirSom();
}
