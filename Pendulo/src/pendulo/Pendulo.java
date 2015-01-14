package pendulo;

public class Pendulo {
	//atributos
	private double longitud;
	private final double gravedad=9.8;
	//constructor
	public Pendulo(double longitud) {
		this.longitud = longitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	//Metodo
	public double CalcularPeriodo(){
	return 2*Math.PI*Math.sqrt(this.longitud/this.gravedad);
	}
	@Override
	public String toString() {
		return "Pendulo [longitud=" + longitud + ", CalcularPeriodo()="
				+ CalcularPeriodo() + "]";
	}
	
	}
	
	
	
	

