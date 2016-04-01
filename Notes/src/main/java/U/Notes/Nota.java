package U.Notes;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Nota
 *
 */
@Entity

public class Nota implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nom;
	private int nota;
	private static final long serialVersionUID = 1L;

	public Nota() {
		super();
	}   
	public Nota(String string, int i) {
		nom = string;
		nota = i;
		}
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public int getNota() {
		return this.nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
   
}
