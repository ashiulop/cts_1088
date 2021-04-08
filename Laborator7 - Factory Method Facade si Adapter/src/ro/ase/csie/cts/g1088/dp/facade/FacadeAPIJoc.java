package ro.ase.csie.cts.g1088.dp.facade;

public class FacadeAPIJoc {

    //interfata simplificata pentru a obtine profilul unui jucator
    public static String getProfil(String user, String pass) {

        ConexiuneServerJoc conexiune = new ConexiuneServerJoc();
        conexiune.conectare();

        Player player = new Player();
        player.login(conexiune);

        ProfilPlayer profil = player.getProfil();

        String dateProfil = profil.getProfil();

        return dateProfil;

    }
}