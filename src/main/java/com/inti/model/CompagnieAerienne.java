package com.inti.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.OneToMany;

import javax.persistence.Table;

@Entity
@Table
public class CompagnieAerienne {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nom;
	
	@OneToMany(mappedBy = "compagnie")
	private List<Vol> listVols;
	
	public CompagnieAerienne() {
		super();
	}
	public CompagnieAerienne(int id, String nom) {
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
	public List<Vol> getListVols() {
		return listVols;
	}
	public void setListVols(List<Vol> listVols) {
		this.listVols = listVols;
	}
	@Override
	public String toString() {
		return "CompagnieAerienne [id=" + id + ", nom=" + nom + "]";
		}
}


	
	
	

