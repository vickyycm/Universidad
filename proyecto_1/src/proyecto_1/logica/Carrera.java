package proyecto_1.logica;

import java.util.LinkedList;

public class Carrera {

	protected String nombre;
	protected int id_carrera;
	protected LinkedList<Materia> materias;
	
	public Carrera(String nombre, int id_carrera, LinkedList<Materia> materias) {
		super();
		this.nombre = nombre;
		this.id_carrera = id_carrera;
		this.materias = materias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId_carrera() {
		return id_carrera;
	}

	public void setId_carrera(int id_carrera) {
		this.id_carrera = id_carrera;
	}

	public LinkedList<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(LinkedList<Materia> materias) {
		this.materias = materias;
	}
	
	
	
}
