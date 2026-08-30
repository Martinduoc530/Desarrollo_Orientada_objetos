package Ejercicio4_Act_1_3_4;


import java.util.ArrayList;

// CLASE ABSTRACTA PADRE
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

        ArrayList<String> listaDatos = new ArrayList<>();

        listaDatos.add("Marca: " + marca);
        listaDatos.add("Modelo: " + modelo);
        listaDatos.add("Velocidad maxima: " + velocidadMaxima);


        System.out.println("_____LISTA DE DATOS_______");

        for (String datos : listaDatos){
            System.out.println(listaDatos);
        }

    }

    public abstract void desplazarse();
}


// SUBCLASE AUTO
class Auto extends Vehiculo {

    public Auto(String marca, String modelo, int velocidadMaxima) {

        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public void desplazarse() {

        System.out.println("El auto se desplaza por la carretera");
    }
}


// SUBCLASE MOTO
class Moto extends Vehiculo {

    public Moto(String marca, String modelo, int velocidadMaxima) {

        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public void desplazarse() {

        System.out.println("La moto se desplaza entre calles y avenidas");
    }
}


// SUBCLASE BICICLETA
class Bicicleta extends Vehiculo {

    public Bicicleta(String marca, String modelo, int velocidadMaxima) {

        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public void desplazarse() {

        System.out.println("La bicicleta se desplaza mediante pedaleo");
    }
}


// MAIN
public class Main {

    public static void main(String[] args) {

        Vehiculo[] vehiculos = {

                new Auto(
                        "Toyota",
                        "Corolla",
                        180
                ),

                new Moto(
                        "Yamaha",
                        "FZ",
                        140
                ),

                new Bicicleta(
                        "Trek",
                        "Marlin 5",
                        40
                )
        };


        for (Vehiculo vehiculo : vehiculos) {

            vehiculo.mostrarDatos();

            vehiculo.desplazarse();

            System.out.println("--------------------");
        }


        /*
        JUSTIFICACION:

        El polimorfismo se aplica utilizando un arreglo de tipo
        Vehiculo que almacena objetos de diferentes subclases,
        como Auto, Moto y Bicicleta.

        Aunque los objetos son tratados mediante una referencia
        de tipo Vehiculo, al ejecutar desplazarse() cada objeto
        utiliza su propia version del metodo.

        Esto permite trabajar con diferentes tipos de vehiculos
        de manera uniforme manteniendo sus comportamientos
        específicos.
        */
    }
}