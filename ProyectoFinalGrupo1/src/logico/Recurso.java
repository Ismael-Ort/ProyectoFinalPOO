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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public boolean getdisponible() {
		return disponible;
	}
	public void setdisponible(boolean estado) {
		this.disponible = estado;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
