package com.grupo6.ipoo.traficoAereo.aeronave;

import java.util.Date;

public class Actualizacion {
	private Aeronave aeronave;
	private Aeronave nuevaInformacion;
	private Date fecha;
	
	public Actualizacion(){
		
	}
	public Actualizacion(Aeronave aeronave, Aeronave nuevaInformacion, Date fecha) {
		super();
		this.aeronave = aeronave;
		this.nuevaInformacion = nuevaInformacion;
		this.fecha = fecha;
	}
	public Aeronave getAeronave() {
		return aeronave;
	}
	public void setAeronave(Aeronave aeronave) {
		this.aeronave = aeronave;
	}
	public Aeronave getNuevaInformacion() {
		return nuevaInformacion;
	}
	public void setNuevaInformacion(Aeronave nuevaInformacion) {
		this.nuevaInformacion = nuevaInformacion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
}
