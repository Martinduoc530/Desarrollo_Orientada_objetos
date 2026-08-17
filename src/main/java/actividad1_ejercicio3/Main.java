package actividad1_ejercicio3;

class Producto {

    String nombreProducto;
    String modeloProducto;
    int precio;
    int unidades;

    public Producto(String nombreProducto, String modeloProducto, int precio, int unidades) {
        this.nombreProducto = nombreProducto;
        this.modeloProducto = modeloProducto;
        this.precio = precio;
        this.unidades = unidades;
    }


    public void mostrarProducto() {
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Modelo del producto: " + modeloProducto);
        System.out.println("Precio: " + precio);
        System.out.println("Unidades: " + unidades);
    }


    public void actualizarStock() {
        if (unidades > 0) {
            unidades = unidades - 1;
            System.out.println("Stock actualizado");
        } else {
            System.out.println("No hay unidades disponibles");
        }
    }


    public boolean hayStock() {
        return unidades > 0;
    }
}


public class Main {

    public static void main(String[] args) {

        var producto1 = new Producto(
                "Notebook",
                "Lenovo IdeaPad 5",
                650000,
                3
        );

        producto1.mostrarProducto();

        System.out.println();

        producto1.actualizarStock();

        System.out.println();

        producto1.mostrarProducto();

        System.out.println();

        System.out.println("¿Hay stock?: " + producto1.hayStock());


        // Dejé fuera características como el color y el peso físico del producto,
        // porque no son necesarias para mostrar la información básica
        // ni para controlar el stock cuando se realiza una venta.
    }
}