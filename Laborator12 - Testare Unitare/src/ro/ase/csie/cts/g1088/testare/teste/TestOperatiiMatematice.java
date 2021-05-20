package ro.ase.csie.cts.g1088.testare.teste;

import ro.ase.csie.cts.g1088.testare.modele.OperatiiMatematice;

import static org.junit.Assert.*;

public class TestOperatiiMatematice {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void test() {
        fail("Pleak ma");
    }

    @org.junit.Test
    public void testSumaValoriNormale(){
        int a = 5;
        int b = 6;
        int sumaAsteptata = 11;
        int sumaCalculata = OperatiiMatematice.suma(a, b);

        assertEquals("Test cu 5 si 6", sumaAsteptata, sumaCalculata);
    }
}