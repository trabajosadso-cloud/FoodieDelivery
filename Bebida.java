public class Bebida extends ItemMenu{

    private int volumenML;

    public Bebida (String id, String nombre, double precio, int volumenML) {
        super (id, nombre, precio);
        this.volumenML = volumenML;
    }
    
    @Override
    public String obtenerDetalles() {
    return super.obtenerDetalles() + ", El volumen de la bebida es " + volumenML + " ml";

    }
    
}
