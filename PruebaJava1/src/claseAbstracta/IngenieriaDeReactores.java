package claseAbstracta;

public class IngenieriaDeReactores extends Asignatura{
	public IngenieriaDeReactores(){
		super();
		setNombre("Ingenieria de Reactores");
		setClave(1570);
		setProfesor("Osvaldo Resendiz Tolentino");
	}
	
	public void evaluacion() {
		System.out.println(getNombre() + " considera: "+ "\n"+
		"70% examen "+"\n" +"30% tareas");
	}
	
	
}//class IngenieriaDeReactores
