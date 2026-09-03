public class Vehiculo {

    protected String placa;
    protected int año;
    protected double precio;
    protected boolean disponible;

    
    public Vehiculo() {
        this("SIN-PLACA", 0, 0.0, false);
    }

   
    public Vehiculo(String placa, int año) {
        this(placa, año, 0.0);
    }

   
    public Vehiculo(String placa, int año, double precio) {
        this(placa, año, precio, false);
    }

   
    public Vehiculo(String placa, int año, double precio, boolean disponible) {
        this.placa = placa;
        this.año = año;
        this.precio = precio;
        this.disponible = disponible;
    
    }

}