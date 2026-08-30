package Ejercicio2_Act1_3_4;


abstract class Vehiculo {

    protected String marca;
    protected String modelo;
    protected int velocidadMaxima;

    public Vehiculo(String marca, String modelo, int velocidadMaxima) {

        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarDatos() {

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad maxima: " + velocidadMaxima);
    }

    public abstract void desplazarse();
}



class Bicicleta extends Vehiculo {

    private String tipoBicicleta;
    private int cantidadCambios;
    private boolean tieneCanasto;
    private boolean electrica;

    public Bicicleta(String marca,
                     String modelo,
                     int velocidadMaxima,
                     String tipoBicicleta,
                     int cantidadCambios,
                     boolean tieneCanasto,
                     boolean electrica) {

        super(marca, modelo, velocidadMaxima);

        this.tipoBicicleta = tipoBicicleta;
        this.cantidadCambios = cantidadCambios;
        this.tieneCanasto = tieneCanasto;
        this.electrica = electrica;
    }


    @Override
    public void desplazarse() {

        System.out.println("La bicicleta se desplaza mediante pedaleo");
    }


    public void cambiarMarcha(int marcha) {

        if (marcha > 0 && marcha <= cantidadCambios) {

            System.out.println("Cambio seleccionado: " + marcha);

        } else {

            System.out.println("Cambio invalido");
        }
    }


    public void tocarTimbre() {

        System.out.println("Timbre de la bicicleta: ring ring");
    }


    public void mostrarBicicleta() {

        mostrarDatos();

        System.out.println("Tipo: " + tipoBicicleta);
        System.out.println("Cantidad de cambios: " + cantidadCambios);
        System.out.println("Tiene canasto: " + tieneCanasto);
        System.out.println("Es electrica: " + electrica);
    }
}



public class Main {

    public static void main(String[] args) {

        Bicicleta bicicleta1 = new Bicicleta(
                "Trek",
                "Marlin 5",
                40,
                "Montana",
                21,
                false,
                false
        );


        bicicleta1.mostrarBicicleta();

        System.out.println();

        bicicleta1.desplazarse();

        bicicleta1.cambiarMarcha(7);

        bicicleta1.tocarTimbre();


        /*
        JUSTIFICACION:

        La clase Bicicleta hereda de Vehiculo porque comparte
        características generales como marca, modelo y velocidad maxima.

        Además, incorpora atributos propios como tipo de bicicleta,
        cantidad de cambios, presencia de canasto y si es electrica.

        Los métodos permiten representar comportamientos propios
        de una bicicleta, como desplazarse, cambiar de marcha
        y tocar el timbre.

        El método desplazarse() sobrescribe el método abstracto
        definido en Vehiculo.
        */
    }
}