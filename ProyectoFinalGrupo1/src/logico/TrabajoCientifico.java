package logico;

import logico.Participante;

public class TrabajoCientifico {
	private String codigo;
	private Participante propietario;
	private float calificacion;
	private String titulo;
	private boolean primeracalificaion;
	
	public TrabajoCientifico(String codigo, Participante propietario, String titulo) {
		super();
		this.codigo = codigo;
		this.propietario = propietario;
		calificacion = 0;
		this.titulo = titulo;
		primeracalificaion = false;
	}
}
