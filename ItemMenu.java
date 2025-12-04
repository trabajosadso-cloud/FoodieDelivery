public class ItemMenu {

    private String id;
    private String nombre;
    private double precio; 

    public ItemMenu  (String id, String nombre, double precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String obtenerDetalles() {
        return "Producto con ID: " + id + ", Nombre: " + nombre + ", Precio: " + precio; 
    }

    public String getId () {
        return id;
    }
    public String getNombre () {
        return nombre;
    }
    public double getPrecio () {
        return precio;
    }

 
}