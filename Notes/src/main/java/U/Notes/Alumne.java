package U.Notes;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Alumne
 *
 */
@Entity

public class Alumne implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nom;
	@OneToMany(cascade=CascadeType.PERSIST)
	@JoinColumn(name="ALUMNEID")
	private List<Nota> notes;
	private static final long serialVersionUID = 1L;

	public Alumne() {
		super();
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
	public List<Nota> getNotes() {
		return this.notes;
	}

	public void setNotes(List<Nota> notes) {
		this.notes = notes;
	}
   
}
