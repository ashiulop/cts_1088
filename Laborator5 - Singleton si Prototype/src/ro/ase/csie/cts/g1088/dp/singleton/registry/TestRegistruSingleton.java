package ro.ase.csie.cts.g1088.dp.singleton.registry;

public class TestRegistruSingleton {
    public static void main(String[] args) {
        ConexiuneBD conexiune1 = ConexiuneBD.getConexiune("10.0.0.1", "cts");
        ConexiuneBD conexiune2 = ConexiuneBD.getConexiune("10.0.0.2", "cts");

        if (conexiune1 == conexiune2) {
            System.out.println("referinte identice");
        } else {
            System.out.println("referinte diferite");
        }

    }
}
