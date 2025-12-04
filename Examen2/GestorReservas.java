package Examen2;

public class GestorReservas {

    private Reserva [] reservas;
    private int contador;

    public GestorReservas () {
        reservas = new Reserva[4];
        contador = 0;
    }
    public void agregarReserva ( Reserva r) {
        reservas [contador] = r;
        contador++;
    }
    public Reserva[] getReservas() {
        return reservas;
    }
} 