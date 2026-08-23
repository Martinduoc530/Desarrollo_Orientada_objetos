package actividad_1_2_4_ejercicio3;
class Auto {

    private String modelo;
    private String marca;
    private double km;
    private boolean enMovimiento;

    public Auto(String modelo, String marca, double km) {
        this.modelo = modelo;
        this.marca = marca;
        this.km = km;
        this.enMovimiento = false;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getKm() {
        return km;
    }

    public boolean isEnMovimiento() {
        return enMovimiento;
    }

    public void avanzar(double distancia) {

        if (distancia > 0) {
            km = km + distancia;
            enMovimiento = true;

            System.out.println("El auto avanzó " + distancia + " km");
        } else {
            System.out.println("La distancia no es válida");
        }
    }

    public void detener() {

        if (enMovimiento) {
            enMovimiento = false;
            System.out.println("El automóvil se ha detenido");
        } else {
            System.out.println("El automóvil ya estaba detenido");
        }
    }

    public void reportarEstado() {

        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Kilometraje: " + km);

        if (enMovimiento) {
            System.out.println("Estado: En movimiento");
        } else {
            System.out.println("Estado: Detenido");
        }
    }
}


public class Main {

    public static void main(String[] args) {

        Auto auto1 = new Auto(
                "Yaris",
                "Toyota",
                35000
        );

        System.out.println("ESTADO INICIAL");
        auto1.reportarEstado();

        System.out.println();

        auto1.avanzar(120);

        System.out.println();

        System.out.println("DESPUÉS DE AVANZAR");
        auto1.reportarEstado();

        System.out.println();

        auto1.detener();

        System.out.println();

        System.out.println("ESTADO FINAL");
        auto1.reportarEstado();


       // Se agregó el estado enMovimiento y el método detener() para representar de forma más clara el comportamiento del automóvil. Esto permite saber si el vehículo se encuentra desplazándose o detenido y reportar su estado actual dentro del sistema.










    }
}