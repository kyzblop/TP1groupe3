package com.inti.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDate date;
	private int numero;
	
	@ManyToOne
	@JoinColumn(name="idC")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name="idP")
	private Passager passager;
	
	@ManyToOne
	@JoinColumn(name="idV")
	private Vol vol;
	
	
	public Reservation() {
		super();
	}


	public Reservation(LocalDate date, int numero) {
		super();
		this.date = date;
		this.numero = numero;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	@Override
	public String toString() {
		return "Reservation [id=" + id + ", date=" + date + ", numero=" + numero + "]";
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public Passager getPassager() {
		return passager;
	}


	public void setPassager(Passager passager) {
		this.passager = passager;
	}


	public Vol getVol() {
		return vol;
	}


	public void setVol(Vol vol) {
		this.vol = vol;
	}
	
	
}
