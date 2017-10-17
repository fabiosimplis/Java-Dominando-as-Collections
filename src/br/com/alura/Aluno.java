package br.com.alura;

public class Aluno {
	
	private String nome;
	private int numeroMatricula;
	
	
	public Aluno(String nome, int numeroMatricula) {
		if (nome == null) {
			throw new NullPointerException("Nome do aluno esta vazio!\n favor verificar!");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
	@Override
	public String toString() {
		
		return "Nome: "+ nome + ", Matrícula: "+ numeroMatricula;
		
	}
	
	@Override
    public boolean equals(Object obj) {
    	
    	Aluno aluno = (Aluno) obj;
    	
    	return this.nome.equals(aluno.nome);
    }
	
	@Override
	public int hashCode() {
		
		return nome.hashCode();
	}
}
