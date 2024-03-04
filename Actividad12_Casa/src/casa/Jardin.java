package casa;

public class Jardin {

	private int metrosCuadrados;
	private int numeroDePlantas;
	
	public Jardin(int metrosCuadrados, int numeroDePlantas) {
		this.metrosCuadrados = metrosCuadrados;
		this.numeroDePlantas = numeroDePlantas;
	}

	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public int getNumeroDePlantas() {
		return numeroDePlantas;
	}

	public void setNumeroDePlantas(int numeroDePlantas) {
		this.numeroDePlantas = numeroDePlantas;
	}
}