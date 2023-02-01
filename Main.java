import java.util.Scanner;
import java.util.Random;

public class Main{
	public static void main(String args[]) {
        //system objects
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        //Game Variables
        String[] enemies = { "Slime", "Creeper", "Zombie", "Villager"}; //villager is for genocide route
        int maxEnemyHealth = 45;
        int maxAttackDamage = 10;

        int health = 50;
        int AttackDamage = 12;
        int numHeathPots = 3;
        int healthPotHealAmmount = 30;
        int healthPotionDropChance = 35;

        boolean running = true;

        System.out.println("Welcome to TerminalCraft Legends!");

        GAME:
        while(running) {
                System.out.println("----------------------------------------");

                int enemyHealth = rand.nextInt(maxEnemyHealth);
                String enemy = enemies[rand.nextInt(enemies.length)];
                System.out.println("\t# " + enemy + " has appeared! #\n");

                while(enemyHealth > 0) {
                        System.out.println("\tYour HP: " + health);
                        System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
                        System.out.println("\n\tWhat Would You Like to Do?");
                        System.out.println("\t1. Attack");
                        System.out.println("\t2. Drink Health");
                        System.out.println("\t3. Flee");

                        String input = in.nextLine();
                }
        }
	}
}
