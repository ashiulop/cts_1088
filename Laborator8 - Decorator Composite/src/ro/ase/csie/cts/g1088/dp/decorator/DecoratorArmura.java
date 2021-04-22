package ro.ase.csie.cts.g1088.dp.decorator;

public class DecoratorArmura extends DecoratorErouAbstract{

    int nivelArmura;

    public DecoratorArmura(Supererou erou, int nivelArmura) {
        super(erou);
        this.nivelArmura = nivelArmura;
    }

    @Override
    public void esteLovit(int puncteViata) {
        int punctePierdute = puncteViata - nivelArmura;
        if(punctePierdute > 0) {
            this.erou.esteLovit(punctePierdute);
        }
    }
}
