package Vehiculo;

public abstract class Turismo extends Vehiculo{
	//LA CLASE TURISMO HEREDA DE VEHÍCULOS LAS CUALES SON ABSTRACTAS LAS DOS

	//ATRIBUTOS
	private Asientos tiposAsiento;

	//CONSTRUCTOR
	public Turismo(String marca, String modelo, String numBastidor, int numPuertas, Asientos tiposAsiento) {
		super(marca, modelo, numBastidor, numPuertas);
		this.tiposAsiento = tiposAsiento;
	}

	//DECLARACION Y CREACIÓN DEL ENUM
	Asientos reclinable = Asientos.RECLINABLES;
	Asientos cuero = Asientos.CUERO;
	Asientos calefaccion = Asientos.CALEFACCION;

	//MÉTODOS
	public Asientos getTiposAsiento() {
		return tiposAsiento;
	}

	public void setTiposAsiento(Asientos tiposAsiento) {
		this.tiposAsiento = tiposAsiento;
	}

	@Override
	public String toString() {
		return super.toString() + "\nTipos Asiento: " + tiposAsiento;
	}

	public abstract double calcularPrecioAlquiler (int numDias);

	public abstract int getMaxVelocidad();

}
