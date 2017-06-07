package com.grupo6.ipoo.traficoAereo.aeronave;

import java.util.List;

public class Posicion {
	private int id;
	private double latitud;
	private double longitud;
	public Posicion(){
		
	}
	public Posicion(int id, double latitud, double longitud) {
		super();
		this.id = id;
		this.latitud = latitud;
		this.longitud = longitud;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	
	
	
	
}
