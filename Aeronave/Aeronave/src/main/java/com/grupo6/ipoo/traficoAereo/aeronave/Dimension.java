package com.grupo6.ipoo.traficoAereo.aeronave;

public class Dimension {
	private int id;
	private int alto;
	private int ancho;
	private int largo;
	
	public Dimension(){
		
	}
	
	public Dimension(int id, int alto, int ancho, int largo) {
		super();
		this.id = id;
		this.alto = alto;
		this.ancho = ancho;
		this.largo = largo;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	
	
	
	
}
