package proyecto_1.logica;

import java.util.LinkedList;

public class Materia {

	protected String nombre;
	protected int id_materia;
	protected boolean correlativa;
	protected LinkedList<Profesor> profesores;
	
	public Materia(String nombre, int id_materia, boolean correlativa, LinkedList<Profesor> profesores) {
		super();
		this.nombre = nombre;
		this.id_materia = id_materia;
		this.correlativa = correlativa;
		this.profesores = profesores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId_materia() {
		return id_materia;
	}

	public void setId_materia(int id_materia) {
		this.id_materia = id_materia;
	}

	public boolean isCorrelativa() {
		return correlativa;
	}

	public void setCorrelativa(boolean correlativa) {
		this.correlativa = correlativa;
	}

	public LinkedList<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(LinkedList<Profesor> profesores) {
		this.profesores = profesores;
	}
	
	
	
}
