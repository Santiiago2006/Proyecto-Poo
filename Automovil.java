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
    public Automovil(String placa, int año, double precio, boolean disponible,
                      int numPuertas, String tipoTransmision,
                      boolean tieneAireAcondicionado, double cilindraje) {
        super(placa, año, precio, disponible);
        this.numPuertas = numPuertas;
        this.tipoTransmision = tipoTransmision;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.cilindraje = cilindraje;
    }


    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "placa='" + placa + ", año=" + año +", precio=" + precio +", disponible=" + disponible + ", numPuertas=" + numPuertas +", tipoTransmision='" + tipoTransmision + ", tieneAireAcondicionado=" + tieneAireAcondicionado +", cilindraje=" + cilindraje;
    }
}  