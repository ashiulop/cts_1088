package ro.ase.csie.cts.g1088.dp.decorator;

public class Dragon extends Supererou{
    public Dragon(String nume, int puncteViata) {
        super(nume, puncteViata);
    }

    @Override
    public void alearga() {
        System.out.println("Zboara catre o noua destinatie");
    }

    @Override
    public void esteLovit(int puncteViata) {
        System.out.println(String.format("%s este lovit si pierde %d puncte", this.nume, puncteViata));
        this.puncteViata -= puncteViata;
    }

    @Override
    public void seVindeca(int puncteViata) {
        System.out.println(String.format("%s se vindeca si recupereaza %d puncte", this.nume, puncteViata));
        this.puncteViata += puncteViata;
    }
}
