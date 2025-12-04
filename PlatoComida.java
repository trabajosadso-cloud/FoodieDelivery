public class PlatoComida extends ItemMenu {

    private boolean esVegetariano;

    public PlatoComida (String id, String nombre, double precio, boolean esVegetariano) {
        super (id, nombre, precio);
        this.esVegetariano = esVegetariano;
    }
    
    @Override
    public String obtenerDetalles() {
    return super.obtenerDetalles() + ", es vegetariano? " + esVegetariano;

    }
}
