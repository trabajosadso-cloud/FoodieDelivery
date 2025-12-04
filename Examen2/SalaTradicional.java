package Examen2;

// Clase Heredada

public class SalaTradicional extends Reserva {

    private int duracionMin;
    
    public SalaTradicional ( String codigo, String nombrepelicula, double costoBase, int duracionMin) {
        super(codigo, nombrepelicula, costoBase);
        this.duracionMin = duracionMin;
    }
//Polimorfismo Dinamico
    @Override
    public String obtenerDetalles () {

        return super.obtenerDetalles() + "Duracion: " + duracionMin;
    }
    
}
