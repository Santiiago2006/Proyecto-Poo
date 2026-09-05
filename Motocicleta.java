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
    
}