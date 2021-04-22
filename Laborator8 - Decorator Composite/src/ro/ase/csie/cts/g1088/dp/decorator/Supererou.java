package ro.ase.csie.cts.g1088.dp.decorator;

public abstract class Supererou {
    String nume;
    int puncteViata;

    public Supererou(String nume, int puncteViata) {
        this.nume = nume;
        this.puncteViata = puncteViata;
    }

    public abstract int getPuncteViata();
    public abstract void alearga();
    public abstract void esteLovit(int puncteViata);
    public abstract void seVindeca(int puncteViata);
}
