package casa;

import java.util.ArrayList;

public class Main_Metodos {

	public static void main(String[] args) {
		
		//Creación de las 2 casas
		
		Jardin jardin1 = new Jardin();
		jardin1.setMetrosCuadrados(20);
		jardin1.setNumeroDePlantas(45);
		
		Jardin jardin2 = new Jardin();
		jardin2.setMetrosCuadrados(50);
		jardin2.setNumeroDePlantas(27);
		
		Direccion direccion1 = new Direccion();
		direccion1.setCodigoPostal(28821);
		direccion1.setLocalidad("Coslada");
		direccion1.setNombreVia("Prado 1");
		direccion1.setTipoVia("Calle");
		
		Direccion direccion2 = new Direccion();
		direccion2.setCodigoPostal(28938);
		direccion2.setLocalidad("Madrid");
		direccion2.setNombreVia("Via Lactea 21");
		direccion2.setTipoVia("Avenida");
		
		ArrayList<Habitacion> listaHabitaciones1 = new ArrayList<Habitacion>();
		
		Habitacion habitacion1 = new Habitacion();
		habitacion1.setMetrosCuadrados(20);
		habitacion1.setNombre("Paris");
		habitacion1.setTipoHabitacion(enumHabitacion.BAÑO);
		
		Habitacion habitacion2 = new Habitacion();
		habitacion2.setMetrosCuadrados(40);
		habitacion2.setNombre("DaniSexo");
		habitacion2.setTipoHabitacion(enumHabitacion.COCINA);
		
		listaHabitaciones1.add(habitacion1);
		listaHabitaciones1.add(habitacion2);
		
		ArrayList<Habitacion> listaHabitaciones2 = new ArrayList<Habitacion>();
		
		Habitacion habitacion3 = new Habitacion();
		habitacion3.setMetrosCuadrados(30);
		habitacion3.setNombre("Alemania");
		habitacion3.setTipoHabitacion(enumHabitacion.SALA_DE_ESTAR);
		
		Habitacion habitacion4 = new Habitacion();
		habitacion4.setMetrosCuadrados(20);
		habitacion4.setNombre("Maemia");
		habitacion4.setTipoHabitacion(enumHabitacion.SALON);
		
		listaHabitaciones2.add(habitacion3);
		listaHabitaciones2.add(habitacion4);
		
		Casa casa1 = new Casa();
		casa1.setDireccion(direccion1);
		casa1.setEsSegundaMano(false);
		casa1.setHabitaciones(listaHabitaciones1);
		casa1.setJardin(jardin1);
		casa1.setMetrosCuadrados(120);
		casa1.setPrecio(150000);
		
		Casa casa2 = new Casa();
		casa2.setDireccion(direccion2);
		casa2.setEsSegundaMano(true);
		casa2.setHabitaciones(listaHabitaciones2);
		casa2.setJardin(jardin2);
		casa2.setMetrosCuadrados(180);
		casa2.setPrecio(390000);
		
		
		ArrayList<Casa> listaCasas = new ArrayList<Casa>();
		
		listaCasas.add(casa1);
		listaCasas.add(casa2);
		
		for(Casa casa : listaCasas) {
			
			System.out.println("-----------------------------------------------");
			
			//Llamamos al metodo toString
			
			System.out.println(casa.toString());
			
			//Llamamos al metodo que nos dira si se trata de un chalet o no
			
			System.out.println("Es un chalet?" + casa.esUnChalet());
			
			//Llamamos al metodo que nos dara el precio con IVA
			
			System.out.println("Precio con IVA: " + casa.precioIVA());
			
			//Llamamos al metodo que nos calcula los metros caudrados
			
			System.out.println("Metros cuadrados: " + casa.calcularMetrosCuadrados());
		}
	}

}
