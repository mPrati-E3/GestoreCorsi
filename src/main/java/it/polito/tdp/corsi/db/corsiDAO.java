package it.polito.tdp.corsi.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.corsi.model.Corso;
import it.polito.tdp.corsi.model.Studente;

public class corsiDAO {
	
		public List<Corso> listCorso(int PD){
			
			List<Corso> ListCor = new ArrayList<Corso>();
			
			String sql = "SELECT corso.nome, COUNT(DISTINCT iscrizione.matricola) AS Iscritti\r\n"
					+ "FROM corso\r\n"
					+ "LEFT JOIN iscrizione\r\n"
					+ "ON corso.codins=iscrizione.codins\r\n"
					+ "WHERE corso.pd=? \r\n"
					+ "GROUP BY corso.nome";
			
			//FACTORY: creo un oggetto si una clsse senza sapere il tipo della classe
			//(non uso new perchè non so il nome della classe)
			//uso un metodo fornito da un'altra clsse che internamente fa new e riconoscerà
			//il tipo di classe effettivo
			try {
				
				Connection conn = DBConnect.getConnection();
				
				//veicolo per passare e ricevere le query al database
				PreparedStatement st = conn.prepareStatement(sql);
				
				st.setInt(1, PD);
				
				//salvo il modo per ottenere il risultato della query fatta e passata tramite lo Statement
				ResultSet res = st.executeQuery();
				//per modificare il database: executeUpdate()
				//per roba generica: execute()
				
				//itero la tabella a cui res punta tramite next
				while (res.next()) {
					
					Corso C = new Corso(
							res.getString("nome"), 
							res.getInt("Iscritti"));
					
					ListCor.add(C);

				}
				
				st.close();
				conn.close();
				
				return ListCor;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;
			
		}
		
		public List<Studente> listStudente(String CodiceCorso){
			
			List<Studente> ListStu = new ArrayList<Studente>();
			
			String sql = "SELECT nome,cognome,cds\r\n"
					+ "FROM studente\r\n"
					+ "LEFT JOIN iscrizione\r\n"
					+ "ON iscrizione.matricola=studente.matricola\r\n"
					+ "WHERE codins=?\r\n"
					+ "ORDER BY cognome,nome";
			
			//FACTORY: creo un oggetto si una clsse senza sapere il tipo della classe
			//(non uso new perchè non so il nome della classe)
			//uso un metodo fornito da un'altra clsse che internamente fa new e riconoscerà
			//il tipo di classe effettivo
			try {
				
				Connection conn = DBConnect.getConnection();
				
				//veicolo per passare e ricevere le query al database
				PreparedStatement st = conn.prepareStatement(sql);
				
				st.setString(1, CodiceCorso);
				
				//salvo il modo per ottenere il risultato della query fatta e passata tramite lo Statement
				ResultSet res = st.executeQuery();
				//per modificare il database: executeUpdate()
				//per roba generica: execute()
				
				//itero la tabella a cui res punta tramite next
				while (res.next()) {
					
					Studente S = new Studente(
							res.getString("nome"), 
							res.getString("cognome"), 
							res.getString("cds"));
					
					ListStu.add(S);

				}
				
				st.close();
				conn.close();
				
				return ListStu;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;
			
		}
		
		public String DammiCodiceCorso(String NomeCorso){
			
			String sql = "SELECT DISTINCT codins\r\n"
					+ "FROM corso\r\n"
					+ "WHERE nome=?";
			
			//FACTORY: creo un oggetto si una clsse senza sapere il tipo della classe
			//(non uso new perchè non so il nome della classe)
			//uso un metodo fornito da un'altra clsse che internamente fa new e riconoscerà
			//il tipo di classe effettivo
			try {
				
				Connection conn = DBConnect.getConnection();
				
				//veicolo per passare e ricevere le query al database
				PreparedStatement st = conn.prepareStatement(sql);
				
				st.setString(1, NomeCorso);
				
				//salvo il modo per ottenere il risultato della query fatta e passata tramite lo Statement
				ResultSet res = st.executeQuery();
				//per modificare il database: executeUpdate()
				//per roba generica: execute()
				
				//itero la tabella a cui res punta tramite next
				while (res.next()) {
					
					st.close();
					conn.close();
					
					return res.getString("codins");

				}
				
				
				return "";
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;
			
		}

		public List<String> tuttiCorsi() {
			
			List<String> C = new ArrayList<String>();
			
			String sql = "SELECT DISTINCT nome FROM corso";
			
			//FACTORY: creo un oggetto si una clsse senza sapere il tipo della classe
			//(non uso new perchè non so il nome della classe)
			//uso un metodo fornito da un'altra clsse che internamente fa new e riconoscerà
			//il tipo di classe effettivo
			try {
				
				Connection conn = DBConnect.getConnection();
				
				//veicolo per passare e ricevere le query al database
				PreparedStatement st = conn.prepareStatement(sql);
				
				//salvo il modo per ottenere il risultato della query fatta e passata tramite lo Statement
				ResultSet res = st.executeQuery();
				//per modificare il database: executeUpdate()
				//per roba generica: execute()
				
				//itero la tabella a cui res punta tramite next
				while (res.next()) {
					
					C.add(res.getString("nome"));
					
			
				}
				
				st.close();
				conn.close();
				
				
				return C;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;
			
		}


	}


