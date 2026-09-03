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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}