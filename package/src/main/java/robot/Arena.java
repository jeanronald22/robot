package robot;

import java.util.Random;

public class Arena {
    // definition des robots pres a combattre
    Robot robot1, robot2;
    Fihter f1, f2;
    Fihter vaFihter;
    Robot vanRobot, vain;
    // arene de combat entre robots
    public Arena(Robot robot1, Robot robot2){
        this.robot1=robot1;
        this.robot2=robot2;
        // appel de la methode de combat
        vanRobot=fight();
    }
    // arene de combat entre humain
    public Arena(Fihter f1, Fihter f2){
        this.f1=f1;
        this.f2=f2;
        vaFihter=fightT();
    }
    // arene de combat entre robot et haumain
    public Arena(Fihter f1, Robot robot1){
        this.f1=f1;
        this.robot1=robot1;
        vain=fightTT();
    }
    // combat entre robots
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

    // combat entre humain
    public Fihter fightT(){
        while (f1.isDead()==false && f2.isDead()==false)  {
            // tant que les robot sont en vie ils tirent
            f1.fire(f2);
            if (f2.isDead()==false) {
                f2.fire(f1);
            }
        }
        return f1.isDead()==true ? f2 : f1;
    }

    // combat entre humain et robot
    public Robot fightTT(){
        while (f1.isDead()==false && robot1.isDead()==false) {
            Random ran=new Random();
            boolean val=ran.nextBoolean();
            if (val==true) {
                int n=robot1.getPointVie();
                n=n-2;
                robot1.setPointVie(n);
                System.out.println("le combattant"+" "+f1.getName()+" "+ "a touche le robot"+ " "+robot1.getName());
            }else{
                System.out.println("le combattant"+" "+f1.getName()+" "+ "a manquer le robot"+ " "+robot1.getName());
                if (robot1.isDead()==false) {
                    int n=f1.getPointVie();
                    n=n-2;
                    f1.setPointVie(n);
                    System.out.println("le robot"+" "+robot1.getName()+" "+"a toucher le combatant"+" "+f1.getName());
                }

            }
        }
        return f1.isDead()==true ? robot1 : f1;
    }

}
