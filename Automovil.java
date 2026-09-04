public class Automovil extends Vehiculo {

    private int numPuertas;
    private String tipoTransmision;
    private boolean tieneAireAcondicionado;
    private double cilindraje;

  
    public Automovil(int numPuertas, String tipoTransmision) {
        super("SIN-PLACA", 2024);
        this.numPuertas = numPuertas;
        this.tipoTransmision = tipoTransmision;
        this.tieneAireAcondicionado = false;
        this.cilindraje = 0.0;
    }
}  