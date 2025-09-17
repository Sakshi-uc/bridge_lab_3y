package string_practice_level_2;

import java.util.Scanner;

public class RockPaperScissors {
    static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        return switch (choice) {
            case 0 -> "Rock";
            case 1 -> "Paper";
            default -> "Scissors";
        };
    }
    static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if (user.equals("Rock") && computer.equals("Scissors")) return "User";
        if (user.equals("Paper") && computer.equals("Rock")) return "User";
        if (user.equals("Scissors") && computer.equals("Paper")) return "User";
        return "Computer";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        int userWins = 0, computerWins = 0, draws = 0;
        for
