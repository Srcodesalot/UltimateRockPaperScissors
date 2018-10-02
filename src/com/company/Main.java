package com.company;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Main {
    private  static Scanner ConIn = new Scanner(System.in);
    private static Random ran = new Random();
    private static ArrayList<String>  moves = new ArrayList<>();

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to the Rock, Paper, Scissors game");
        System.out.println("to play against a friend type: friend  If you have no friends type : CPU ");
        String P1P = ConIn.next();
        if (P1P.equalsIgnoreCase("friend")){
            PVP();
        }
        else{
            PVCPU();
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

}
