package robot;

/**
 * ici c'est la fonction/classe principale de notre projet
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // declaration et extenciation d'un nouveau robot

        Robot robot1=new Robot("D2R2");
        Robot robot2=new Robot("Data");
        robot1.tostring();
        System.out.println(robot1.isDead());
        robot1.fire(robot2); 
        Arena arena1=new Arena(robot1, robot2);
        System.out.println("le vainceur est le robot "+" "+arena1.vainceur.getName());
    }
}
