// Importing everything we need.
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

// creating public class.
public class Game {
    // Setting Number of rounds and random as rand.
    int numberOfRounds;
    Random rand ;
    // Game constructor.
    public Game(Random rand, int numberOfRounds){
        this.numberOfRounds = numberOfRounds;
        this.rand = rand;
    }

    public void run(){
        // Run method.
        // Initialising the parameters/arrays.
        String winner;
        int[] Wins = new int[2];
        double[] TotalPoints = new double[2];
        
        // Here we run the game. Looping through the possible number of rounds.
        for(int loop_counter = 1;loop_counter<=numberOfRounds;loop_counter++){
            System.out.print("Round " + loop_counter + "   ");
            // Player 1
            System.out.print("Player 1: ");
            // Creating object and sending random ints to the ThreeDiceScorer
            ThreeDiceScorer p1 = new ThreeDiceScorer(rand.nextInt(6)+1,rand.nextInt(6)+1 ,rand.nextInt(6)+1 );
            // Printing the values of the rolls
            System.out.print(p1.getDie1() + " " + p1.getDie2() + " " + p1.getDie3());
            System.out.print(" Points: ");
            // Printint the score.
            System.out.print(p1.Score());
            // Adding to TotalPoints array.
            TotalPoints[0] = TotalPoints[0]+p1.Score();
            // Player 2
            System.out.print(" Player 2: ");
            // Creating object and sending random ints to the ThreeDiceScorer
            ThreeDiceScorer p2 = new ThreeDiceScorer(rand.nextInt(6)+1, rand.nextInt(6)+1, rand.nextInt(6)+1);
            // Printing the values of the rolls
            System.out.print(p2.getDie1() + " " + p2.getDie2() + " " + p2.getDie3());
            System.out.print(" Points: ");
            // Printint the score.
            System.out.print(p2.Score());
            // Adding to TotalPoints array.
            TotalPoints[1] = TotalPoints[1]+p2.Score();
            
            // If player1 has a higher score than player2. Player1 wins. Else is player1 and player2 are equal. It is a draw. Else, Player2 wins.
            if (p1.Score() > p2.Score()){
                winner = "Player 1";
                // adding to wins array.
                Wins[0] = Wins[0] + 1;

            }
            else if (p1.Score() == p2.Score()) {
                winner = "Tied";
            }
            else {
                winner = "Player 2";
                Wins[1] = Wins[1] + 1;
            }

            System.out.println(" ");
            System.out.println("\tRound Winner is " + winner);
        }

        // Printing total wins by using the array index
        System.out.println("\nTotal Wins: ");
        System.out.print("\tPlayer 1: " + Wins[0]);
        System.out.print(" Player 2: " + Wins[1]);
        System.out.println(" ");
        System.out.println("Total Points: ");
        
        // Calculating and printing total points using the array index
        int onePoints = (int) Math.round(TotalPoints[0]); 
        int twoPoints = (int) Math.round(TotalPoints[1]); 

        System.out.print("\tPlayer 1: " + onePoints);
        System.out.print(" Player 2: " + twoPoints);


        // Calculating  the average points
        double AveragePlayer1 = (TotalPoints[0]/numberOfRounds);
        double AveragePlayer2 = (TotalPoints[1]/numberOfRounds);

        // Printing the average points to two decimal places.
        System.out.println(" ");
        System.out.println("Average Points: ");
        System.out.printf("\tPlayer1: %.2f", AveragePlayer1);
        System.out.printf("\tPlayer2: %.2f", AveragePlayer2);
        
        // Finding the overall winner by comparing the total points.
        String OverallWinner;
        if (TotalPoints[0]>TotalPoints[1]){
            OverallWinner = "Player 1";
        }
        else if (TotalPoints[0]<TotalPoints[1]){
            OverallWinner = "Player 2";
        }
        else {
            OverallWinner = "Draw";
        }

        // Printing the overall winner
        System.out.println("\n");
        System.out.println("Overall Points Winner: " + OverallWinner);
    
    }
    
    // Main Method
    public static void main(String[] args){
        // Scanner to take the user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of rounds to play(min 0): ");
        int numberOfrounds=scanner.nextInt();
        // Creating random object
        Random rand = new Random();
        // Creating game object and sending rand and the number of rounds.
        Game game = new Game(rand, numberOfrounds);
        // Running the object.
        game.run();
    }
}