package br.com.alura;

public class Projeto<T> implements Comparable<Projeto>{
	
	String name;
	int time;
	
	Projeto(String name, int time) {
		this.name = name;
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public int getTime() {
		return time;
	}
	
	@Override
	public String toString() {
		
		return "( Projeto: "+ getName() + ", Tempo: " + getTime() + " )" ;
	}

	@Override
	public int compareTo(Projeto outroProjeto) {
		
		return this.name.compareTo(outroProjeto.getName());
	}
}
