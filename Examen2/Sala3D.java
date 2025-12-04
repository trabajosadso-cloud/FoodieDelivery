package Examen2;

// Clase Heredada

public class Sala3D extends Reserva {

    private double valorLentes;
    
    public Sala3D ( String codigo, String nombrePelicula, double costoBase, double valorLentes) {
        super(codigo, nombrePelicula, costoBase);
        this.valorLentes = valorLentes;
    }
    
    public double getValorLentes() {
        return valorLentes;
    }


//Polimorfismo Dinamico
    @Override
    public String obtenerDetalles () {

        return super.obtenerDetalles() + "Valor Lentes: " + valorLentes;
    }@Override 
    public double calcularPrecioFinal () {
        return super.calcularPrecioFinal() + valorLentes; 
    }
    
}