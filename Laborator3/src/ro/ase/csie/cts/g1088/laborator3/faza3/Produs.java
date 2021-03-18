package ro.ase.csie.cts.g1088.laborator3.faza3;

import ro.ase.csie.cts.g1088.laborator3.exceptii.ExcceptiePretInvalid;
import ro.ase.csie.cts.g1088.laborator3.exceptii.ExceptieVechimeClient;
import ro.ase.csie.cts.g1088.laborator3.faza3.servicii.InterfataMarketing;
import ro.ase.csie.cts.g1088.laborator3.faza3.servicii.InterfataValidare;
import ro.ase.csie.cts.g1088.laborator3.faza3.servicii.ServiciuValidari;
import ro.ase.csie.cts.g1088.laborator3.faza3.servicii.StrategieMarketing2021;

public class Produs {
    InterfataMarketing serviciuMk = null;
    InterfataValidare serviciuValidare = null;

    public Produs(InterfataMarketing serviciuMk, InterfataValidare serviciuValidare) {
        if(serviciuValidare == null){
            throw new NullPointerException();
        }

        this.setStrategieMk(serviciuMk);
        this.serviciuValidare = serviciuValidare;
    }

    public Produs() {
        for(Object serviciu : TestProdus.servicii) {
            if (serviciu instanceof InterfataMarketing){
                this.serviciuMk = (InterfataMarketing) serviciu;
            }
        }
        if(this.serviciuMk == null){
            throw new NullPointerException();
        }
    }

    public void setStrategieMk(InterfataMarketing serviciuMk) {
        if(serviciuMk == null){
            throw new NullPointerException();
        }
        this.serviciuMk = serviciuMk;
    }

    public float getPretFinal(TipProdus tipProdus, float pretInitial, int vechimeClientInAni)
            throws ExcceptiePretInvalid, ExceptieVechimeClient {

        serviciuValidare.validarePret(pretInitial);
        serviciuValidare.validareVechime(vechimeClientInAni);

        float discountFidelitate = (tipProdus == TipProdus.NOU) ? 0 : serviciuMk.getDiscountFidelitate(vechimeClientInAni);

        float discount = tipProdus.getDiscount();
        float valoareDiscountTipProdus = getPretCuDiscount(pretInitial, discount);
        float pretFinal = valoareDiscountTipProdus * (1 - discountFidelitate);

        return pretFinal;
    }

    private static float getPretCuDiscount(float pretInitial, float discount) {
        return pretInitial - (discount * pretInitial);
    }




}