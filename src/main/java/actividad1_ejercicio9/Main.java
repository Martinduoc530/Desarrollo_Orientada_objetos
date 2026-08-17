package actividad1_ejercicio9;

class EntradaCine {

    String pelicula;
    String horario;
    int precio;
    boolean utilizada;

    public EntradaCine(String pelicula, String horario, int precio, boolean utilizada) {
        this.pelicula = pelicula;
        this.horario = horario;
        this.precio = precio;
        this.utilizada = utilizada;
    }

    public void mostrarEntrada() {
        System.out.println("Película: " + pelicula);
        System.out.println("Horario: " + horario);
        System.out.println("Precio: $" + precio);
        System.out.println("Entrada utilizada: " + utilizada);
    }

    public boolean validarAcceso() {
        return !utilizada;
    }

    public void usarEntrada() {

        if (!utilizada) {
            utilizada = true;
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso rechazado, la entrada ya fue utilizada");
        }
    }
}


public class Main {

    public static void main(String[] args) {

        var entrada1 = new EntradaCine(
                "Interestelar",
                "20:30",
                6500,
                false
        );

        entrada1.mostrarEntrada();

        System.out.println();

        System.out.println("¿Puede ingresar?: " + entrada1.validarAcceso());

        System.out.println();

        entrada1.usarEntrada();

        System.out.println();

        entrada1.mostrarEntrada();

        System.out.println();

        System.out.println("¿Puede ingresar nuevamente?: " + entrada1.validarAcceso());


        // Dejé fuera datos como la sala, el asiento y el tipo de entrada,
        // porque no son necesarios para representar de forma básica su valor,
        // horario y si todavía puede utilizarse para ingresar al cine.
    }
}