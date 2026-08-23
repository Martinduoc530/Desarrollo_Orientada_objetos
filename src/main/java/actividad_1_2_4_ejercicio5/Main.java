package actividad_1_2_4_ejercicio5;

class VehiculoEmpresa {

    private String patente;
    private String tipoVehiculo;
    private double km;
    private boolean enServicio;


    public VehiculoEmpresa(String patente, String tipoVehiculo, double km, boolean enServicio) {
        this.patente = patente;
        this.tipoVehiculo = tipoVehiculo;
        this.km = km;
        this.enServicio = enServicio;
    }


    public String getPatente() {
        return patente;
    }


    // Setter de patente usando switch
    public void setPatente(String patente) {

        switch (patente) {

            case "ABCD12":
                this.patente = patente;
                System.out.println("Patente actualizada a ABCD12");
                break;

            case "EFGH34":
                this.patente = patente;
                System.out.println("Patente actualizada a EFGH34");
                break;

            case "IJKL56":
                this.patente = patente;
                System.out.println("Patente actualizada a IJKL56");
                break;

            default:
                System.out.println("Patente invalida");
                break;
        }
    }


    public String getTipoVehiculo() {
        return tipoVehiculo;
    }


    public double getKm() {
        return km;
    }


    public boolean isEnServicio() {
        return enServicio;
    }


    public void iniciarServicio() {

        if (!enServicio) {

            enServicio = true;

            System.out.println("Vehiculo iniciado en servicio");

        } else {

            System.out.println("El vehiculo ya esta en servicio");
        }
    }


    public void registrarRecorrido(double distancia) {

        if (enServicio && distancia > 0) {

            km = km + distancia;

            System.out.println("Recorrido registrado: " + distancia + " km");

        } else {

            System.out.println("No se pudo registrar el recorrido");
        }
    }


    public void finalizarServicio() {

        if (enServicio) {

            enServicio = false;

            System.out.println("Servicio finalizado");

        } else {

            System.out.println("El vehiculo ya estaba fuera de servicio");
        }
    }


    public void mostrarEstado() {

        System.out.println("Patente: " + patente);
        System.out.println("Tipo de vehiculo: " + tipoVehiculo);
        System.out.println("Kilometraje: " + km);
        System.out.println("En servicio: " + enServicio);
    }
}


public class Main {

    public static void main(String[] args) {


        VehiculoEmpresa[] vehiculos = {

                new VehiculoEmpresa(
                        "ABCD12",
                        "Furgon",
                        45000,
                        false
                ),

                new VehiculoEmpresa(
                        "EFGH34",
                        "Camioneta",
                        32000,
                        false
                )
        };


        for (VehiculoEmpresa vehiculo : vehiculos) {

            System.out.println("ESTADO INICIAL");

            vehiculo.mostrarEstado();

            System.out.println();


            vehiculo.iniciarServicio();

            vehiculo.registrarRecorrido(120);

            vehiculo.finalizarServicio();


            System.out.println();

            System.out.println("ESTADO FINAL");

            vehiculo.mostrarEstado();

            System.out.println("----------------------------");
        }


        System.out.println();

        System.out.println("CAMBIO DE PATENTE");

        vehiculos[0].setPatente("IJKL56");

        System.out.println(
                "Nueva patente: " + vehiculos[0].getPatente()
        );


        System.out.println();

        System.out.println("PRUEBA CON PATENTE INVALIDA");

        vehiculos[0].setPatente("AVION123");

        System.out.println(
                "Patente actual: " + vehiculos[0].getPatente()
        );


        // Justificacion:
        // La clase VehiculoEmpresa adapta la idea de Auto al contexto de una
        // empresa de transporte. Se seleccionaron atributos como patente,
        // tipo de vehiculo, kilometraje y estado de servicio para controlar
        // su identificación, utilización y recorridos.
        //
        // Además, la patente se mantiene encapsulada y se modifica mediante
        // un setter que utiliza un switch para controlar los valores aceptados.
    }
}