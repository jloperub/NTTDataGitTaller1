package com.nttdata.mvn;

public class Proyecto {
	private String autor;
	private String descripcion;
	private String nombre;
	private String version;

	public Proyecto(String autor, String descripcion, String nombre, String version) {
		this.autor = autor;
		this.descripcion = descripcion;
		this.nombre = nombre;
		this.version = version;
	}

	public String getAutor() {
		return autor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getVersion() {
		return version;
	}
}
