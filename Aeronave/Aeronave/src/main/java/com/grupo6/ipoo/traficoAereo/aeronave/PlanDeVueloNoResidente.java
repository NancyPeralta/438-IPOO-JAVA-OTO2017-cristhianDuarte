package com.grupo6.ipoo.traficoAereo.aeronave;

import java.util.Date;
import java.util.List;

public class PlanDeVueloNoResidente extends PlanDeVuelo {

	private String origen;
	private Actualizacion actualizacion;
	public PlanDeVueloNoResidente(){
		
	}
	public PlanDeVueloNoResidente(String origen, Actualizacion actualizacion) {
		super();
		this.origen = origen;
		this.actualizacion = actualizacion;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public Actualizacion getActualizacion() {
		return actualizacion;
	}
	public void setActualizacion(Actualizacion actualizacion) {
		this.actualizacion = actualizacion;
	}
	public PlanDeVueloNoResidente(int id, Date fechaHoraSalida, Date fechaHoraLlegada, String destino,
			EstadoPlanDeVuelo estadoPlanDeVuelo, List<Asignacion> asignacion) {
		super(id, fechaHoraSalida, fechaHoraLlegada, destino, estadoPlanDeVuelo, asignacion);
		
	}

	
	
}
