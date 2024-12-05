package logico;

import java.util.ArrayList;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import logico.Usuario;

import java.io.Serializable;

import logico.Jurado;
import logico.Participante;
import logico.TrabajoCientifico;
import logico.Comision;
import logico.Evento;
import logico.GestionEvento;
import logico.Persona;
import logico.Recurso;
import logico.TrabajoCientifico;


public class GestionEvento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Persona>personas;
	private ArrayList<TrabajoCientifico>trabajos;
	private ArrayList<Evento>eventos;
	private ArrayList<Recurso>recursos;
	private ArrayList<Comision>comisiones;
	private ArrayList<Comision>comisionesaux;
	private static GestionEvento event = null;
	
	private ArrayList<Usuario> usuarios;
	private Usuario nowuser;
	
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
		this.comisionesaux = new ArrayList<>();
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
	
	public Usuario getUser() {
		return nowuser;
	}

	public void setUser(Usuario user) {
		this.nowuser = user;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
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
	
	public void agregarcomisionesaux(Comision com) {
		comisionesaux.add(com);
		codcomision++;
	}
	
	public ArrayList<Comision> getcomisionesaux() {
		return comisionesaux;
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
	
	public void agregartrabajo(String cod,String titulo, String codparticipante, Comision comi){
		Participante parti = buscaparticipante(codparticipante);
		
		TrabajoCientifico trabajo = new TrabajoCientifico(cod, parti, titulo);
		
		agregartrabajo(trabajo);
		comi.agregartrabajos(trabajo);
		parti.agregartrabajo(trabajo);
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
	
	
	public void reguser(Usuario aux) {
		usuarios.add(aux);
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

        // funciones para eliminar
	
	public void eliminarRecurso(String codigo) {
		int ind = indRecurso(codigo);
		
		if(ind != -1)
			recursos.remove(ind);
	}
	
	public int indRecurso(String codigo) {
		int posi = -1;
		int i = 0;
		boolean seguir = true;
		
		while(i < recursos.size() && seguir == true)
		{
			if(recursos.get(i).getCodigo().equals(codigo))
			{
				posi = i;
				seguir = false;
			}	
			i++;
		}
		
		return posi;
	}
	
	public void eliminarTrabajo(TrabajoCientifico trabajo) {
		int ind = indTrabajo(trabajo.getCodigo());
		
		if(ind != -1)
			trabajos.remove(ind);
	}
	
	public int indTrabajo(String codigo) {
		int posi = -1;
		int i = 0;
		boolean seguir = true;
		
		while(i < trabajos.size() && seguir == true)
		{
			if(trabajos.get(i).getCodigo().equals(codigo))
			{
				posi = i;
				seguir = false;
			}	
			i++;
		}
		
		return posi;
	}

	
	public void eliminarparticipante(String codigo) {
		int ind = indparticipante(codigo);
		if(ind != -1)
			personas.remove(ind);
	}
	
	
	public void eliminarjurado(String codigo) {
		int ind = indjurado(codigo);
		if(ind != -1)
			personas.remove(ind);
	}
	
	public int indcomision(String codigo) {
		int posi = -1;
		int i = 0;
		boolean seguir = true;
		
		while(i < comisiones.size() && seguir == true)
		{
			if(comisiones.get(i).getIdcomision().equalsIgnoreCase(codigo))
			{
				posi = i;
				seguir = false;
			}	
			i++;
		}
		
		return posi;
	}
	
	public void modicomision(Comision comision) {
		
		int ind = indcomision(comision.getIdcomision());
		if(ind != -1)
			comisiones.set(ind, comision);
	}
	
	
	public void modifevento(Evento evento) {
		int ind=indevento(evento.getCodigo());
		if(ind != -1)
			eventos.set(ind, evento);
	}
	
	public int indevento(String codigo) {
		int posi = -1;
		int i = 0;
		boolean seguir = true;
		
		while(i < eventos.size() && seguir == true)
		{
			if(eventos.get(i).getCodigo().equalsIgnoreCase(codigo))
			{
				posi = i;
				seguir = false;
			}	
			i++;
		}
		
		return posi;
	}
	
	//Indices
	
	public int indparticipante(String codigo) {
		int posi = -1;
		int i = 0;
		boolean seguir = true;
		
		while(i < personas.size() && seguir == true)
		{
			if(personas.get(i) instanceof Participante && ((Participante)personas.get(i)).getCodparticipante().equals(codigo))
			{
				posi = i;
				seguir = false;
			}	
			i++;
		}
		
		return posi;
	}
	
	
	public int indjurado(String codigo) {
		int posi = -1;
		int i = 0;
		boolean seguir = true;
		
		while(i < personas.size() && seguir == true)
		{
			if(personas.get(i) instanceof Jurado && ((Jurado)personas.get(i)).getCodjurado().equals(codigo))
			{
				posi = i;
				seguir = false;
			}	
			i++;
		}
		
		return posi;
	}
	

	//Ficheros
	public void guardarDatos(String archivo) {
        try (FileOutputStream fos = new FileOutputStream(archivo);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(this); 
            System.out.println("DATOS GUARDADOS");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("ERROR AL GUARDAR LOS DATOS" + e.getMessage());
        }
    }

    
    public static void cargarDatos(String archivo) {
        try (FileInputStream fis = new FileInputStream(archivo);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            event = (GestionEvento) ois.readObject(); 
            System.out.println("DATOS CARGADOS DE: "+ archivo);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("ERROR AL CARGAR LOS DATOS" + e.getMessage());
        }
    }

	
	
	public boolean confirmLogin(String usuar, String contra) {
		boolean login = false;
		//System.out.println(usuarios.size());
		for (Usuario user : usuarios) {
			if(user.getUser().equals(usuar) && user.getContrasena().equals(contra)){
				nowuser = user;
				login = true;
			}
		}
		return login;
	}


	
}