package Vehiculo;

public class Particular extends Turismo implements Iniciable{


	//ATRIBUTOS
	public String propietario;
	public boolean conAireAcondicionado = true;

	//CONSTRUCTOR
	public Particular(String marca, String modelo, String numBastidor, int numPuertas, Asientos tiposAsiento,
			String propietario, boolean conAireAcondicionado) {
		super(marca, modelo, numBastidor, numPuertas, tiposAsiento);
		this.propietario = propietario;
		this.conAireAcondicionado = conAireAcondicionado;

	}

	//MÉTODOS
	public String getPropietario() {
		return propietario;
	}



	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}



	public boolean isConAireAcondicionado() {
		return conAireAcondicionado;
	}



	public void setConAireAcondicionado(boolean conAireAcondicionado) {
		this.conAireAcondicionado = conAireAcondicionado;
	}



	@Override
	public double calcularPrecioAlquiler(int numDias) {
		double precio = 30.00;
		return numDias * precio;
	}

	@Override
	public int getMaxVelocidad() {

		return 220;
	}

	@Override
	public void reiniciarContador(double km) {
		System.out.println ("El particular tiene acumulados un total de " + km + "km.");

	}

	@Override
	public String toString() {
		return "** Particular **\n" + super.toString() + "\nPropietario: " + propietario + "\nCon aire acondicionado: " + conAireAcondicionado;
	}


}
