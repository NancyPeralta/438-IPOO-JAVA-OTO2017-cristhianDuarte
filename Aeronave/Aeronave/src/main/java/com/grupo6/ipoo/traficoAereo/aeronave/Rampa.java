package com.grupo6.ipoo.traficoAereo.aeronave;

import java.util.List;

public class Rampa {
	private int id;
	private String nombre;
	private Dimension dimension;
	private Posicion posicion;
	
	public Rampa(){
		
	}

	public Rampa(int id, String nombre, Dimension dimension, Posicion posicion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.dimension = dimension;
		this.posicion = posicion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	
}
