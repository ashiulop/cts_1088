package ro.ase.csie.cts.g1088.dp.chain;

public class TestChain {
    public static void main(String[] args) {
        ModulProcesareMesaj modulFiltru = new ModulFiltruRomana();
        ModulProcesareMesaj modulPrivat = new ModulMesajePrivate();
        ModulProcesareMesaj modulGrup = new ModulMesajeBroadcast();

        modulFiltru.setNext(modulPrivat);
        modulPrivat.setNext(modulGrup);

        ModulProcesareMesaj serverChat = modulFiltru;

        serverChat.procesareMesaj(new MesajChat("Salut!", 3, "@gigel"));
        serverChat.procesareMesaj(new MesajChat("Esti un jucator rau!", 3, "@gigel"));
        serverChat.procesareMesaj(new MesajChat("Salut tuturor!", 3, "@everyone"));

    }
}
