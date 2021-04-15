package ro.ase.csie.cts.g1088.dp.decorator;

public abstract class DecoratorErouAbstract extends Supererou{
    Supererou erou = null;

    public DecoratorErouAbstract(Supererou erou) {
        super(erou.nume, erou.puncteViata);
        this.erou = erou;
    }

    @Override
    public void alearga() {
        this.erou.alearga();
    }

    @Override
    public void esteLovit(int puncteViata) {
        this.erou.esteLovit(puncteViata);
    }

    @Override
    public void seVindeca(int puncteViata) {
        this.erou.seVindeca(puncteViata);
    }
}
