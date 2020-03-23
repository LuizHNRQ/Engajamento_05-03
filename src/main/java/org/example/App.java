package org.example;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class App {

    private static Scanner sc = new Scanner(System.in);
    private static Set<String> listaAlunos = new HashSet<String>();

    public static void main(String[] args) {
        String option;

        do {

            System.out.println("\n----- Menu -----");
            System.out.println("[1] - Inserir Aluno");
            System.out.println("[2] - Imprimir Lista\n");
            System.out.println("[0] - Sair\n");
            option = sc.nextLine();

            switch (option) {
                case "1":
                    inserirAluno();
                    break;
                case "2":
                    exibirLista();
                    break;
                case "0":
                    exibirLista();
                    break;
            }
        } while (!option.equals("0"));
    }

    private static void inserirAluno() {
        System.out.println("Insira o nome: ");
        String nome = sc.nextLine();
        if (listaAlunos.add(nome)){
            System.out.println("\n O nome "+ nome+" FOI CADASTRADO");
        }else{
            System.out.println("\n#### NOME JA CADASTRADO ####\n");
        }
    }

    private static void exibirLista() {
        System.out.println("----- Lista de nomes -----");
        for ( String aluno : listaAlunos){
            System.out.println(aluno);
        }
    }
}
