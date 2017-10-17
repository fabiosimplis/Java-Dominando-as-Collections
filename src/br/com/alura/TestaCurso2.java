package br.com.alura;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		Curso prog2 = new Curso("Prog2", "Joao");
		
		
		prog2.adiciona(new Aula("Listas", 40));
		prog2.adiciona(new Aula("Vetores", 30));
		prog2.adiciona(new Aula("Pilhas", 20));
		
		Aluno a1 = new Aluno("Joao", 000001);
		Aluno a2 = new Aluno("Alex", 000003);
		Aluno a3 = new Aluno("Fabio", 000002);
		
		prog2.matricula(a1);
		prog2.matricula(a2);
		prog2.matricula(a3);
		
		Aluno a4 = new Aluno("Fabio", 000213);
		Aluno a5 = new Aluno("Henrique", 931083);
		
		//teste para ver se esta matriculado
		boolean matriculado = prog2.estaMatriculado(a4);
		System.out.println("O aluno: "+ a4.getNome() +" Esta matriculado: "+ matriculado);
		System.out.println("O aluno: "+ a5.getNome() +" Esta matriculado: "+ prog2.estaMatriculado(a5));
		
	}
		
}
