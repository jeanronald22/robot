package robot;

public class Robot {
    private String name;
    private int pointVie;

    // defintion du constructeur de robots
    public Robot(String name){
        this.name=name;
        pointVie=10;
    }

    // defintion des accesseurs et muttateurs
    // variable name
    public  String getName(){
        return this.name;
    }
    public void setName(String changeName){
        this.name= changeName;
     }
    
    // variable pointVie
    public int getPointVie(){
        return pointVie;
    }
    public void setPointVie(int n){
        this.pointVie=n;
    }

    // definition de la methode tostring() pour la presentation/description des robots
    public void tostring(){
        System.out.println("Robot"+" "+this.getName());
    }

    // defintion de la methode fire()
    // elle permet au robot courant de tirer sur le robot pris en paramettre
    public void fire(Robot robot1){
        // on recuper les point de vie du robot courant et on decremente de 2
        int temp = robot1.getPointVie();
        temp=temp-2;
        robot1.setPointVie(temp);
        System.out.println("le robot "+" "+robot1.getName()+" "+" a ete touche par le robot"+" "+this.getName());
    }

    // definition de la methode isDead() pour verifier si un robot est en vie ou non

    public boolean isDead(){
        return this.getPointVie()>0 ? false : true; 
    }


}
