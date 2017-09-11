package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestandoListas {

		public static void main(String[] args) {
			
			String projBr = "Petrobras";
			String projFc = "FastCred";
			String projV = "Visa";
			boolean add;
			
			//ArrayList e um tipo generico por isso: ArrayList<qual_tipo> 
			ArrayList<String> projetos = new ArrayList<>();
			
			
			add = projetos.add(projBr);
			System.out.println("boolean: " + add + "\n");
			projetos.add(projFc);
			projetos.add(projV);
			System.out.println("Imprimindo Lista Ordenada");
			System.out.println(projetos);
			System.out.println("Ordenando...");
			Collections.sort(projetos);
			System.out.println("Imprimindo Lista Ordenada");
			System.out.println(projetos);
			
			//projetos.remove(0);
			
			//System.out.println("\nRemovendo o  primeiro elemento: \n" + projetos);
			
			System.out.println("\nO primeiro elemento agora é: " + projetos.get(0));
			/*System.out.println("Imprimindo a Lista");
			for (int i = 0; i < projetos.size(); i++) {
				
				System.out.println(projetos.get(i));
			}
			*/
			
			
		}
}
