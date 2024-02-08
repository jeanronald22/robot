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
        assertEquals(r1, areneTest.vanRobot);
    }

    // test de la methode umain 
    @Test
    public void testFightT() throws Exception{
        Fihter f1=new Fihter("ronald");
        Fihter f2=new Fihter("jop");
        Arena are=new Arena(f1, f2);
        Robot vainc=are.vain;
        if (vainc==f1) {
            assertEquals(0, f2.getPointVie());
        }else{
            assertEquals(0, f1.getPointVie());
        }
    }

    // test du combat robot humain methode fightt()
    @Test
    public void testFightTT() throws Exception{
        Fihter f1=new Fihter("ronald");
        Robot r1Robot=new Robot("tes");
        Arena are=new Arena(f1, r1Robot);
        Robot vainc=are.vain;
        if (vainc==f1) {
            assertEquals(0, r1Robot.getPointVie());
        }else{
            assertEquals(0, f1.getPointVie());
        }
    }
}
