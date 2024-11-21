package logico;

import java.util.ArrayList;
import java.util.Date;

//import logico.Comision;
//import logico.Recurso;

public class Evento {
	
	private String nombre;
	private String codigo;
	private String ubicacion;
	private String fechainicio;
	private String fechafinal;
	private int cupo;
	//private ArrayList<Recurso>recursos;
	//private ArrayList<Comision>comisiones;
	
	public Evento(String nombre, String codigo,String ubicacion, String fechainicio,String fechafinal,int cupo) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.ubicacion=ubicacion;
		this.fechainicio = fechainicio;
		this.fechafinal=fechafinal;
		this.cupo=cupo;
		//this.comisiones = new ArrayList<>();
		//this.recursos = new ArrayList<>();

	}
	
	
}
