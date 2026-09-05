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
     public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public boolean isTieneRemolque() {
        return tieneRemolque;
    }

    public void setTieneRemolque(boolean tieneRemolque) {
        this.tieneRemolque = tieneRemolque;
    }
}