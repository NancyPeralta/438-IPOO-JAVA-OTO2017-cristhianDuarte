package com.grupo6.ipoo.traficoAereo.aeronave;

public class TipoDeAvion {
	private int id;
	private String nombre;
	private String descripcion;
	private Capacidad capacidad;
	
	//constructor1
	
	public TipoDeAvion(){
		
	}
	//constructor2
		public TipoDeAvion(int id, String nombre, String descripcion, Capacidad capacidad) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.descripcion = descripcion;
			this.capacidad = capacidad;
		}
		
	//metodos
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Capacidad getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Capacidad capacidad) {
		this.capacidad = capacidad;
	}

	
	
	
	
	
	
	
}
