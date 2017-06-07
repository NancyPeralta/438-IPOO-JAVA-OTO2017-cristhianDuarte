package com.grupo6.ipoo.traficoAereo.aeronave;

import java.util.Date;
import java.util.List;

public class Hospedaje {
	private int id;
	private Date inicio;
	private Date fin;
	private NoResidente noResidente;
	private Hangar hangar;
	
	public Hospedaje(){
		
	}
	public Hospedaje(int id, Date inicio, Date fin, NoResidente noResidente, Hangar hangar) {
		super();
		this.id = id;
		this.inicio = inicio;
		this.fin = fin;
		this.noResidente = noResidente;
		this.hangar = hangar;
		this.noResidente= noResidente;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	

	public Hangar getHangar() {
		return hangar;
	}

	public void setHangar(Hangar hangar) {
		this.hangar = hangar;
	}

	

	public void setNoResidente(NoResidente noResidente) {
		this.noResidente = noResidente;
	}
	public NoResidente getNoResidente() {
		return noResidente;
	}
	
	
	
	
}
