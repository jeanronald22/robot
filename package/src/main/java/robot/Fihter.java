package robot;

import java.util.Random;

public class Fihter extends Robot{

    public Fihter(String name) {
        super(name);
    }
    // redefintion de certaine methode

    public void tostring(){
        System.out.println("Fighter"+" "+this.getName());
    }

    public boolean fire(Fihter fihter){
        Random ran=new Random();
        boolean val=ran.nextBoolean();
        if(val==true){
            int temp=fihter.getPointVie();
            temp=temp-2;
            fihter.setPointVie(temp);
            System.out.println("combattant"+" "+fihter.getName()+" "+" a ete toucher par le combattabt"+" "+this.getName());
            return true;
        }else{
            System.out.println("le combattant"+" "+this.getName()+" a manque sa cible");
            return false;
        }
    }
    
}
