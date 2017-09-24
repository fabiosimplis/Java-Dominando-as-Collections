package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestandoListaProjects {

	public static void main(String[] args) {
		
		Projeto p1 = new Projeto("Rede", 165);
		Projeto p2 = new Projeto("Cielo", 260);
		Projeto p3 = new Projeto("Br", 20);
		
		//criando um vetor de projetos.
		ArrayList<Projeto> projetos = new ArrayList<Projeto>();
		
		//add projeto ao array(vetor)
		projetos.add(p1);
		projetos.add(p2);
		projetos.add(p3);
		
		System.out.println(projetos);
		
		// ordenando os projetos por nome.
		
		Collections.sort(projetos);
		
		System.out.println("Ordenando por Nome:");
		System.out.println(projetos);
		
		//ordenando os projetos por tempo. com recurso do "Java 8"
		
		projetos.sort(Comparator.comparing(Projeto::getTime));
		System.out.println("Oredenando por tempo:");
		System.out.println(projetos);
		
	}

}
