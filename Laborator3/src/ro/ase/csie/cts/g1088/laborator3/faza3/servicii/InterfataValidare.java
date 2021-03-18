package ro.ase.csie.cts.g1088.laborator3.faza3.servicii;

import ro.ase.csie.cts.g1088.laborator3.exceptii.ExcceptiePretInvalid;
import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptieVechimeClient;

public interface InterfataValidare {

    public void validareVechime(int vechimeClientInAni) throws ExceptieVechimeClient;

    public void validarePret(float pretInitial) throws ExcceptiePretInvalid;
}
