package br.com.alura;

import java.util.List;

public class TestaCurso {
	
	public static void main(String[] args) {
		
		Curso prog = new Curso("Prog1", "José");
		
		List<Aula> aulas = prog.getAulas();
		
		prog.adiciona(new Aula("Tipos de Dados", 30));
		prog.adiciona(new Aula("Declaracao de variaveis", 15));
		prog.adiciona(new Aula("Operadores", 10));
		
		
		//adiciona aulas
		//aulas.add(new Aula("Trabalhando com array", 21));
		System.out.println(aulas);
	}
}
