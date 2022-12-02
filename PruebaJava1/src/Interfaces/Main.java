package Interfaces;

public class Main {

	public static void main(String[] args) {
		int[] cAlg1={9,7,5,6};
		int[] cGeoA2 = {10,8,6,4,2};
		int[] cOrtyRed1= {10,9,9,9,10,10};
		int[] cLengyLitH = {7,6,9,3,9};
		Matematicas a1 = new Matematicas("Algebra 1",cAlg1,"Arturo Zentella Dehesa", "Martes y Jueves 13:00-15:00" );
		Matematicas a2 = new Matematicas("Geometria Analitica 2",cGeoA2,"Marcos Turcio Cuevas", "Lunes, Miercoles y Viernes 11:00-13:00" );
		Español a3 = new Español("Ortografia y Redaccion 1", cOrtyRed1, "Josselyn Ileana Mosco García");
		Español a4 = new Español("Lengua y literatura Hispanoamericana", cLengyLitH, "Hector Ivan Perez Gonzalez");
		
		calificaciones(a1);
		calificaciones(a2);
		calificaciones(a3);
		calificaciones(a4);
	}
	public static void calificaciones(Asignatura A) {
		System.out.println("==========================================================================================");
		System.out.println("En la asignatura "+A.getNombre()+" cursada con: " + A.getProfesor());
		System.out.println("Se tiene un promedio de: "+ A.getPromedio());
		System.out.println("==========================================================================================");
	}
}
