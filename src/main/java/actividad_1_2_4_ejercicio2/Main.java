package actividad_1_2_4_ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

class Auto {

    private String modelo;
    private String marca;
    private String color;
    private int anio;
    private double km;
    private String tipo;

    public Auto(String modelo, String marca, String color, int anio, double km, String tipo) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.anio = anio;
        this.km = km;
        this.tipo = tipo;




    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public int getAnio() {
        return anio;
    }

    public double getKm() {
        return km;
    }

    public String getTipo() {
        return tipo;
    }

    public void setModelo(String modelo) {
        switch (modelo) {
            case "Yaris":
                this.modelo = modelo;
                System.out.println("Modelo actualizado a Yaris");
                break;

            case "Corolla":
                this.modelo = modelo;
                System.out.println("Modelo actualizado a Corolla");
                break;

            case "Rav4":
                this.modelo = modelo;
                System.out.println("Modelo actualizado a Rav4");
                break;

            default:
                System.out.println("Modelo invalido");













        }
    }

    public void setColor(String color) {

            if (color == null || color.isBlank()) {
                System.out.println("Ese color no existe");
            }else{
                this.color = color;
                System.out.println("Color actualizado correctamente");


            }

    }


    public void setMarca(String marca){
        if (marca == null || marca.isBlank()) {
            System.out.println("Marca invalida");

        } else {
            this.marca = marca;
            System.out.println("Marca actualizada correctamente");

        }


    }

    public void setKm(double km) {


        if (km >= 0) {
            this.km = km;
            System.out.println("Kilometraje actualizado");
        } else {
            System.out.println("el kilometraje no puede ser negativo");


        }
    }



    public void setAnio(int anio) {

        if (anio > 0) {
            this.anio = anio;
            System.out.println("Anio actualizado");
        } else {
            System.out.println("El anio no es valido");


        }

    }


    public void setTipo(String tipo){
        switch (tipo) {
            case "Sedan":
                this.tipo = tipo;
                System.out.println("Tipo de auto sedan actualizado");
                break;

            case "SUV":
                this.tipo = tipo;
                System.out.println("Tipo de auto SUV actualizado");
                break;

            case "Hatchback":
                this.tipo = tipo;
                System.out.println("Tipo de auto Hatchback actualizado");
                break;


            default:
                System.out.println("Tipo de auto invalido");
                break;


        }
    }










    public void avanzar(double distancia){

        km = km + distancia;
        System.out.println("Avanzando: " + distancia + "km. km totales: " + km);



    }
    public void retroceder(double distancia) {
        km = km - distancia;
        System.out.println("Retrocediendo: " + distancia + "km. km totales: " + km);



    }

    public void mostrar() {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Modelo del auto" + modelo);
        lista.add("Marca del auto: " + marca);
        lista.add("Anio del auto: " + anio);
        lista.add("Kilometros del auto: " + km);
        lista.add("Tipo del auto: " + tipo);


        System.out.println("Lista");

        for (String Mostrardato : lista ) {
            System.out.println(Mostrardato);;


        }
    }



}










public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nuevo color: ");

        String nuevocolor = entrada.nextLine();


        Auto auto1 = new Auto("Yaris", "Toyota", "Rojo", 2020, 35000, "Sedan");
        System.out.println("Modelo: " + auto1.getModelo());
        System.out.println("Marca: " + auto1.getMarca());

        System.out.println();


        auto1.setColor(nuevocolor);
        System.out.println("Nuevo color: " + auto1.getColor());

        System.out.println();


        auto1.setMarca("Honda");
        System.out.println("Nueva marca: " + auto1.getMarca());


        System.out.println();

        auto1.setModelo("Corolla");
        System.out.println("Nuevo modelo: " + auto1.getModelo());

        System.out.println();


        auto1.setKm(40000);

        System.out.println("Nuevo kilometraje: " + auto1.getKm());


        System.out.println();

        auto1.setAnio(2022);
        System.out.println("Nuevo anio: " + auto1.getAnio());

        System.out.println();


        auto1.setTipo("SUV");
        System.out.println("Nuevo tipo: " + auto1.getTipo());

        System.out.println();


        auto1.avanzar(120);
        auto1.retroceder(20);

        System.out.println();

        auto1.mostrar();


        entrada.close();

        // Los atributos se declararon private para proteger la información del auto.
// Los getters permiten consultar los datos y los setters modificarlos de forma controlada,
// aplicando validaciones para fortalecer el encapsulamiento.










    }

}
