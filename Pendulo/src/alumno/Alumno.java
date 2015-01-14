package alumno;
/**
 * Clase que representa un alumno de CFGS DAM
 * @author manuel
 * @version  0.0
*/
public class Alumno {
	//atributos
	private String Nombre;
	private String Nif;
	private int Edad;
	public Alumno(String nombre, String nif, int edad) {
		Nombre = nombre;
		Nif = nif;
		Edad = edad;
	
	/**
	 * Constructor que crea alumnos pasados
	 * @param Nombre
	 * @param Nif
	 * @param Edad
	*/
		 
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getNif() {
		return Nif;
	}
	public void setNif(String nif) {
		Nif = nif;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	@Override
	public String toString() {
		return "Alumno [Nombre=" + Nombre + ", Nif=" + Nif + ", Edad=" + Edad
				+ "]";
	}
	/**
	 * Constructor que crea alumnos pasados
	* Metodo que devuelve boolean indicando si es o no mayor de edad 
	* @return true si es mayor de edad
	*/
	public Boolean esMayorEdad(){
		return this.Edad > 18;
	}
}
	

