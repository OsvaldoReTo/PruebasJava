package claseAbstracta;

public abstract class Asignatura {
	private String nombre;
	private int clave;
	private String profesor;
	
	public Asignatura() {}//constructor
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}//setNombre
	
	public String getNombre() {
		return nombre;
	}//getNombre
	
	public void setClave(int clave) {
		this.clave=clave;
	}//setClave
	
	public int getClave() {
		return clave;
	}//getClave
	
	public void setProfesor(String profesor) {
		this.profesor=profesor;
	}//setProfesor
	
	public String getProfesor() {
		return profesor;
	}//getProfesor
	
	public abstract void evaluacion();
}
