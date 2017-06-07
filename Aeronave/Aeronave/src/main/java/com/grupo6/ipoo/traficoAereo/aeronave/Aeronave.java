package com.grupo6.ipoo.traficoAereo.aeronave;

import java.util.List;

public class Aeronave {

		private long id;
		private String nombre;
		private String descripcion;
		private int tamTanque;
		private int cantMotores;
		private int canPersonaTripulacion;
		private List<PlanDeVuelo> planDeVuelo; 
		private List<TipoDeAvion> tipoDeAvion;
		private Gps gps;
		
		public Aeronave(){
			
		}
		
		public Aeronave(long id, String nombre, String descripcion, int tamTanque, int cantMotores,
				int canPersonaTripulacion, List<PlanDeVuelo> planDeVuelo, List<TipoDeAvion> tipoDeAvion, Gps gps) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.descripcion = descripcion;
			this.tamTanque = tamTanque;
			this.cantMotores = cantMotores;
			this.canPersonaTripulacion = canPersonaTripulacion;
			this.planDeVuelo = planDeVuelo;
			this.tipoDeAvion = tipoDeAvion;
			this.gps = gps;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
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
		public int getTamTanque() {
			return tamTanque;
		}
		public void setTamTanque(int tamTanque) {
			this.tamTanque = tamTanque;
		}
		public int getCantMotores() {
			return cantMotores;
		}
		public void setCantMotores(int cantMotores) {
			this.cantMotores = cantMotores;
		}
		public int getCanPersonaTripulacion() {
			return canPersonaTripulacion;
		}
		public void setCanPersonaTripulacion(int canPersonaTripulacion) {
			this.canPersonaTripulacion = canPersonaTripulacion;
		}
		public List<PlanDeVuelo> getPlanDeVuelo() {
			return planDeVuelo;
		}
		public void setPlanDeVuelo(List<PlanDeVuelo> planDeVuelo) {
			this.planDeVuelo = planDeVuelo;
		}
		public List<TipoDeAvion> getTipoDeAvion() {
			return tipoDeAvion;
		}
		public void setTipoDeAvion(List<TipoDeAvion> tipoDeAvion) {
			this.tipoDeAvion = tipoDeAvion;
		}
		public Gps getGps() {
			return gps;
		}
		public void setGps(Gps gps) {
			this.gps = gps;
		}
		
		
		
		
}
