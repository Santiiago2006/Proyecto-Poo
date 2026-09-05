public class Camion extends Vehiculo {

    private double capacidadCarga;
    private int numEjes;
    private String tipoCarroceria;
    private boolean tieneRemolque;

    
    public Camion(double capacidadCarga, int numEjes) {
        super("SIN-PLACA", 2024);
        this.capacidadCarga = capacidadCarga;
        this.numEjes = numEjes;
        this.tipoCarroceria = "No definido";
        this.tieneRemolque = false;
    }

    public Camion(String placa, int año, double precio,
                  double capacidadCarga, int numEjes, String tipoCarroceria) {
        super(placa, año, precio);
        this.capacidadCarga = capacidadCarga;
        this.numEjes = numEjes;
        this.tipoCarroceria = tipoCarroceria;
        this.tieneRemolque = false;
    }
    public Camion(String placa, int año, double precio, boolean disponible,
                  double capacidadCarga, int numEjes,
                  String tipoCarroceria, boolean tieneRemolque) {
        super(placa, año, precio, disponible);
        this.capacidadCarga = capacidadCarga;
        this.numEjes = numEjes;
        this.tipoCarroceria = tipoCarroceria;
        this.tieneRemolque = tieneRemolque;
    }
}