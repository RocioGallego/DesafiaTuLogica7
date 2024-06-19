package Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		//CREACIÓN DE 2 OBJETOS TIPO TAXI:

		Taxi taxiToyota = new Taxi ("Toyota", "Corolla","4587LO8954PO23000", 5, Asientos.CALEFACCION, 32.00, 2.00);
		Taxi taxiSkoda = new Taxi("Skoda", "Octavia", "777KLN85274LLL900",4, Asientos.RECLINABLES,56.00,2.00);

		//CREACIÓN DE 2 OBJETOS TIPO PARTICULAR:

		Particular partTiguan = new Particular ("Volkswagen", "Tiguan","2344ERTF56784FDS0",5, Asientos.CUERO, "Cristian Rodriguez Duarte", true);
		Particular partNissan = new Particular ("Nissan", "Qashqai", "3ER2TF6758U9O1A2X",5, Asientos.RECLINABLES, "Rocio Linares Fuego", true);

		//CREACION DE 1 OBJETO TIPO AUTOBUS:
		Autobus bus = new Autobus ("Mercedes-Benz","Citaro", "45LL9I8TT7667R45D",2,456,8);

		//MOSTRAR LOS DATOS DE TODOS LOS OBJETOS CON MÉTODO toString
		System.out.println("Primer taxi: ");
		System.out.println(taxiToyota.toString());
		System.out.println("\n-------");
		System.out.println("Segundo taxi: ");
		System.out.println(taxiSkoda.toString());
		System.out.println("\n-------");
		System.out.println("Primer particular:");
		System.out.println(partTiguan.toString());
		System.out.println("\n-------");
		System.out.println("Segundo particular:");
		System.out.println(partNissan.toString());
		System.out.println("\n-------");
		System.out.println("Información del autobús: ");
		System.out.println(bus.toString());

		//CREO UNA LISTA PARA ALMACENAR TODOS LOS VEHICULOS Y LOS AGREGO PARA MOSTRARLOS.
		List<Vehiculo>vehiculos = new ArrayList<>();
		vehiculos.add(taxiSkoda);
		vehiculos.add(taxiToyota);
		vehiculos.add(partNissan);
		vehiculos.add(partTiguan);
		vehiculos.add(bus);
		//CALCULO LOS VEHÍCULOS QUE HAY FUNCIONANDO
		int vehiculosFuncionando = Vehiculo.getCantidadVehiculosFuncionando();

		System.out.println("\nLos vehículos en funcionamiento son: " + vehiculosFuncionando  );

		//REINICIAR EL CUENTAKM DEL OBJETO 1 TAXI A 25.000Km
		System.out.println("\nAhora vamos a reiniciar el contador del primer taxi a 25.000km");
		System.out.println("Reiniciando contador...");
		taxiToyota.reiniciarContador(25000.00);

		//CALCULO DEL COSTE DEL TRAYECTO DEL PRIMER OBJETO TAXI
		taxiToyota.setKmRecorridos(25000.00);//ESTABLEZCO EL VALOR DE LOS KM RECORRIDOS
		taxiToyota.setImporteKm(2.00);

		System.out.println(taxiToyota.toString());

		//REINICIAR EL CUENTAKM DEL OBJETO 1 PARTICULAR A 10.000 KM
		System.out.println("\nReiniciando el contador del primer particular...");
		partTiguan.reiniciarContador(10000.00);

		//CAMBIA EL NOMBRE DEL PROPIETARIO DEL PROPIETARIO CORRESPONDIENTE AL PARTICULAR 2
		partNissan.setPropietario("Alonso Espinosa Rodriguez");

		//MÉTODO toString PARA MOSTRAR TODA LA INFORMACIÓN
		System.out.println("\nInformación actualizada del primer particular:");
		System.out.println(partTiguan.toString());
		System.out.println("  .......  ");
		System.out.println("\nInformación actualizada del segundo particular:");
		System.out.println(partNissan.toString());


		//MOSTRAR EL PRECIO DEL ALQUILER DEL TAXI SEGÚN EL NÚMERO DE DÍAS
		System.out.println("\nEl alquiler del primer taxi por 6 días será: ");
		System.out.println(taxiToyota.calcularPrecioAlquiler(6) + " €");


	}

}
