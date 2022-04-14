package lieux.application.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chambre database table.
 * 
 */
@Entity
@NamedQuery(name="Chambre.findAll", query="SELECT c FROM Chambre c")
public class Chambre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Boolean horsservice;

	private Integer numerochambre;

	private Boolean occupee;

	private Boolean propre;

	private String service;

	//bi-directional many-to-one association to Lit
	@ManyToOne
	@JoinColumn(name="id_2")
	private Lit lit;

	//bi-directional many-to-one association to Service
	@ManyToOne
	@JoinColumn(name="id_1")
	private Service serviceBean;

	public Chambre() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getHorsservice() {
		return this.horsservice;
	}

	public void setHorsservice(Boolean horsservice) {
		this.horsservice = horsservice;
	}

	public Integer getNumerochambre() {
		return this.numerochambre;
	}

	public void setNumerochambre(Integer numerochambre) {
		this.numerochambre = numerochambre;
	}

	public Boolean getOccupee() {
		return this.occupee;
	}

	public void setOccupee(Boolean occupee) {
		this.occupee = occupee;
	}

	public Boolean getPropre() {
		return this.propre;
	}

	public void setPropre(Boolean propre) {
		this.propre = propre;
	}

	public String getService() {
		return this.service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public Lit getLit() {
		return this.lit;
	}

	public void setLit(Lit lit) {
		this.lit = lit;
	}

	public Service getServiceBean() {
		return this.serviceBean;
	}

	public void setServiceBean(Service serviceBean) {
		this.serviceBean = serviceBean;
	}

}