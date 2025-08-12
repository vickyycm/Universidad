package proyecto_1;

import java.time.LocalDate;
import java.util.LinkedList;

public class Profesor extends Persona{
	
	protected LinkedList<Materia> materias;

	public Profesor(String nombre, String apellido, String mail, int dni, LocalDate fecha_nac,
			LinkedList<Materia> materias) {
		super(nombre, apellido, mail, dni, fecha_nac);
		this.materias = materias;
	}

	public LinkedList<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(LinkedList<Materia> materias) {
		this.materias = materias;
	}
	
	
	
}
