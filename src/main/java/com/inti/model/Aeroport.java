package com.inti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Aeroport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	
//	@OneToMany
//	private Vol volDepart;
//	
//	@OneToMany
//	private Vol volArrivee;
	
	@OneToMany(mappedBy = "aeroport", targetEntity = InfosEscale.class)
	private List<InfosEscale> listeInfosEscale;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idV")
	private Ville ville;
	
	public Aeroport() {
		super();
	}
	public Aeroport(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Ville getVille() {
		return ville;
	}
	public void setVille(Ville ville) {
		this.ville = ville;
	}
	
	public List<InfosEscale> getListeInfosEscale() {
		return listeInfosEscale;
	}
	public void setListeInfosEscale(List<InfosEscale> listeInfosEscale) {
		this.listeInfosEscale = listeInfosEscale;
	}
	@Override
	public String toString() {
		return "Aeroport [id=" + id + ", nom=" + nom + "]";
	}
	
}
