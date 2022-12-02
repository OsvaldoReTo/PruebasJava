package Interfaces;

public class Español implements Asignatura{
	private String nombre;
	private int[] calificaciones;
	private String profesor;
	
	public Español(String nombre, int[] calificaciones, String profesor) {
		this.nombre=nombre;
		this.calificaciones=calificaciones;
		this.profesor=profesor;
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
		prom = sum/calificaciones.length + 0.5;
		if(prom >=10.0) {
			prom = 10.0;
		}
		return prom;
	}
	public String getNombre() {
		return nombre;
	}
}
