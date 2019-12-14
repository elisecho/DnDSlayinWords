
public class dndSlayinWords {
    //Main Method
    public static void main(String [] args) {
        int hp = 5;
        int dmg = 18;
        int dmgTotal = dmg-hp;
        //Small body parts
            if (dmgTotal >= 1 && dmgTotal <= 5)  {
                System.out.println("You hit a foot");
            }
        //Medium body parts
            else if (dmgTotal >=6  && dmgTotal <= 10) {
                System.out.println("You hit their arm");
            }
        //Large body parts
            else if (dmgTotal >= 11 && dmgTotal <= 15) {
                System.out.println("You hit them in the face");
            }
        //Else
            else {
                System.out.println("Uh oh, you broke it");
            }
    }
}