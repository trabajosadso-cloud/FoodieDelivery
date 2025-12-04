package Examen2;

public class Reserva {
    private String codigo;
    private String nombrePelicula;
    private double costoBase;
//Constructro
    public Reserva ( String codigo, String nombrepelicula, double costoBase) {
        this.codigo = codigo;
        this.nombrePelicula = nombrePelicula;
        this.costoBase = costoBase;
    }
    public String obtenerDetalles() {
        return "Codigo: "+ codigo + " Pelicula: " + nombrePelicula +" Costo Base: " + costoBase;
    }

    public String getCodigo () {
        return codigo;
    }

    public String getNombrepelicula () {
        return nombrePelicula;
    }

    public double getCostobase () {
        return costoBase;
    }

    public void setNombrepelicula (String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;       
    }

    public void setCostobase (double costoBase) {
        this.costoBase = costoBase;
        
    }
    
    public double calcularPrecioFinal() {
        return costoBase;
    }
    
}
