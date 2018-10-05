package com.company;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Main {
    private  static Scanner ConIn = new Scanner(System.in);
    private static Random ran = new Random();
    private static Random ran2 = new Random();
    private static ArrayList<String>  moves = new ArrayList<>();

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to the Rock, Paper, Scissors game");
        System.out.println("to play against a friend type: friend  If you have no friends type : CPU ");
        System.out.println("If you're too lazy to play and want to watch others do it, type: bots");
        String P1P = ConIn.next();
        switch (P1P)
        {
            case "friend" :
                PVP();
                break;
            case "CPU" :
                PVCPU();
                break;
            case "bots" :
                CPUVSCPU();
                break;
        }
    }
    private static void PVP(){
        System.out.println("Lets get ready to rumble!");
        System.out.println("Player1 you're up! pick rock paper or scissors ");
        String P1P = ConIn.next();
        System.out.println("ok if player two time to choose");
        System.out.println("Player2 you're up! pick rock paper or scissors ");
        String P2P = ConIn.next();
        if (P1P.equalsIgnoreCase(P2P)){
            System.out.println("player 1 picked "+ P1P +" and player 2 picked "+P2P);
            System.out.println("shoot its a tie");
            System.exit(0);
        }
        if (P1P.equalsIgnoreCase("rock") && !(P2P.equalsIgnoreCase("paper"))){
            System.out.println("player 1 picked "+ P1P +" and player 2 picked "+P2P);
            System.out.println("Player 1 WINS!!!!!!");
            System.exit(0);
        }
        if (P1P.equalsIgnoreCase("paper") && !(P2P.equalsIgnoreCase("scissors"))){
            System.out.println("player 1 picked "+ P1P +" and player 2 picked "+P2P);
            System.out.println("Player 1 WINS!!!!!!");
            System.exit(0);
        }
        if (P1P.equalsIgnoreCase("scissors") && !(P2P.equalsIgnoreCase("rock"))){
            System.out.println("player 1 picked "+ P1P +" and player 2 picked "+P2P);
            System.out.println("Player 1 WINS!!!!!!");
            System.exit(0);
        }
        else{
            System.out.println("player 1 picked "+ P1P +" and player 2 picked "+P2P);
            System.out.println("Player 2 WINS!!!!!!");
            System.exit(0);
        }
    }
    private static void PVCPU(){
        moves.add("rock");
        moves.add("paper");
        moves.add("scissors");
        System.out.println("Lets get ready to rumble!");
        System.out.println("Player1 you're up! pick rock paper or scissors ");
        String P1P = ConIn.next();
        System.out.println("ok if player two time to choose");
        System.out.println("Player2 you're up! pick rock paper or scissors ");
        int x = ran.nextInt(2);
        String P2P = moves.get(x);
        if (P1P.equalsIgnoreCase(P2P)){
            System.out.println("player 1 picked "+ P1P +" and player 2 picked "+P2P);
            System.out.println("shoot its a tie");
            System.exit(0);
        }
        if (P1P.equalsIgnoreCase("rock") && !(P2P.equalsIgnoreCase("paper"))){
            System.out.println("player 1 picked "+ P1P +" and player 2 picked "+P2P);
            System.out.println("Player 1 WINS!!!!!!");
            System.exit(0);
        }
        if (P1P.equalsIgnoreCase("paper") && !(P2P.equalsIgnoreCase("scissors"))){
            System.out.println("player 1 picked "+ P1P +" and player 2 picked "+P2P);
            System.out.println("Player 1 WINS!!!!!!");
            System.exit(0);
        }
        if (P1P.equalsIgnoreCase("scissors") && !(P2P.equalsIgnoreCase("rock"))){
            System.out.println("player 1 picked "+ P1P +" and player 2 picked "+P2P);
            System.out.println("Player 1 WINS!!!!!!");
            System.exit(0);
        }
        else{
            System.out.println("player 1 picked "+ P1P +" and player 2 picked "+P2P);
            System.out.println("Player 2 WINS!!!!!!");
            System.exit(0);
        }

    }
    private static void CPUVSCPU(){
        moves.add("rock");
        moves.add("paper");
        moves.add("scissors");
        System.out.println("Lets get ready to rumble!");
        System.out.println("Player1 you're up! pick rock paper or scissors ");
        int y = ran2.nextInt(2);
        String P1P = moves.get(y);
        System.out.println("Player2 you're up! pick rock paper or scissors ");
        int x = ran.nextInt(2);
        String P2P = moves.get(x);
        System.out.println("Okay, place your bets! Who do you think is gonna win??");
        System.out.println("Ready to find out?? (y/n)");
        String ready = ConIn.next();
        if(ready.equalsIgnoreCase("y")) {
            if (P1P.equalsIgnoreCase(P2P)) {
                System.out.println("player 1 picked " + P1P + " and player 2 picked " + P2P);
                System.out.println("shoot its a tie");
                System.exit(0);
            }
            if (P1P.equalsIgnoreCase("rock") && !(P2P.equalsIgnoreCase("paper"))) {
                System.out.println("player 1 picked " + P1P + " and player 2 picked " + P2P);
                System.out.println("Player 1 WINS!!!!!!");
                System.exit(0);
            }
            if (P1P.equalsIgnoreCase("paper") && !(P2P.equalsIgnoreCase("scissors"))) {
                System.out.println("player 1 picked " + P1P + " and player 2 picked " + P2P);
                System.out.println("Player 1 WINS!!!!!!");
                System.exit(0);
            }
            if (P1P.equalsIgnoreCase("scissors") && !(P2P.equalsIgnoreCase("rock"))) {
                System.out.println("player 1 picked " + P1P + " and player 2 picked " + P2P);
                System.out.println("Player 1 WINS!!!!!!");
                System.exit(0);
            } else {
                System.out.println("player 1 picked " + P1P + " and player 2 picked " + P2P);
                System.out.println("Player 2 WINS!!!!!!");
                System.exit(0);
            }
        }
        else System.out.println("Sorry you weren't ready for this intensity...start the game over to try again.");
    }

}
