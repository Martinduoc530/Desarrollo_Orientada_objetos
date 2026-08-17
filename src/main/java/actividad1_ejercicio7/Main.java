package actividad1_ejercicio7;

class Mascota {

    String nombre;
    String especie;
    int edad;
    double peso;
    boolean vacunada;

    public Mascota(String nombre, String especie, int edad, double peso, boolean vacunada) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.vacunada = vacunada;
    }

    // Método 1: mostrar la ficha de la mascota
    public void mostrarFicha() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Vacunada: " + vacunada);
    }

    public void vacunar() {

        if (!vacunada) {
            vacunada = true;
            System.out.println("Vacuna registrada correctamente");
        } else {
            System.out.println("La mascota ya se encuentra vacunada");
        }
    }

    public void actualizarPeso(double nuevoPeso) {

        if (nuevoPeso > 0) {
            peso = nuevoPeso;
            System.out.println("Peso actualizado correctamente");
        } else {
            System.out.println("El peso ingresado no es valido");
        }
    }
}


public class Main {

    public static void main(String[] args) {

        Mascota mascota1 = new Mascota(
                "Apolo",
                "Perro",
                7,
                29.0,
                false
        );

        mascota1.mostrarFicha();

        System.out.println();

        mascota1.vacunar();

        System.out.println();

        mascota1.actualizarPeso(28.5);

        System.out.println();

        mascota1.mostrarFicha();


        // Dejé fuera datos como el color del pelaje y el tamaño de las patas,
        // porque no son necesarios para una ficha veterinaria básica orientada
        // al control de identificación, peso y estado de vacunación.
    }
}