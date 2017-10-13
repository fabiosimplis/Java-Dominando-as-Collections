package br.com.alura;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
	
	private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
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

    public List<Aula> getAulas() {
    	// Faz com que o valor da lista nao possa ser alterado 
    	// fora da propia classe 
        return Collections.unmodifiableList(aulas);
    }
}
