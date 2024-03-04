package casa;

public class Habitacion {
	
	//A continuación se muestran los atributos de la clase Habitacion
	
	private String nombre;
	private int metrosCuadrados;
	private enumHabitacion tipoHabitacion;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}
	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
	public enumHabitacion getTipoHabitacion() {
		return tipoHabitacion;
	}
	public void setTipoHabitacion(enumHabitacion tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

}
