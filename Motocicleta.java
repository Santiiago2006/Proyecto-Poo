public class Motocicleta extends Vehiculo {

    private int cilindrajeCC;
    private String tipoMoto;
    private boolean tieneMaletero;
    private double autonomiaTanque;

    public Motocicleta(int cilindrajeCC, String tipoMoto) {
        super();
        this.cilindrajeCC = cilindrajeCC;
        this.tipoMoto = tipoMoto;
        this.tieneMaletero = false;
        this.autonomiaTanque = 0.0;
    }
    
    public Motocicleta(String placa, int año, double precio,
                        int cilindrajeCC, String tipoMoto, boolean tieneMaletero) {
        super(placa, año, precio);
        this.cilindrajeCC = cilindrajeCC;
        this.tipoMoto = tipoMoto;
        this.tieneMaletero = tieneMaletero;
        this.autonomiaTanque = 0.0;
    }

    public Motocicleta(String placa, int año, double precio, boolean disponible,
                        int cilindrajeCC, String tipoMoto,
                        boolean tieneMaletero, double autonomiaTanque) {
        super(placa, año, precio, disponible);
        this.cilindrajeCC = cilindrajeCC;
        this.tipoMoto = tipoMoto;
        this.tieneMaletero = tieneMaletero;
        this.autonomiaTanque = autonomiaTanque;
    }
    public int getCilindrajeCC() {
        return cilindrajeCC;
    }

    public void setCilindrajeCC(int cilindrajeCC) {
        this.cilindrajeCC = cilindrajeCC;
    }

    public String getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    public boolean isTieneMaletero() {
        return tieneMaletero;
    }

    public void setTieneMaletero(boolean tieneMaletero) {
        this.tieneMaletero = tieneMaletero;
    }

    public double getAutonomiaTanque() {
        return autonomiaTanque;
    }

    public void setAutonomiaTanque(double autonomiaTanque) {
        this.autonomiaTanque = autonomiaTanque;
    }
    @Override
    public String toString() {
        return "Motocicleta" +"placa='" + placa + ", año=" + año +", precio=" + precio +", disponible=" + disponible +", cilindrajeCC=" + cilindrajeCC +", tipoMoto='" + tipoMoto   +", tieneMaletero=" + tieneMaletero +", autonomiaTanque=" + autonomiaTanque;
    }


}