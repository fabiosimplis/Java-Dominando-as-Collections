package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();// muito mais rapido que o list, porem nao ha ordem ao adicionar
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");    
        alunos.add("Nico");
        
        System.out.println("Imprime alunos: ");
        for (String aluno : alunos) {
			System.out.println(aluno);
		}
        
        //1) adicione alguns alunos
        alunos.add("Jao");
        alunos.add("Fabio");
        alunos.add("Junior");
        alunos.add("Alex");

        //2) imprima o tamanho da colecao
        
        System.out.println("\nTamanho do set: " + alunos.size());
        
        //3) tente adicionar um aluno que existe
        System.out.println("\nTetando adicionar mais um aluno no set:");
        boolean adicionou = alunos.add("Fabio");
        System.out.println("Adicionou? " + adicionou);
        
        //4) imprima novamente o tamanho da colecao
        System.out.println("\nTamanho do set: " + alunos.size());
	}

}
