package it.polito.tdp.corsi.model;

public class Corso {
	
	String Nome;
	int Iscritti;
	
	public Corso(String nome, int iscritti) {
		super();
		Nome = nome;
		Iscritti = iscritti;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getIscritti() {
		return Iscritti;
	}

	public void setIscritti(int iscritti) {
		Iscritti = iscritti;
	}
	
	
	

}
