package casa;

import java.util.ArrayList;

public class Casa {
	private Direccion direccion;
	private double precio;
	private boolean esSegundaMano;
	private int metrosCuadrados;
	private Jardin jardin;
	private ArrayList<Habitacion> habitaciones;
	
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

	public ArrayList<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	//toString
	
	public String toString() {
		return "Casa [precio=" + precio + ", esSegundaMano=" + esSegundaMano + ", metrosCuadrados=" + metrosCuadrados
				+ "]";
	}
	
	//Chalet
	
	public boolean esUnChalet() {
        return jardin != null;
    }
	
	//precioIva

	public double precioIVA(){
		double precioIVA = 0;
		if(esSegundaMano == true) {
			precioIVA = precio + precio *.05;
		}else {
			precioIVA = precio + precio *.10;
		}
		return precioIVA;
	}
	
	//Metodo para calcular los metros cuadrados(MAURI)
	
	public double calcularMetrosCuadrados() {
        double totalMetros = 0;
        
        // Sumar los metros cuadrados de todas las habitaciones       
        for (Habitacion habitacion : habitaciones) {
            totalMetros += habitacion.getMetrosCuadrados();
        }  
        this.metrosCuadrados = (int) totalMetros;
        // Sumar los metros cuadrados del jardín
        if (jardin != null) {
            totalMetros += jardin.getMetrosCuadrados();
        }
        
        return totalMetros;
    }
	
}