package logico;

import java.util.ArrayList;

import logico.Jurado;
//import logico.Trabajo;

public class Comision {
	
	private String idcomision;
	private String area;
	private Jurado presidente;
	//private ArrayList<Jurado>jurados;
	//private ArrayList<Trabajo>trabajos;
	
	public Comision(String codigo, String area, Jurado presidente) {
		super();
		this.idcomision = idcomision;
		this.area = area;
		this.presidente = presidente;
		//this.jurados=new ArrayList<>();
		//this.trabajos=new ArrayList<>();
	}

}
