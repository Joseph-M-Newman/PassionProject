package com.company;
import Object.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws InterruptedException {
        int switchCase= 0;
        String possbleChange;
        ArrayList<Player> players = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello Advernture! This world is yours to explore, but first we need to know your name?");
        Player p1 = new Player();
        System.out.println("What is your name?");
        String n = scan.nextLine();
        p1.setName(n);
        System.out.println("So your name is: " + p1.getName() + "?");
        System.out.println("You're entering the world of Azeira, Best of luck..... " + p1.getName());
        players.add(p1);
        Thread.sleep(4000);
        System.out.println("*You awaken within a forest no idea of your past but one thing is clear, the world you've entered is beautiful.*");
        Thread.sleep(4000);
        System.out.println("You begin to walk on a path, one that seems more perculure, after fifteen minutes of progress, a mysterious voice appears");
        Thread.sleep(4000);
        System.out.println(players.get(0).getName() + ", There is a werry traveler that needs assistance, take this sword!");
        Thread.sleep(4000);
        p1.swords.add(new Sword("Explorers Sword",1,5));
        System.out.println(p1.swords.get(0).getName() + " added to your inventory");

        System.out.println("Battle Begining");

    }

    public static String nameChange(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String n = scan.nextLine();
        String nameChange = n;
        return nameChange;
    }



}
