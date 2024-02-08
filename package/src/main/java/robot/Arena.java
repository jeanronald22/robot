package robot;

public class Arena {
    // definition des robots pres a combattre
    Robot robot1, robot2;
    Robot vainceur;
    public Arena(Robot robot1, Robot robot2){
        this.robot1=robot1;
        this.robot2=robot2;
        // appel de la methode de combat
        vainceur=fight();
        
    }
    private Robot fight() {
        while (robot1.isDead()==false && robot2.isDead()==false)  {
            // tant que les robot sont en vie ils tirent
            robot1.fire(robot2);
            if (robot2.isDead()==false) {
                robot2.fire(robot1);
            }
        }
        return robot1.isDead()==true ? robot2 : robot1;
    }
}
