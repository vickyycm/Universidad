package proyecto_1;

import java.time.LocalDate;
import java.util.LinkedList;

public class Alumno extends Persona{

	protected Carrera carrera;
	protected LinkedList<Materia> materias_aprov;
	protected LinkedList<Materia> materias_curso;
	
	
	public Alumno(String nombre, String apellido, String mail, int dni, LocalDate fecha_nac, Carrera carrera,
			LinkedList<Materia> materias_aprov, LinkedList<Materia> materias_curso) {
		super(nombre, apellido, mail, dni, fecha_nac);
		this.carrera = carrera;
		this.materias_aprov = materias_aprov;
		this.materias_curso = materias_curso;
	}


	public Carrera getCarrera() {
		return carrera;
	}


	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}


	public LinkedList<Materia> getMaterias_aprov() {
		return materias_aprov;
	}


	public void setMaterias_aprov(LinkedList<Materia> materias_aprov) {
		this.materias_aprov = materias_aprov;
	}


	public LinkedList<Materia> getMaterias_curso() {
		return materias_curso;
	}


	public void setMaterias_curso(LinkedList<Materia> materias_curso) {
		this.materias_curso = materias_curso;
	}



}

