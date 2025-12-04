package Examen2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GestorReservas miReserva = new GestorReservas();
        Sala3D P1 = new Sala3D("P1","La Monja", 12000, 3000);
        Sala3D P2 = new Sala3D("P2","Duro de Matar", 12000, 3000);
        SalaTradicional P3 = new SalaTradicional("P3", "Denom Slayer", 7500, 150);
        SalaTradicional P4 = new SalaTradicional("P4", "Toy Story 5", 7500, 110);


        System.out.println("FUNCIONES DEL DIA");

        System.out.println(P1.obtenerDetalles());
        System.out.println(P2.obtenerDetalles());
        System.out.println(P3.obtenerDetalles());
        System.out.println(P4.obtenerDetalles());

        System.out.println("¿Que pelicula desea ver P1, P2, P3 o P4?");

        String Pelicula = scanner.nextLine();
        if (Pelicula.equalsIgnoreCase("P1")) {
            miReserva.agregarReserva(P1);            
        } else if (Pelicula.equalsIgnoreCase("P2")){
        miReserva.agregarReserva(P2);
        } else if (Pelicula.equalsIgnoreCase("P3")){
        miReserva.agregarReserva(P3);
        } else if (Pelicula.equalsIgnoreCase("P4")){
        miReserva.agregarReserva(P4);
        } else {
            System.out.println("Código incorrecto.");
        }
        System.out.println("Cuantas entradas desea comprar?");
        double cantidad = scanner.nextInt();

        System.out.println("Pedido Final Reserva");
        double totalPagar = 0;
        Reserva [] lista = miReserva.getReservas();

        for ( int i = 0; i < lista.length; i++) {
            if (lista [i] != null) {
                System.out.println( lista [i].obtenerDetalles());
                totalPagar += lista[i].calcularPrecioFinal();
            }
        }
        System.out.println("Total a pagar de la Reserva: $" + totalPagar*cantidad);
}
}
