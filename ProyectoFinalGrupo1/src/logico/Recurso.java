package logico;

public class Recurso {
	
	private String codigo;
	private boolean disponible;
	private String ubicacion;
	private String tipo;
	private String descripcion;

	public Recurso(String codigo, boolean disponible, String ubicacion, String tipo, String descrip) {
		super();
		this.codigo = codigo;
		this.disponible = disponible;
		this.ubicacion = ubicacion;
		this.tipo = tipo;
		this.descripcion = descrip;
	}

}
