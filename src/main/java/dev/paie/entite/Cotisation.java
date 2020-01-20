package dev.paie.entite;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.*;

@Entity
public class Cotisation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String code;

	private String libelle;

	private BigDecimal tauxSalarial;

	private BigDecimal tauxPatronal;
	private Boolean imposable = false;

	@ManyToMany
	@JoinTable(name = "profil_remuneration_cotisations", 
	joinColumns = @JoinColumn(name = "cotisations_id", referencedColumnName = "id"), 
	inverseJoinColumns = @JoinColumn(name = "profil_remuneration_id", referencedColumnName = "id"))
	private List<ProfilRemuneration> listRenum;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public BigDecimal getTauxSalarial() {
		return tauxSalarial;
	}
	public void setTauxSalarial(BigDecimal tauxSalarial) {
		this.tauxSalarial = tauxSalarial;
	}
	public BigDecimal getTauxPatronal() {
		return tauxPatronal;
	}
	public void setTauxPatronal(BigDecimal tauxPatronal) {
		this.tauxPatronal = tauxPatronal;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getImposable() {
		return imposable;
	}
	public void setImposable(Boolean imposable) {
		this.imposable = imposable;
	}

	public List<ProfilRemuneration> getListRenum() {
		return listRenum;
	}

	public void setListRenum(List<ProfilRemuneration> listRenum) {
		this.listRenum = listRenum;
	}
}
