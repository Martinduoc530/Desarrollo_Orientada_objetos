package actividad1_ejercicio8;

import java.util.ArrayList;

class Pedido {

    String cliente;
    String direccion;
    String estado;
    ArrayList<String> productos;
    ArrayList<Integer> precios;

    public Pedido(String cliente, String direccion, String estado) {
        this.cliente = cliente;
        this.direccion = direccion;
        this.estado = estado;
        this.productos = new ArrayList<>();
        this.precios = new ArrayList<>();
    }

    public void agregarProducto(String producto, int precio) {

        if (precio > 0) {
            productos.add(producto);
            precios.add(precio);
            System.out.println(producto + " agregado al pedido");
        } else {
            System.out.println("El precio del producto no es válido");
        }
    }

    public int calcularTotal() {

        int total = 0;

        for (int precio : precios) {
            total = total + precio;
        }

        return total;
    }

    public void actualizarEstado(String nuevoEstado) {
        estado = nuevoEstado;
        System.out.println("Estado actualizado a: " + estado);
    }

    public void mostrarPedido() {

        System.out.println("Cliente: " + cliente);
        System.out.println("Dirección: " + direccion);
        System.out.println("Estado: " + estado);

        System.out.println("Productos:");

        for (String producto : productos) {
            System.out.println("- " + producto);
        }

        System.out.println("Total: $" + calcularTotal());
    }
}


public class Main {

    public static void main(String[] args) {

        var pedido1 = new Pedido(
                "Martin",
                "Av. Principal 123",
                "Preparando"
        );

        pedido1.agregarProducto("Hamburguesa", 8500);
        pedido1.agregarProducto("Papas fritas", 3500);
        pedido1.agregarProducto("Bebida", 2000);

        System.out.println();

        pedido1.mostrarPedido();

        System.out.println();

        pedido1.actualizarEstado("En camino");

        System.out.println();

        pedido1.mostrarPedido();


        // Dejé fuera datos como el medio de transporte del repartidor
        // y la descripción física de los productos, porque no son necesarios
        // para registrar el pedido, calcular su total y controlar su estado.
    }
}