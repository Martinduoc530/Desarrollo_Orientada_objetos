package Ejercicio5_1_3_4;

import java.util.ArrayList;


// CLASE ABSTRACTA BASE
abstract class TransporteParque {

    protected int id;
    protected String nombre;
    protected int capacidad;

    public TransporteParque(int id, String nombre, int capacidad) {

        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public int getId() {
        return id;
    }

    public void mostrarDatos() {
        ArrayList<String> listadatos = new ArrayList<>();

        listadatos.add("ID: " + id);
        listadatos.add("Nombre: " + nombre);
        listadatos.add("Capacidad: " + capacidad);



        for (String dato : listadatos){
            System.out.println(dato);
        }



    }

    public abstract void desplazarse();
}


// INTERFAZ
interface Activable {

    void activar();
}


// SUBCLASE 1
class TrenParque extends TransporteParque implements Activable {

    private int cantidadVagones;

    public TrenParque(int id,
                      String nombre,
                      int capacidad,
                      int cantidadVagones) {

        super(id, nombre, capacidad);

        this.cantidadVagones = cantidadVagones;
    }

    @Override
    public void desplazarse() {

        System.out.println(
                "El tren se desplaza por las rutas del parque"
        );
    }

    @Override
    public void activar() {

        System.out.println("Tren activado");
    }

    public void mostrarVagones() {

        System.out.println(
                "Cantidad de vagones: " + cantidadVagones
        );
    }
}


// SUBCLASE 2
class CarroElectrico extends TransporteParque implements Activable {

    private int bateria;

    public CarroElectrico(int id,
                          String nombre,
                          int capacidad,
                          int bateria) {

        super(id, nombre, capacidad);

        this.bateria = bateria;
    }

    @Override
    public void desplazarse() {

        System.out.println(
                "El carro electrico se desplaza por el parque"
        );
    }

    @Override
    public void activar() {

        System.out.println("Carro electrico activado");
    }

    public void mostrarBateria() {

        System.out.println(
                "Bateria: " + bateria + "%"
        );
    }
}


// MAIN
public class Main {

    public static void main(String[] args) {


        // ARRAYLIST DE TRANSPORTES

        ArrayList<TransporteParque> transportes =
                new ArrayList<>();


        transportes.add(
                new TrenParque(
                        1,
                        "Tren Infantil",
                        30,
                        4
                )
        );


        transportes.add(
                new CarroElectrico(
                        2,
                        "Carro Azul",
                        4,
                        90
                )
        );


        // POLIMORFISMO

        System.out.println("LISTA DE TRANSPORTES");

        for (TransporteParque transporte : transportes) {

            transporte.mostrarDatos();

            transporte.desplazarse();

            System.out.println("--------------------");
        }


        // BUSCAR POR ID

        System.out.println();

        buscarPorId(transportes, 2);


        /*
        JUSTIFICACION:

        La clase abstracta TransporteParque representa los datos
        comunes de los medios de transporte utilizados dentro
        del parque.

        TrenParque y CarroElectrico heredan de TransporteParque
        utilizando extends y agregan atributos y comportamientos
        propios.

        La interfaz Activable establece el comportamiento activar(),
        que ambas subclases deben implementar.

        Se utiliza un ArrayList de tipo TransporteParque para almacenar
        diferentes tipos de transporte y aplicar polimorfismo.

        Además, se implementa el método buscarPorId() para recorrer
        el ArrayList y localizar un transporte mediante su identificador.
        */
    }


    // METODO DE BUSQUEDA

    public static void buscarPorId(
            ArrayList<TransporteParque> transportes,
            int id) {

        for (TransporteParque transporte : transportes) {

            if (transporte.getId() == id) {

                System.out.println("TRANSPORTE ENCONTRADO");

                transporte.mostrarDatos();

                transporte.desplazarse();

                return;
            }
        }

        System.out.println(
                "No se encontro un transporte con ID: " + id
        );
    }
}