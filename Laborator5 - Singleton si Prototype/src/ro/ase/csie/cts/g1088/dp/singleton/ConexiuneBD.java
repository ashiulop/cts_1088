package ro.ase.csie.cts.g1088.dp.singleton;

public class ConexiuneBD {
    String ip;
    String denumire;

    private static ConexiuneBD conexiune = null;

//    versiune eager
//    private static ConexiuneBD conexiune = new ConexiuneBD("10.0.0.1", "cts");

    private ConexiuneBD() {
    }

    private ConexiuneBD(String ip, String denumire) {
        System.out.println("apel constructor");
        this.ip = ip;
        this.denumire = denumire;
    }


    //versiune lazy
    public static synchronized ConexiuneBD getConexiune() {
        if(conexiune == null) {
            conexiune = new ConexiuneBD("10.0.0.1", "cts");
        }
        return conexiune;
    }

}
