package br.edu.atitus.winicius_bertoncello.zoo_digital.app;

import br.edu.atitus.winicius_bertoncello.zoo_digital.animais.*;
import br.edu.atitus.winicius_bertoncello.zoo_digital.comportamentos.*;
import br.edu.atitus.winicius_bertoncello.zoo_digital.especies.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZooDigitalApp { 

    private static final List<Animal> animais = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try (scanner) {
            System.out.println("Zoo digital!");
            
            int opcao = -1;
            while (opcao != 0) {
                exibirMenu();
                opcao = lerOpcao();
                switch (opcao) {
                    case 1 -> cadastrarAnimal();
                    case 2 -> listarTodosAnimais();
                    case 3 -> listarCorredores();
                    case 4 -> listarNadadores();
                    case 5 -> listarVoadores();
                    case 6 -> listarPredadores();
                    case 7 -> exibirTotalAnimais();
                    case 0 -> System.out.println("\nEncerrando o Zoo Digital. Até logo!");
                    default -> System.out.println("\n[ERRO] Opção inválida! Tente novamente.");
                }
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\n----------------------------------------");
        System.out.println("           Lobby              ");
        System.out.println("----------------------------------------");
        System.out.println("1 - Cadastrar Animal");
        System.out.println("2 - Listar Todos os Animais");
        System.out.println("3 - Listar Animais Corredores");
        System.out.println("4 - Listar Animais Nadadores");
        System.out.println("5 - Listar Animais Voadores");
        System.out.println("6 - Listar Animais Predadores");
        System.out.println("7 - Exibir Total de Animais");
        System.out.println("0 - Sair");
        System.out.println("----------------------------------------");
        System.out.print("Escolha uma opção: ");
    }

    private static int lerOpcao() {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void cadastrarAnimal() {
        System.out.println("\n--- Cadastre seu Animal! ---");
        System.out.println("Tipos disponíveis:");
        System.out.println("  Mamíferos : 1-Cachorro | 2-Gato | 3-Golfinho | 4-Lobo | 5-Baleia");
        System.out.println("  Aves      : 6-Pato | 7-Pinguim | 8-Aguia | 9-Avestruz");
        System.out.println("  Peixes    : 10-PeixeMorcego | 11-Traira | 12-Tubarao | 13-Piranha");
        System.out.println("  Répteis   : 14-Crocodilo | 15-Cobra | 16-Iguana | 17-Tartaruga");
        System.out.print("Digite o número do tipo: ");

        int tipo = lerOpcao();

        System.out.print("Nome: ");
        String nome = scanner.nextLine().trim();

        System.out.print("Idade: ");
        int idade;
        try {
            idade = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Idade Invalida!");
            return;
        }

        Animal animal;

        switch (tipo) {
            // Mamíferos
            case 1  -> animal = new Cachorro(nome, idade);
            case 2  -> animal = new Gato(nome, idade);
            case 3  -> animal = new Golfinho(nome, idade);
            case 4  -> animal = new Lobo(nome, idade);
            case 5  -> animal = new Baleia(nome, idade);
            // Aves
            case 6  -> {
                System.out.print("Cor das penas: ");
                String cor = scanner.nextLine().trim();
                animal = new Pato(nome, idade, cor);
            }
            case 7  -> {
            	String cor = "preto e branco";				// não vai exibir na listagem pq não atualizei lá em "todos os animais", é apenas para n bugar o codigo msm
                animal = new Pinguim(nome, idade, cor);       // não botei para perguntar a cor das penas pq depende da espécie do pinguim para ter penas difer
            }
            case 8  -> {
                System.out.print("Cor das penas: ");
                String cor = scanner.nextLine().trim();
                animal = new Aguia(nome, idade, cor);
            }
            case 9  -> {
                System.out.print("Cor das penas: ");
                String cor = scanner.nextLine().trim();
                animal = new Avestruz(nome, idade, cor);
            }
            
            case 10 -> animal = new PeixeMorcego(nome, idade);
            case 11 -> animal = new Traira(nome, idade);
            case 12 -> animal = new Tubarao(nome, idade);
            case 13 -> animal = new Piranha(nome, idade);
          
            case 14 -> animal = new Crocodilo(nome, idade);
            case 15 -> animal = new Cobra(nome, idade);
            case 16 -> animal = new Iguana(nome, idade);
            case 17 -> animal = new Tartaruga(nome, idade);
            default -> {
                System.out.println(" Tipo inválido!");
                return;
            }
        }

    
        animais.add(animal);
        System.out.println("\n[OK] " + animal.getNome() + " cadastrado com sucesso!");
    }

    private static void listarTodosAnimais() {
        System.out.println("\n--- TODOS OS ANIMAIS ---");
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }
        for (Animal animal : animais) {
            System.out.println("\n" + animal.toString()); 
            animal.comer();                               
            animal.emitirSom();                           
        }
    }

    private static void listarCorredores() {
        System.out.println("\n--- ANIMAIS CORREDORES ---");
        boolean encontrou = false;
        for (Animal animal : animais) {
            if (animal instanceof Corrida corredor) {             
                System.out.println(animal.toString());
                corredor.correr();
                encontrou = true;
            }
        }
        if (!encontrou) System.out.println("Nenhum animal corredor cadastrado.");
    }

    private static void listarNadadores() {
        System.out.println("\n--- ANIMAIS NADADORES ---");
        boolean encontrou = false;
        for (Animal animal : animais) {
            if (animal instanceof Nado nadador) {                         
                System.out.println(animal.toString());
                nadador.nadar();
                encontrou = true;
            }
        }
        if (!encontrou) System.out.println("Nenhum animal nadador cadastrado.");
    }

    private static void listarVoadores() {
        System.out.println("\n--- ANIMAIS VOADORES ---");
        boolean encontrou = false;
        for (Animal animal : animais) {
            if (animal instanceof Voo voador) {                       
                System.out.println(animal.toString());
                voador.voar();
                encontrou = true;
            }
        }
        if (!encontrou) System.out.println("Nenhum animal voador cadastrado.");
    }

    private static void listarPredadores() {
        System.out.println("\n--- ANIMAIS PREDADORES ---");
        boolean encontrou = false;
        for (Animal animal : animais) {
            if (animal instanceof Predacao predador) {                    
                System.out.println(animal.toString());
                predador.cacar();
                encontrou = true;
            }
        }
        if (!encontrou) System.out.println("Nenhum animal predador cadastrado.");
    }

    private static void exibirTotalAnimais() {
        System.out.println("\n--- TOTAL DE ANIMAIS ---");
        // Uso do atributo/método 
        System.out.println("Total de animais cadastrados: " + Animal.getContador());
    }
}
