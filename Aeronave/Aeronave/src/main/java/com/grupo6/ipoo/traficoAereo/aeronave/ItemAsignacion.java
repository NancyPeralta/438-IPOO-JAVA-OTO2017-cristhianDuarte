package com.grupo6.ipoo.traficoAereo.aeronave;

import java.util.Date;

public class ItemAsignacion {

	private Date fechaHora;
	private Rampa rampa;
	private Pista pista;
	
	public ItemAsignacion(Date fechaHora, Rampa rampa, Pista pista) {
		super();
		this.fechaHora = fechaHora;
		this.rampa = rampa;
		this.pista = pista;
	}
	public Date getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}
	public Rampa getRampa() {
		return rampa;
	}
	public void setRampa(Rampa rampa) {
		this.rampa = rampa;
	}
	public Pista getPista() {
		return pista;
	}
	public void setPista(Pista pista) {
		this.pista = pista;
	}
	
	
	
}
