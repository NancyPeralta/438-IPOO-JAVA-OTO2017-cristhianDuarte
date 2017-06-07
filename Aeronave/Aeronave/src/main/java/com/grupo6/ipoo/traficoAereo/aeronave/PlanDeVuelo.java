package com.grupo6.ipoo.traficoAereo.aeronave;

import java.util.Date;
import java.util.List;

public class PlanDeVuelo {
	
	private int id;
	private Date fechaHoraSalida;
	private Date fechaHoraLlegada;
	private String destino;
	private EstadoPlanDeVuelo estadoPlanDeVuelo;
	private List<Asignacion> asignacion;
	
	public PlanDeVuelo(){
		
	}
	public PlanDeVuelo(int id, Date fechaHoraSalida, Date fechaHoraLlegada, String destino,
			EstadoPlanDeVuelo estadoPlanDeVuelo, List<Asignacion> asignacion) {
		super();
		this.id = id;
		this.fechaHoraSalida = fechaHoraSalida;
		this.fechaHoraLlegada = fechaHoraLlegada;
		this.destino = destino;
		this.estadoPlanDeVuelo = estadoPlanDeVuelo;
		this.asignacion = asignacion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFechaHoraSalida() {
		return fechaHoraSalida;
	}
	public void setFechaHoraSalida(Date fechaHoraSalida) {
		this.fechaHoraSalida = fechaHoraSalida;
	}
	public Date getFechaHoraLlegada() {
		return fechaHoraLlegada;
	}
	public void setFechaHoraLlegada(Date fechaHoraLlegada) {
		this.fechaHoraLlegada = fechaHoraLlegada;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public EstadoPlanDeVuelo getEstadoPlanDeVuelo() {
		return estadoPlanDeVuelo;
	}
	public void setEstadoPlanDeVuelo(EstadoPlanDeVuelo estadoPlanDeVuelo) {
		this.estadoPlanDeVuelo = estadoPlanDeVuelo;
	}
	public List<Asignacion> getAsignacion() {
		return asignacion;
	}
	public void setAsignacion(List<Asignacion> asignacion) {
		this.asignacion = asignacion;
	}
	
	
	
	
}
