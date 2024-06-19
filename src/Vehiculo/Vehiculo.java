package Vehiculo;

public abstract class Vehiculo {

	//ATRIBUTOS
	private String marca;
	private String modelo;
	private String numBastidor;
	private int numPuertas;
	private static int cantidadVehiculosFuncionando = 0;

	//CONSTRUCTOR
	public Vehiculo (String marca, String modelo, String numBastidor, int numPuertas) {
		this.marca = marca;
		this.modelo = modelo;
		this.numBastidor = numBastidor;
		this.numPuertas = numPuertas;
		cantidadVehiculosFuncionando ++;
		//SI EL NÚMERO DE BASTIDOR ES MENOR DE 17 NOS DARÁ UN MENSAJE, PARA QUE INTRODUZCAMOS UN NÚMERO CORRECTO
		if (numBastidor.length() !=17) {
			System.out.println("El número de bastidor debe tener 17 carácteres.");
		}

	}

	//MÉTODOS GETTERS Y SETTERS
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNumBastidor() {
		return numBastidor;
	}

	public void setNumBastidor(String numBastidor) {
		this.numBastidor = numBastidor;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public static int getCantidadVehiculosFuncionando() {
		return cantidadVehiculosFuncionando;
	}

	//MÉTODO toString
	@Override
	public String toString() {
		return "Marca: " + marca + "\nModelo: " + modelo + "\nNumBastidor: " + numBastidor + "\nNumPuertas: "
				+ numPuertas;
	}







}
