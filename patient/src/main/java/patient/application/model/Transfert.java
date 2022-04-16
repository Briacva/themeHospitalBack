package patient.application.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the transferts database table.
 * 
 */
@Entity
@Table(name="transferts")
@NamedQuery(name="Transfert.findAll", query="SELECT t FROM Transfert t")
public class Transfert implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer chambre;

	@Temporal(TemporalType.DATE)
	private Date datetransfert;

	@Column(name="id_1")
	private Integer id1;

	@Column(name="id_2")
	private Integer id2;

	private String service;

	public Transfert() {
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

	public Date getDatetransfert() {
		return this.datetransfert;
	}

	public void setDatetransfert(Date datetransfert) {
		this.datetransfert = datetransfert;
	}

	public Integer getId1() {
		return this.id1;
	}

	public void setId1(Integer id1) {
		this.id1 = id1;
	}

	public Integer getId2() {
		return this.id2;
	}

	public void setId2(Integer id2) {
		this.id2 = id2;
	}

	public String getService() {
		return this.service;
	}

	public void setService(String service) {
		this.service = service;
	}

}