package ro.ase.csie.cts.g1088.testare.teste;

import org.junit.*;
import org.junit.experimental.theories.suppliers.TestedOn;
import ro.ase.csie.cts.g1088.testare.exceptii.ExceptieNota;
import ro.ase.csie.cts.g1088.testare.exceptii.ExceptieNume;
import ro.ase.csie.cts.g1088.testare.exceptii.ExceptieVarsta;
import ro.ase.csie.cts.g1088.testare.modele.Student;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    //test fixture
    static Student student;
    static ArrayList<Integer> note;
    static String numeInitial = "Gigel";
    static int varstaInitiala = 21;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        note = new ArrayList<>();
        note.add(9);
        note.add(7);
        note.add(10);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        note.clear();
        note = null;
    }

    @Before
    public void setUp() throws Exception {
        student = new Student("Gigel",21, note);
    }

    @After
    public void tearDown() throws Exception {
        student = null;
    }

    @Ignore
    @Test
    public void test() {
        fail("Not yet implemented");
    }

    //numele unit testelor trebuie sa fie cat mai sugestiv
    @Test
    public void testSetVarstaConformanceRight() throws ExceptieVarsta {

        int varstaNoua = 23;
        student.setVarsta(varstaNoua);
        assertEquals("Test cu valori corecte",varstaNoua, student.getVarsta());
    }

    @Test
    public void testSetNumeRight() {
        String numeNou = "Ana";

        try {
            student.setNume(numeNou);
            assertEquals("Test cu valori corecte", numeNou, student.getNume());
        } catch (ExceptieNume e) {
            fail("Genereaza exceptie pentru valori corecte");
        }
    }

    @Test
    public void testSetVarstaErrorCondition() {
        int varstaNoua = Student.MIN_VARSTA - 1;
        try {
            student.setVarsta(varstaNoua);
            fail("NU genereaza exceptie pentru varsta in afara limitelor");
        } catch (ExceptieVarsta e) {
            assertTrue(true);
        }
    }

    @Test(expected = ExceptieNume.class)
    public void testSetNumeErrorCondition() throws ExceptieNume {
        String numeNou = "Io";
        student.setNume(numeNou);
    }

    @Test
    public void testGetNotaMinimaOrderingSetSortatCrescator() throws ExceptieNota {
        int notaMinima = 4;
        ArrayList<Integer> note = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            note.add(i + notaMinima);
        }

        student.setNote(note);

        int notaMinimaCalculata = student.getNotaMinima();
        assertEquals("Test cu valori sortate crescator", notaMinima, notaMinimaCalculata);
    }

    @Test
    public void testGetNotaMinimaCardinalityZero() throws ExceptieNota {
        ArrayList<Integer> note = new ArrayList<>();
        student.setNote(note);
        int notaMinima = 0;
        int notaMinimaCalculata = student.getNotaMinima();
        assertEquals("Test fara note", notaMinima, notaMinimaCalculata);
    }

    @Test
    public void testGetNotaMinimaCardinalityUnu() throws ExceptieNota {
        ArrayList<Integer> note = new ArrayList<>();
        note.add(Student.MAX_NOTA);
        student.setNote(note);
        int notaMinima = Student.MAX_NOTA;
        int notaMinimaCalculata = student.getNotaMinima();
        assertEquals("Test cu o singura nota", notaMinima, notaMinimaCalculata);
    }

    @Test
    public void testGetNotaMinimaExistenceReferintaNoteNull() throws ExceptieNota {
        student.setNote(null);
        int notaMinima = 0;
        int notaMinimaCalculata = student.getNotaMinima();
        assertEquals("Test cu referinta null pentru note", notaMinima, notaMinimaCalculata);
    }
}