package br.com.alura;

import java.util.List;

public class TestaCurso {
	
	public static void main(String[] args) {
		
		Curso prog = new Curso("Prog1", "José");
		
		List<Aula> aulas = prog.getAulas();
		
		prog.getAulas().add(new Aula("Tipos de Dados", 30));
		prog.getAulas().add(new Aula("Declaracao de variaveis", 15));
		prog.getAulas().add(new Aula("Operadores", 10));
		
		
		
		//adiciona aulas
		//aulas.add(new Aula("Trabalhando com array", 21));
		System.out.println(aulas);
	}
}
