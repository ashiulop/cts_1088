package ro.ase.csie.cts.g1088.laborator3.faza3.servicii;

import ro.ase.csie.cts.g1088.laborator3.exceptii.ExcceptiePretInvalid;
import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptieVechimeClient;

public class ServiciuValidari implements InterfataValidare {
    @Override
    public void validareVechime(int vechimeClientInAni) throws ExceptieVechimeClient {
        if (vechimeClientInAni < 0) {
            throw new ExceptieVechimeClient();
        }
    }

    @Override
    public void validarePret(float pretInitial) throws ExcceptiePretInvalid {
        if (pretInitial <= 0) {
            throw new ExcceptiePretInvalid();
        }

    }
}
