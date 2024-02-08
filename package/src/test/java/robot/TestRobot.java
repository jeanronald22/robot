package robot;

import org.junit.Test;

import junit.framework.TestCase;

public class TestRobot extends TestCase {
    // la methode tostring() affiche juste un message donc pas besoin de la tester

    // test de la methode fire()

    @Test
    public void testFire() throws Exception{
        // il sagira pour nous de creer deux robots, l'un tira sur l'autre et on testera les point de vie du second a 8
        
        Robot robot1=new Robot("Ronald");
        Robot robot2=new Robot("Jop");
        robot1.fire(robot2);
        assertEquals(8, robot2.getPointVie());
    }

    // teste de la methode isDead(), le test est assez intuitif
    @Test
    public void testIsDead() throws Exception{
        Robot robot=new Robot("Ronald");
        // par defaut un robot est vivant lors de sa creation et mort lorsqu'il a ete tuer
        assertEquals(false, robot.isDead());
    }
}
