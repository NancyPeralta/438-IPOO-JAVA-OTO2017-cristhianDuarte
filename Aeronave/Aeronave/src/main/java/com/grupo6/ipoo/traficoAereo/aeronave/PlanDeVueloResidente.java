package com.grupo6.ipoo.traficoAereo.aeronave;

import java.util.Date;
import java.util.List;

public class PlanDeVueloResidente extends PlanDeVuelo {

	public PlanDeVueloResidente() {
		super();
	
	}

	public PlanDeVueloResidente(int id, Date fechaHoraSalida, Date fechaHoraLlegada, String destino,
			EstadoPlanDeVuelo estadoPlanDeVuelo, List<Asignacion> asignacion) {
		super(id, fechaHoraSalida, fechaHoraLlegada, destino, estadoPlanDeVuelo, asignacion);
		
	}

}
