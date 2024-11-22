package logico;

import java.util.ArrayList;

import logico.Comision;
import logico.Evento;
import logico.GestionEvento;
import logico.Persona;
import logico.Recurso;
import logico.TrabajoCientifico;


public class GestionEvento {
	
	private ArrayList<Persona>personas;
	private ArrayList<TrabajoCientifico>trabajos;
	private ArrayList<Evento>eventos;
	private ArrayList<Recurso>recursos;
	private ArrayList<Comision>comisiones;
	private static GestionEvento event = null;
	
	private int codjurado;
	private int codparticipante;
	private int codtrabajo;
	private int codrecurso;
	private int codevento;
	private int codcomision;
	
	
	public GestionEvento() {
		super();
		this.personas= new ArrayList<>();
		this.trabajos = new ArrayList<>();
		this.recursos = new ArrayList<>();
		this.comisiones=new ArrayList<>();
		this.eventos = new ArrayList<>();
		codjurado = 1;
		codparticipante = 1;
		codtrabajo = 1;
		codrecurso = 1;
		codevento = 1;
		codcomision = 1;
	}


	
	public static GestionEvento getInstance(){
		   if(event == null){
			 event = new GestionEvento();  
		   } 	   
		   return event;
	}
	
	
	public ArrayList<Persona> getPersonas() {
		return personas;
	}


	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}


	public ArrayList<TrabajoCientifico> getTrabajos() {
		return trabajos;
	}


	public void setTrabajos(ArrayList<TrabajoCientifico> trabajos) {
		this.trabajos = trabajos;
	}


	public ArrayList<Evento> getEventos() {
		return eventos;
	}


	public void setEventos(ArrayList<Evento> eventos) {
		this.eventos = eventos;
	}


	public ArrayList<Recurso> getRecursos() {
		return recursos;
	}


	public void setRecursos(ArrayList<Recurso> recursos) {
		this.recursos = recursos;
	}


	public ArrayList<Comision> getComisiones() {
		return comisiones;
	}


	public void setComisiones(ArrayList<Comision> comisiones) {
		this.comisiones = comisiones;
	}


	public static GestionEvento getEvent() {
		return event;
	}


	public static void setEvent(GestionEvento event) {
		GestionEvento.event = event;
	}


	public int getCodjurado() {
		return codjurado;
	}


	public void setCodjurado(int codjurado) {
		this.codjurado = codjurado;
	}


	public int getCodparticipante() {
		return codparticipante;
	}


	public void setCodparticipante(int codparticipante) {
		this.codparticipante = codparticipante;
	}


	public int getCodtrabajo() {
		return codtrabajo;
	}


	public void setCodtrabajo(int codtrabajo) {
		this.codtrabajo = codtrabajo;
	}


	public int getCodrecurso() {
		return codrecurso;
	}


	public void setCodrecurso(int codrecurso) {
		this.codrecurso = codrecurso;
	}


	public int getCodevento() {
		return codevento;
	}


	public void setCodevento(int codevento) {
		this.codevento = codevento;
	}


	public int getCodcomision() {
		return codcomision;
	}


	public void setCodcomision(int codcomision) {
		this.codcomision = codcomision;
	}
	
}
