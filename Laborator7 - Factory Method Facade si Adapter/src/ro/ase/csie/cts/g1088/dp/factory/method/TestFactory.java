package ro.ase.csie.cts.g1088.dp.factory.method;

public class TestFactory {
    public static void main(String[] args) {
        boolean esteModJoc4Kids = true;

        if(esteModJoc4Kids) {
            // dezvoltare doar cu caractere 4Kids
        } else {
            // dezvoltare doar cu caractere normale
        }

        FactoryAbstractCaracter factoryAbstractCaracter = null;
        factoryAbstractCaracter = (esteModJoc4Kids) ? new FactoryMod4Kids() : new FactoryModNormal();

        // dezvoltare joc
        CaracterJoc superman = factoryAbstractCaracter.getCaracter(TipCaracter.DC, "Superman");
    }
}
