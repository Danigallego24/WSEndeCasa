package casa;

public class Casa {
	private Direccion direccion;
	private double precio;
	private boolean esSegundaMano;
	private int metrosCuadrados;
	private Jardin jardin;
	private Habitacion habitacion;
	
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isEsSegundaMano() {
		return esSegundaMano;
	}
	public void setEsSegundaMano(boolean esSegundaMano) {
		this.esSegundaMano = esSegundaMano;
	}
	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}
	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
	public Jardin getJardin() {
		return jardin;
	}
	public void setJardin(Jardin jardin) {
		this.jardin = jardin;
	}
	public Habitacion getHabitacion() {
		return habitacion;
	}
	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}
	@Override
	public String toString() {
		return "Casa [precio=" + precio + ", esSegundaMano=" + esSegundaMano + ", metrosCuadrados=" + metrosCuadrados
				+ "]";
	}
	
	//Metodo para calcular los metros cuadrados(MAURI)
	public double calcularMetrosCuadrados() {
        double totalMetros = 0;
        // Sumar los metros cuadrados de todas las habitaciones
        for (Habitacion habitacion : habitaciones) {
            totalMetros += habitacion.getMetrosCuadrados();
        }
        // Sumar los metros cuadrados del jardín
        if (jardin != null) {
            totalMetros += jardin.getMetrosCuadrados();
        }
        return totalMetros;
    }
	
	
	
}