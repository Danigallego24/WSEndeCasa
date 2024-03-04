package casa;

public class Direccion {
	//La dirección podrá tener un tipo de vía, un nombre de vía, una localidad y un código postal.
	
	private String tipoVia;
	private String nombreVia;
	private String localidad;
	private int codigoPostal;
	
	//Constructores
	public Direccion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Direccion(String tipoVia, String nombreVia, String localidad, int codigoPostal) {
		super();
		this.tipoVia = tipoVia;
		this.nombreVia = nombreVia;
		this.localidad = localidad;
		this.codigoPostal = codigoPostal;
	}
	
	//Getters and Setters
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", nombreVia=" + nombreVia + ", localidad=" + localidad
				+ ", codigoPostal=" + codigoPostal + "]";
	}

}
