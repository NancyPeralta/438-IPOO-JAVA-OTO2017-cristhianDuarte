package com.grupo6.ipoo.traficoAereo.aeronave;

public class Capacidad {
	private int id;
	private int persona; /* cantidad de personas*/
	private int kilosCarga;
	
	//constructor1
	public Capacidad(){
		
	}
	
	//metodos
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPersona() {
		return persona;
	}
	public void setPersona(int persona) {
		this.persona = persona;
	}
	public int getKilosCarga() {
		return kilosCarga;
	}
	public void setKilosCarga(int kilosCarga) {
		this.kilosCarga = kilosCarga;
	}

	//constructor2
	public Capacidad(int id, int persona, int kilosCarga) {
		super();
		this.id = id;
		this.persona = persona;
		this.kilosCarga = kilosCarga;
	}
}
	
	
	
	
	