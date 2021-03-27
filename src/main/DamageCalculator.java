package main;

import classes.CalcDamage;
import java.util.Scanner;

public class DamageCalculator {

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        CalcDamage calc = new CalcDamage();

        System.out.println("Please enter your character stats in the following order\n" +
                "Please use a single space between each stat.\n" +
                "Basic Damage, Skill Damage, Skill Damage %, Skill Enhancement\n" +
                ", Critical Damage, Critical Damage %, Penetration, Additional Damage %, isCrit.\n" +
                "Press Enter when all stats have been typed.");

        calc.setStats(scnr.nextInt(), scnr.nextInt(), scnr.nextDouble(), scnr.nextInt(), scnr.nextInt(), scnr.nextDouble(),
                scnr.nextDouble(), scnr.nextDouble(), scnr.hasNextBoolean());

        System.out.print(calc.getDamage());
    }
}