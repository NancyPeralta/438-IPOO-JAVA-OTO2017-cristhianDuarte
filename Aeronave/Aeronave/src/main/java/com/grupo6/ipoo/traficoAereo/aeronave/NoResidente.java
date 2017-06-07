package com.grupo6.ipoo.traficoAereo.aeronave;

import java.util.List;

public class NoResidente extends Aeronave {

	public NoResidente() {
		super();
	
	}

	public NoResidente(long id, String nombre, String descripcion, int tamTanque, int cantMotores,
			int canPersonaTripulacion, List<PlanDeVuelo> planDeVuelo, List<TipoDeAvion> tipoDeAvion, Gps gps) {
		super(id, nombre, descripcion, tamTanque, cantMotores, canPersonaTripulacion, planDeVuelo, tipoDeAvion, gps);
	
	}
 
}
