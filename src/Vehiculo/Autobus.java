package Vehiculo;

public class Autobus extends Vehiculo{
	//LA CLASE AUTOBUS HEREDA DE VEHÍCULO, LA CUAL ES ABSTRACTA

	//ATRIBUTOS
	private int numAutobus;
	private int numParadas;
	
	//CONSTRUCTOR
	public Autobus(String marca, String modelo, String numBastidor, int numPuertas, int numAutobus, int numParadas) {
		super(marca, modelo, numBastidor, numPuertas);
		this.numAutobus = numAutobus;
		this.numParadas = numParadas;
	}


	//MÉTODOS GETTERS Y SETTERS
	public int getNumAutobus() {
		return numAutobus;
	}


	public void setNumAutobus(int numAutobus) {
		this.numAutobus = numAutobus;
	}


	public int getNumParadas() {
		return numParadas;
	}


	public void setNumParadas(int numParadas) {
		this.numParadas = numParadas;
	}


	@Override
	public String toString() {
		return "** Autobus **\n" + super.toString() + "\nNumAutobus: " + numAutobus + "\nNumParadas: " + numParadas;
	}
	
	
}
