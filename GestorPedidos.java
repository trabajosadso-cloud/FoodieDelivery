public class GestorPedidos {
    private ItemMenu [] pedidos;
    private int contador;

    public GestorPedidos() {
        pedidos = new ItemMenu[5];
        contador = 0;
    }

    public void agregarItem(ItemMenu item) {
        pedidos[contador] = item;
        contador++;
    }
    public ItemMenu[] getPedidos(){
        return pedidos;
    }
}