package it.polito.tdp.corsi.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.corsi.db.corsiDAO;

public class Model {
	
	private corsiDAO DAO = new corsiDAO();

	public List<Corso> StampaCorsi(String value) {
		
		List<Corso> C = new ArrayList<Corso>();
		
		if (value.equals("Primo Semestre")){
			C = DAO.listCorso(1);
		} else if (value.equals("Secondo Semestre")){
			C = DAO.listCorso(2);
		}
		
		return C;
	}

	public List<Studente> StampaStudenti(String value) {
		
		List<Studente> S = DAO.listStudente(DAO.DammiCodiceCorso(value));
		
		return S;
	}

}
