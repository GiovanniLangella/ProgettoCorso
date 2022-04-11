package model.session;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HB_AULA1")
public class Aula {
	
//	public static final String PROPERTY_matricola = "titolo_di_studio";

	
	public static final String PROPERTY_id = "id";
	public static final String PROPERTY_cognome = "cognome";
	public static final String PROPERTY_matricola = "matricola";
	
	

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "numeroposti")
	private String numeroposti;

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}
	
	
	public String getnumeroposti() {
		return numeroposti;
	}

	public void setnumeroposti(String numeroposti) {
		this.numeroposti = numeroposti;
	}

//	public String getTitoloDiStudio() {
//		return titoloDiStudio;
//	}
//
//	public void setTitoloDiStudio(String titoloDiStudio) {
//		this.titoloDiStudio = titoloDiStudio;
//	}



}
