package proyecto_1;

import java.time.LocalDate;

public class Persona {

	protected String nombre;
	protected String apellido;
	protected String mail;
	protected int dni;
	protected LocalDate fecha_nac;
	
	public Persona(String nombre, String apellido, String mail, int dni, LocalDate fecha_nac) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.dni = dni;
		this.fecha_nac = fecha_nac;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public LocalDate getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(LocalDate fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	
	
	
}
