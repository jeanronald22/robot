package robot;

import static org.junit.Assert.assertNotEquals;

import junit.framework.TestCase;

public class TestFighter extends TestCase{

    // TEST UNITAIRES
    // test de la methode de tire  fire()
    public void testFire() throws Exception{
        Fihter f1=new Fihter("testeurs");
        boolean val=f1.fire(f1);
        if (val==true) {
            assertEquals(8, f1.getPointVie());
        }else{
            assertNotEquals(8, f1.getPointVie());
        }

    }
}
