package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Champion;

public class Combate {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do primeiro campeão:");
        System.out.print("Nome: ");
        String name1 = sc.nextLine();
        System.out.print("Vida inicial: ");
        int life1 = sc.nextInt();
        System.out.print("Ataque: ");
        int attack1 = sc.nextInt();
        System.out.print("Armadura: ");
        int armor1 = sc.nextInt();

        sc.nextLine();

        System.out.println("\nDigite os dados do segundo campeão:");
        System.out.print("Nome: ");
        String name2 = sc.nextLine();
        System.out.print("Vida inicial: ");
        int life2 = sc.nextInt();
        System.out.print("Ataque: ");
        int attack2 = sc.nextInt();
        System.out.print("Armadura: ");
        int armor2 = sc.nextInt();

        System.out.println();

        System.out.print("Quantos turnos você deseja executar? ");
        int numTurns = sc.nextInt();

        System.out.println();

        sc.close();

        Champion champion1 = new Champion(name1, life1, attack1, armor1);
        Champion champion2 = new Champion(name2, life2, attack2, armor2);

        for (int turno = 0; turno <= numTurns; turno++) {
            if (turno >= 1) {
                System.out.println("Resultado do turno " + turno + ":");
                System.out.println(champion1.status());
                System.out.println(champion2.status());
            }

            System.out.println();

            if (champion1.getLife() == 0 || champion2.getLife() == 0) {
                System.out.println("FIM DO COMBATE");
                break;
            }

            champion2.takeDamage(champion1.getAttack());

            champion1.takeDamage(champion2.getAttack());

        }
    }
}