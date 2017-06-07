package com.grupo6.ipoo.traficoAereo.aeronave;

import java.util.Date;

public class Asignacion {
	 private int id;
	 private Date fecha;
	 private Date fechaHoraCreacion;
	 private Hospedaje hospedaje;
	 private ItemAsignacion llegada;
	 private ItemAsignacion salida;
	 
	 public Asignacion(){
		 
	 }
		public Asignacion(int id, Date fecha, Date fechaHoraCreacion, Hospedaje hospedaje,
				EstadoPlanDeVuelo estadoPlanDeVuelo, ItemAsignacion llegada, ItemAsignacion salida) {
			super();
			this.id = id;
			this.fecha = fecha;
			this.fechaHoraCreacion = fechaHoraCreacion;
			this.hospedaje = hospedaje;
	
			this.llegada = llegada;
			this.salida = salida;
		}
		 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Date getFechaHoraCreacion() {
		return fechaHoraCreacion;
	}
	public void setFechaHoraCreacion(Date fechaHoraCreacion) {
		this.fechaHoraCreacion = fechaHoraCreacion;
	}
	public Hospedaje getHospedaje() {
		return hospedaje;
	}
	public void setHospedaje(Hospedaje hospedaje) {
		this.hospedaje = hospedaje;
	}
	
	public ItemAsignacion getLlegada() {
		return llegada;
	}
	public void setLlegada(ItemAsignacion llegada) {
		this.llegada = llegada;
	}
	public ItemAsignacion getSalida() {
		return salida;
	}
	public void setSalida(ItemAsignacion salida) {
		this.salida = salida;
	}


	 
}
