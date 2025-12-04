import java.util.Scanner;

public class FoodieDelivery {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    GestorPedidos miGestor = new GestorPedidos(); 
    PlatoComida P1 = new PlatoComida("P1", "Hamburguesa", 25000, false);
    PlatoComida P2 = new PlatoComida("P2", "Hamburguesa", 20000, true);
    PlatoComida P3 = new PlatoComida("P3", "HogDog", 15000, false);
    Bebida B1 = new Bebida("B1", "Coca Cola", 5000, 500);
    Bebida B2 = new Bebida("B2", "Coca Cola", 3500, 300);

        System.out.println("--- MENU DEL DÍA ---");
        System.out.println("1. " + P1.obtenerDetalles());
        System.out.println("2. " + P2.obtenerDetalles());
        System.out.println("3. " + P3.obtenerDetalles());
        System.out.println("4. " + B1.obtenerDetalles());
        System.out.println("5. " + B2.obtenerDetalles());


    System.out.println("¿Que Producto(s) desea P1, P2 o P3?");
    String opcionComida = scanner.nextLine();
    if (opcionComida.equalsIgnoreCase("P1")){
        miGestor.agregarItem(P1);
    } else if (opcionComida.equalsIgnoreCase("P2")){
        miGestor.agregarItem(P2);
    } else if (opcionComida.equalsIgnoreCase("P3")){
        miGestor.agregarItem(P3);
    } else {
        System.out.println("Código incorrecto.");
    }
    System.out.println("¿Que Producto(s) desea B1 o B2?");
    String opcionBebida = scanner.nextLine();
    if (opcionBebida.equalsIgnoreCase("B1")){
        miGestor.agregarItem(B1);
    } else if (opcionBebida.equalsIgnoreCase("B2")){
        miGestor.agregarItem(B2);
        } else {
        System.out.println("Código incorrecto.");
        
    }System.out.println("Pedido Final");
        double totalPagar = 0;
        ItemMenu[] lista = miGestor.getPedidos();

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                System.out.println(lista[i].obtenerDetalles());
                totalPagar += lista[i].getPrecio();
            }
        }
        System.out.println("TOTAL A PAGAR: $" + totalPagar);
    }
    }
