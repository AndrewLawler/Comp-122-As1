public class Average{

    // Main method, runs the CalcAverage method.
    public static void main(String[] args){
        CalcAverage();
    }

    // CalcAverage method initialised
    public static void CalcAverage(){
        // Position counter
        int positioncounter = 0;
        int ArrSize = 216;
        int[] DiceArray = new int[ArrSize];
        int[] DiceArray2 = new int[ArrSize];


        // Part 1
        // Runs three embedded for loops that are set as 1-6. This will produce all of the possible outcomes for rolling three dice. 6^3.
        for(int i=1; i<=6; i++){
            for(int j=1; j<=6; j++){
                for(int k=1; k<=6; k++){
                    // Creating object of ThreeDiceScorer called Rolls. Sends the parameters of the loops to the Scorer to calculate the score.
                    ThreeDiceScorer Rolls = new ThreeDiceScorer(i,j,k);
                    // Add Score to the DiceArray position for the positioncounter. ie: 0->215
                    DiceArray[positioncounter] = Rolls.Score();
                    positioncounter++;
                }
            }
        }

        // Total initialised
        int DiceArrayTotal = 0;
        // Loop to calculate the total for all rolls
        for(int count=0; count<=positioncounter-1; count++){
            DiceArrayTotal = DiceArrayTotal+DiceArray[count];
        }

        // Divice the Total by 216 to get the average
        double DiceArrayTotalD = DiceArrayTotal;
        double AverageRoll = (DiceArrayTotalD/positioncounter);
    
        // Print the average roll to two decimal places
        System.out.print("\tPart C\n");
        System.out.printf("\n"+positioncounter+" Possible Rolls! \n Average is: %.2f", AverageRoll);


        // Part 2
        int positioncounter2 = 0;

        // Set loopNumbers array.
        int[] LoopNumbers = {2,3,4,5,6,6};

        // Loop three times once again but instead of having a third loop 1-6 i instead look through an array for the value. That way we use 2,3,4,5,6,6. 
        for(int i=1; i<=6; i++){
            for(int j=1; j<=6; j++){
                for(int k=0; k<=5; k++){
                    // New object once again, calculate score.
                    ThreeDiceScorer Rolls = new ThreeDiceScorer(i,j,LoopNumbers[k]);
                    DiceArray2[positioncounter2] = Rolls.Score();
                    positioncounter2++;
                }
            }
        }

        // Calculating total once again.
        int DiceArrayTotalTwo = 0;

        // For loop to get total.
        for(int count=0; count<=positioncounter2-1; count++){
            DiceArrayTotalTwo = DiceArrayTotalTwo+DiceArray2[count];
        }

        // Calculating the total as a double.
        double DiceArrayTotalTwoD = DiceArrayTotalTwo;
        double AverageRollTwo = (DiceArrayTotalTwoD/positioncounter2);
    
        // Printing to two decimal places once again.
        System.out.print("\n\n\tPart D\n");
        System.out.printf("\n"+positioncounter2+" Possible Rolls! \n Average is: %.2f", AverageRollTwo);

    }
}

   