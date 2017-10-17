package br.com.alura;


import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {
	
	private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }
    
    public void matricula(Aluno aluno)
    {
    	this.alunos.add(aluno);
    }
    
    public Set<Aluno> getAlunos()
    {
    	return Collections.unmodifiableSet(alunos);
    }

    public String getNome() {
        return nome;
    }

    public void adiciona(Aula aula)
    {
    	this.aulas.add(aula);
    }
    
    public String getInstrutor() {
        return instrutor;
    }
    
    public int getTempoTotal()
    {
    	int tempoTotal = 0;
    	
    	for (Aula aula : aulas)
    	{
    		tempoTotal += aula.getTempo();
		}
    	
    	return tempoTotal;
    	
    	//Java 8 utilizando stream
    	//return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    	
    }

    public List<Aula> getAulas() 
    {
    	// Faz com que o valor da lista nao possa ser alterado 
    	// fora da propia classe 
        return Collections.unmodifiableList(aulas);
    }
    
    @Override
    public String toString() 
    {
    	
    	return "[Curso: "+ nome + ", Tempo Total: "+ getTempoTotal() + ", Aula: [" + getAulas() + "]";
    }
    
    public boolean estaMatriculado(Aluno aluno)
    {
    	
    	return this.alunos.contains(aluno);
    }
}
