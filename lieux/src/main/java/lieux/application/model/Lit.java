package lieux.application.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the lit database table.
 * 
 */
@Entity
@NamedQuery(name="Lit.findAll", query="SELECT l FROM Lit l")
public class Lit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer chambre;

	private Integer numerolit;

	private Boolean utilise;

	//bi-directional many-to-one association to Chambre
	@OneToMany(mappedBy="lit")
	private List<Chambre> chambres;

	public Lit() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getChambre() {
		return this.chambre;
	}

	public void setChambre(Integer chambre) {
		this.chambre = chambre;
	}

	public Integer getNumerolit() {
		return this.numerolit;
	}

	public void setNumerolit(Integer numerolit) {
		this.numerolit = numerolit;
	}

	public Boolean getUtilise() {
		return this.utilise;
	}

	public void setUtilise(Boolean utilise) {
		this.utilise = utilise;
	}

	public List<Chambre> getChambres() {
		return this.chambres;
	}

	public void setChambres(List<Chambre> chambres) {
		this.chambres = chambres;
	}

	public Chambre addChambre(Chambre chambre) {
		getChambres().add(chambre);
		chambre.setLit(this);

		return chambre;
	}

	public Chambre removeChambre(Chambre chambre) {
		getChambres().remove(chambre);
		chambre.setLit(null);

		return chambre;
	}

}