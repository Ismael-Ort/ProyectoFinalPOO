package logico;

import java.util.ArrayList;

import logico.Jurado;
import logico.TrabajoCientifico;

public class Comision {
	
	private String idcomision;
	private String area;
	private Jurado presidente;
	private ArrayList<Jurado>jurados;
	private ArrayList<TrabajoCientifico>trabajos;
	
	public Comision(String codigo, String area, Jurado presidente) {
		super();
		this.idcomision = idcomision;
		this.area = area;
		this.presidente = presidente;
		this.jurados = new ArrayList<>();
		this.trabajos = new ArrayList<>();
	}

	public String getIdcomision() {
		return idcomision;
	}

	public void setIdcomision(String idcomision) {
		this.idcomision = idcomision;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Jurado getPresidente() {
		return presidente;
	}

	public void setPresidente(Jurado presidente) {
		this.presidente = presidente;
	}

	public ArrayList<Jurado> getJurados() {
		return jurados;
	}

	public void setJurados(ArrayList<Jurado> jurados) {
		this.jurados = jurados;
	}

	public ArrayList<TrabajoCientifico> getTrabajos() {
		return trabajos;
	}

	public void setTrabajos(ArrayList<TrabajoCientifico> trabajos) {
		this.trabajos = trabajos;
	}
	
	

}