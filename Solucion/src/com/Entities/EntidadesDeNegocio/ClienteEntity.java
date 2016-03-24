package com.Entities.EntidadesDeNegocio;

import com.Entities.BusinessEntity;

public class ClienteEntity extends BusinessEntity {

	public String Nombre;
	public String Apellido;
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	
}
