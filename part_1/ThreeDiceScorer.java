public class ThreeDiceScorer extends ThreeDice {

    // Calling Consutructor using super statement. Feeding in 3 int's. (Die)
    public ThreeDiceScorer(int s1, int s2, int s3){
        // calling super class
        super(s1,s2,s3);
    }

    // Initialising Score method
    public int Score(){
    // setitng roll = dice addition
    int RollTotal = getDie1()+getDie2()+getDie3();
    int FinalPoints=0;

        // Checking against dice functions and calculating score
        if (threeSame()){
            FinalPoints = RollTotal+50;
            // return Score
            return FinalPoints;
        }
        else if (runOfThree()){
            FinalPoints = RollTotal+30;
            return FinalPoints;
        }
        else if (pair()){
            FinalPoints = RollTotal+20;
            return FinalPoints;
        }
        else{
            FinalPoints = RollTotal;
            return FinalPoints;
        }
    }
    
}