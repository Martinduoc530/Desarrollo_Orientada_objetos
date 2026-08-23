package actividad1_2_4_ejercicio1;
// Nombre de la Clase
class Auto {
    // Atributos
    private String modelo;
    private String marca;
    private String color;
    private int anio;
    private double km;
    private String tipo;


    public Auto(String modelo, String marca, String color, int anio, double km, String tipo){
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
        this.modelo = modelo;
    }
    public void avanzar(double distancia){
        km = km + distancia;

        System.out.println("Avanzando: " + distancia + "km. km totales: " + km);


    }


    public void retroceder(double distancia){
        km = km - distancia;
        System.out.println("Retrocediendo: " + distancia + "km. km totales: " + km);


    }


}



public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Yaris", "Toyota", "Rojo", 2020, 35000, "Sedan");
        System.out.println("Modelo: " + auto1.getModelo());
        System.out.println("Marca: " + auto1.getMarca());


        auto1.avanzar(120);
        auto1.retroceder(20);

    }


}
