package logico;

import java.util.ArrayList;

import logico.Jurado;
import logico.Participante;
import logico.TrabajoCientifico;
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
	
	
	//Funciones para agregar
	
	public void agregarpersonas(Persona persona) {
		personas.add(persona);
		
		if(persona instanceof Participante)
			codparticipante++;
		if(persona instanceof Jurado)
			codjurado++;
	}
	
	
	public void agregartrabajo(TrabajoCientifico trabajo) {
		trabajos.add(trabajo);
		codtrabajo++;
	}
	
	
	public void agregarevento(Evento evento) {
		eventos.add(evento);
		codevento++;
	}
	
	
	public void agregarrecurso(Recurso recurso) {
		recursos.add(recurso);
		codrecurso++;
	}
	
	
	public void agregarcomisiones(Comision comicion) {
		comisiones.add(comicion);
	}
	
	
	//Funciones para buscar
	
	public Comision buscacomision(String codigo) {
		Comision comi = null;
		boolean encontrado = false;
		int i = 0;
		
		while(i < comisiones.size() && encontrado == false) {
			if(comisiones.get(i).getIdcomision().equals(codigo))
			{
				encontrado = true;
				comi = comisiones.get(i);
			}
			
			i++;
		}
		
		return comi;
	}
	
	public Evento buscarEvento(String codigo) {
		Evento event = null;
		boolean encontrado = false;
		int i = 0;
		
		while(i < eventos.size() && encontrado == false) {
			if(eventos.get(i).getCodigo().equals(codigo))
			{
				encontrado = true;
				event = eventos.get(i);
			}
			
			i++;
		}
		
		return event;
	}
	
	public TrabajoCientifico buscatrabajo(String codigo) {
		TrabajoCientifico trab = null;
		boolean encontrado = false;
		int i = 0;
		
		while(i < trabajos.size() && encontrado == false) {
			if(trabajos.get(i).getCodigo().equals(codigo))
			{
				encontrado = true;
				trab = trabajos.get(i);
			}
			
			i++;
		}
		
		return trab;
	}
	
	public Participante buscaparticipante(String codigo) {
		Participante parti = null;
		boolean encontrado = false;
		int i = 0;
		
		while(i < personas.size() && encontrado == false) {
			if(personas.get(i) instanceof Participante)
			{
				if(((Participante)personas.get(i)).getCodparticipante().equals(codigo))
				{
					encontrado = true;
					parti = (Participante)personas.get(i);
				}
			}
			
			i++;
		}
		
		return parti;
	}
	
	public Participante buscaparticipantebycedula(String cedula) {
		Participante parti = null;
		boolean encontrado = false;
		int i = 0;
		
		while(i < personas.size() && encontrado == false) {
			if(personas.get(i) instanceof Participante)
			{
				if(((Participante)personas.get(i)).getCedula().equals(cedula))
				{
					encontrado = true;
					parti = (Participante)personas.get(i);
				}
			}
			
			i++;
		}
		
		return parti;
	}
	
	public Jurado buscarJurado(String codigo) {
		Jurado parti = null;
		boolean encontrado = false;
		int i = 0;
		
		while(i < personas.size() && encontrado == false) {
			if(personas.get(i) instanceof Jurado)
			{
				if(((Jurado)personas.get(i)).getCodjurado().equals(codigo))
				{
					encontrado = true;
					parti = (Jurado)personas.get(i);
				}
			}
			
			i++;
		}
		
		return parti;
	}
	
	public Recurso buscarrecurso(String codigo) {
		Recurso recu = null;
		boolean encontrado = false;
		int i = 0;
		
		while(i < recursos.size() && encontrado == false) {
			if(recursos.get(i).getCodigo().equals(codigo))
			{
				encontrado = true;
				recu = recursos.get(i);
			}
			
			i++;
		}
		
		return recu;
	}
	
	
	
	
	
	
	
	
}
