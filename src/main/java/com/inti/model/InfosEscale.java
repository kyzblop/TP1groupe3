package com.inti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table

public class InfosEscale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int heureArrivee;
	private int heureDepart;

	
	@ManyToOne
	@JoinColumn(name = "idV")
	private Vol vol;
	
	@ManyToOne
	@JoinColumn(name = "idA")
	private Aeroport aeroport;
	
	public InfosEscale() {
		super();
	}
	public InfosEscale(int id, int heureArrivee, int heureDepart) {
		super();
		this.id = id;
		this.heureArrivee = heureArrivee;
		this.heureDepart = heureDepart;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHeureArrivee() {
		return heureArrivee;
	}
	public void setHeureArrivee(int heureArrivee) {
		this.heureArrivee = heureArrivee;
	}
	public int getHeureDepart() {
		return heureDepart;
	}
	public void setHeureDepart(int heureDepart) {
		this.heureDepart = heureDepart;
	}
	
	public Aeroport getAeroport() {
		return aeroport;
	}
	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}
	
	
	public Vol getVol() {
		return vol;
	}
	public void setVol(Vol vol) {
		this.vol = vol;
	}
	@Override
	public String toString() {
		return "InfosEscale [id=" + id + ", heureArrivee=" + heureArrivee + ", heureDepart=" + heureDepart + "]";
	}
	
	
}
