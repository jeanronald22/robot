package robot;

import org.junit.Test;

import junit.framework.TestCase;

public class TestArene extends TestCase{
    // TESTS UNITAIRE SUR LA CLASSE ARENA

    // test de la methode fight()
    @Test
    public void testFight() throws Exception{
        Robot r1=new Robot("testeur1");
        Robot r2=new Robot("testeur2");
        Arena areneTest=new Arena(r1, r2);
        assertEquals(r1, areneTest.vainceur);
    }
}
