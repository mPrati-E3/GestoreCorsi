package it.polito.tdp.corsi.model;

public class Studente {
	
	String Nome;
	String Cognome;
	String CDS;
	
	public Studente(String nome, String cognome, String cDS) {
		super();
		Nome = nome;
		Cognome = cognome;
		CDS = cDS;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}

	public String getCDS() {
		return CDS;
	}

	public void setCDS(String cDS) {
		CDS = cDS;
	}
	
	
}
