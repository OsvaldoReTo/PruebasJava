package Interfaces;

public class Matematicas implements Asignatura{
	private String nombre;
	private int[] calificaciones;
	private String profesor;
	private String horario;
	
	public Matematicas(String nombre, int[] calificaciones, String profesor, String horario) {
		this.nombre=nombre;
		this.calificaciones=calificaciones;
		this.profesor=profesor;
		this.horario=horario;
	}
	
	public String getProfesor() {
		return profesor;
	}
	
	public double getPromedio() {
		double prom=0.0;
		double sum=0.0;
		for(int i=0; i<calificaciones.length; i++) {
			sum += calificaciones[i];
		}
		prom = sum/calificaciones.length;
		return prom;
	}
	public String getHorario() {
		return horario;
	}
	public String getNombre() {
		return nombre;
	}
}
