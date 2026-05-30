package JAVA_DAY_5;

import java.util.Scanner;
import java.util.Random;

public class CombatGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int playerHp = 100;
        int enemyHp = 100;

        System.out.println("--- Combat Started! ---");

        while (playerHp > 0 && enemyHp > 0) {
            System.out.println("\nPlayer HP: " + playerHp + " | Enemy HP: " + enemyHp);
            System.out.println("Choose action: 1. Attack | 2. Defend | 3. Heal");
            String choice = scanner.nextLine();

            boolean playerDefending = false;

            
            if (choice.equals("1")) {
                int damage = random.nextInt(11) + 10; // 10 to 20
                enemyHp -= damage;
                System.out.println("You attacked for " + damage + " damage!");
            } else if (choice.equals("2")) {
                playerDefending = true;
                System.out.println("You are bracing for impact!");
            } else if (choice.equals("3")) {
                int heal = 15;
                playerHp = Math.min(100, playerHp + heal);
                System.out.println("You healed for " + heal + " HP!");
            } else {
                System.out.println("Invalid choice! You lost your turn.");
            }

            if (enemyHp <= 0) {
                System.out.println("Victory! The enemy has been defeated.");
                break;
            }

         
            boolean enemyDefending = random.nextBoolean();
            if (enemyDefending) {
                System.out.println("Enemy is defending!");
            } else {
                int enemyDamage = random.nextInt(11) + 8; // 8 to 18
                if (playerDefending) {
                    enemyDamage /= 2;
                    System.out.println("You defended! Enemy dealt only " + enemyDamage + " damage.");
                } else {
                    System.out.println("Enemy attacked you for " + enemyDamage + " damage!");
                }
                playerHp -= enemyDamage;
            }

            if (playerHp <= 0) {
                System.out.println("\nYou were defeated... Game Over.");
                break;
            }
        }
        scanner.close();
    }
}


