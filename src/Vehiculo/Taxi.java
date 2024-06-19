package Vehiculo;

public class Taxi extends Turismo implements Calculable, Iniciable{
	//LA CLASE TAXI HEREDA DE TURISMO, ADEMÁS IMPLEMENTA DOS INTERFACES CALCULABLE E INICIABLE

	//ATRIBUTOS
	private double kmRecorridos;
	private static final double IMPORTE_INICIO = 2.00;
	private double importeKm;
	private double importeTotal;

	//CONSTRUCTOR
	public Taxi(String marca, String modelo, String numBastidor, int numPuertas, Asientos tiposAsiento,double kmRecorridos, double importeKm) {
		super(marca, modelo, numBastidor, numPuertas, tiposAsiento);
		this.kmRecorridos = kmRecorridos;
		this.importeKm = importeKm;
		this.importeTotal = calcularCosteTrayecto(); 
	}

	//MÉTODOS
	public double getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
		this.importeTotal = calcularCosteTrayecto(); //ACTUALIZAR EL COSTE CUANDO CAMBIO LOS KM.
	}

	public double getImporteKm() {
		return importeKm;
	}

	public void setImporteKm(double importeKm) {
		this.importeKm = importeKm;
		this.importeTotal = calcularCosteTrayecto (); // ACTUALIZAR EL COSTE CUANDO CAMBIO EL IMPORTE POR KM.
	}


	public static double getImporteInicio() {
		return IMPORTE_INICIO;
	}

	@Override
	public double calcularPrecioAlquiler(int numDias) {
		double precio = 50.00;
		return numDias * precio;
	}

	@Override
	public int getMaxVelocidad() {

		return 200;
	}

	@Override
	public double calcularCosteTrayecto() {

		double importeTotal = IMPORTE_INICIO + (kmRecorridos * importeKm);

		return importeTotal;
	}



	@Override
	public void reiniciarContador(double km) {
		System.out.println("El taxi tiene acumulados un total de " + km + "km.\n");

	}

	@Override
	public String toString() {
		return "** Taxi **\n" + super.toString() + "\nImporte inicio: " + IMPORTE_INICIO + " €" + "\nKilómetros recorridos: " + kmRecorridos + " km"  + "\nImporte km: " + importeKm + " €" + "\nCoste del trayecto: " + importeTotal + " €" ;
	}


}
