package com.grupo6.ipoo.traficoAereo.aeronave;

import java.util.List;

public class Residente extends Aeronave{

	private Hangar hangar;
	
	public void setHangar(Hangar hangar) {
		this.hangar = hangar;
	}
	


	public Residente() {
		super();

	}

	public Residente(long id, String nombre, String descripcion, int tamTanque, int cantMotores,
			int canPersonaTripulacion, List<PlanDeVuelo> planDeVuelo, List<TipoDeAvion> tipoDeAvion, Gps gps, Hangar hangar) {
		super(id, nombre, descripcion, tamTanque, cantMotores, canPersonaTripulacion, planDeVuelo, tipoDeAvion, gps);
		this.hangar=hangar;
		
		
	}

	
	
	public Hangar getHangar() {
		return hangar;
	}

	
}
