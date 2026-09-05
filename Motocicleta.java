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
    
    public Motocicleta(String placa, int anio, double precio,
                        int cilindrajeCC, String tipoMoto, boolean tieneMaletero) {
        super(placa, anio, precio);
        this.cilindrajeCC = cilindrajeCC;
        this.tipoMoto = tipoMoto;
        this.tieneMaletero = tieneMaletero;
        this.autonomiaTanque = 0.0;
    }

    public Motocicleta(String placa, int anio, double precio, boolean disponible,
                        int cilindrajeCC, String tipoMoto,
                        boolean tieneMaletero, double autonomiaTanque) {
        super(placa, anio, precio, disponible);
        this.cilindrajeCC = cilindrajeCC;
        this.tipoMoto = tipoMoto;
        this.tieneMaletero = tieneMaletero;
        this.autonomiaTanque = autonomiaTanque;
    }

}