package JAVA_DAY_5;
import java.util.Scanner;

public class Game {

    int health = 100;
    int ehealth = 100;
    boolean isDefending;

    public void attack() {

        if (health >= ehealth)
            isDefending = true;
        else
            isDefending = false;

        if (isDefending == true) {
            System.out.println("You attacked the enemy, enemy got damaged!");
            ehealth = ehealth - 10;
        } else {
            System.out.println("You attacked the enemy, oops, enemy defended!");
            ehealth = ehealth - 5;
        }
    }

    public void defend() {
    	if(isDefending)
    	{
            System.out.println("Damage reduced, you are defending.");
    	}
    	else
    	{
        System.out.println(" you get dameged");
        health = health - 5;
    	}
    }

    public void heal() 
    {
        System.out.println("Woohoo! Health restored.");
        health = health + 10;
        if(health>100)
        {
        	health=100;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Game player = new Game();

        while (player.health > 0 && player.ehealth > 0) {

            System.out.println("\nPlayer Health = " + player.health);
            System.out.println("Enemy Health = " + player.ehealth);

            System.out.println("\nChoose Action:");
            System.out.println("1. Attack");
            System.out.println("2. Defend");
            System.out.println("3. Heal");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:
                player.attack();
                break;

            case 2:
                player.defend();
                break;

            case 3:
                player.heal();
                break;

            default:
                System.out.println("Please choose a correct option!");
            }
        }

        if (player.ehealth <= 0)
            System.out.println("🎉 You Win!");
        else
            System.out.println("💀 Game Over!");

        sc.close();
    }
}