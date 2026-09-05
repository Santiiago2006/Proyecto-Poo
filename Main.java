public class Main {

    public static void main(String[] args) {

        List<Vehiculo> inventario = new ArrayList<>();

        Vehiculo vehiculoGenerico2 = new Vehiculo("XYZ-111", 2020, 45000000.0, true);

        inventario.add(vehiculoGenerico1);
        inventario.add(vehiculoGenerico2);

        Automovil auto1 = new Automovil(4, "Automatica");

        
        Automovil auto2 = new Automovil("ABC-123", 2023, 80000000.0, true,
                4, "Automatica", true, 2.0);

        inventario.add(auto1);
        inventario.add(auto2);

        Motocicleta moto1 = new Motocicleta(150, "Deportiva");

       
        Motocicleta moto2 = new Motocicleta("MOT-456", 2022, 12000000.0,
                200, "Scooter", true);

        inventario.add(moto1);
        inventario.add(moto2);

        
        Camion camion1 = new Camion(15000.0, 3);

        Camion camion2 = new Camion("CAM-789", 2019, 150000000.0, true,
                20000.0, 4, "Furgon", true);

        inventario.add(camion1);
        inventario.add(camion2);

        System.out.println("=== Inventario de la concesionaria ===");
        for (Vehiculo v : inventario) {
            System.out.println(v.toString());
        }
    }
}