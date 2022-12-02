package claseAbstracta;

public class MecanicaMediosDeformables extends Asignatura {
		public MecanicaMediosDeformables(){
			super();
			setNombre("Mecanica de medios deformables");
			setClave(1320);
			setProfesor("Josselyn Ileana Mosco Garcia");
		}
		
		public void evaluacion() {
		System.out.println(getNombre() + " considera: "+ "\n"+
		"90% examen "+"\n" +"10% tareas");
		}
}
