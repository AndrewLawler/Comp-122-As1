import java.util.Scanner;

public class AccountUser {
    public static void main(String[] args){
        // Setting inputs to 0.
        int Evening = 0;
        int Daytime = 0;
        int Broadband = 0;
        // Scanner initialised
        Scanner KeyboardInput = new Scanner(System.in);
        int i = 0;
        // Taking inputs and validating them.
        i = 1;
        // While i eqauls 1, run this. If input passes, break loop.
        while(i==1){
            System.out.print("Please enter the number of daytime minutes used per month: ");
            Daytime = KeyboardInput.nextInt();
            if(Daytime>=0){
                i = 2;
            }
        }
        i = 1;
        while(i==1){
            System.out.print("Please enter the number of nighttime minutes used per month: ");
            Evening = KeyboardInput.nextInt();
            if(Evening>=0){
                i = 2;
            }
        }
        i = 1;
        while(i==1){
            System.out.print("Please enter the number of Gigabytes used per month: ");
            Broadband = KeyboardInput.nextInt();
            if(Broadband>=0){
                i = 2;
            }
        }
        // Closing the scanner.
        KeyboardInput.close();

        System.out.println("\n");

        // Creating objects for the Accounts, sending in the parameters.
        BronzeAccount Bronze = new BronzeAccount(Daytime, Evening, Broadband);
        SilverAccount Silver = new SilverAccount(Daytime, Evening, Broadband);
        GoldAccount Gold = new GoldAccount(Daytime, Evening, Broadband);

        // Finding out the Total for all the account types then storing them inside an array.
        float TotalSilver = Silver.CalculateTotal();
        float TotalBronze = Bronze.CalculateTotal();
        float TotalGold = Gold.CalculateTotal();
        float[] TotalAccount = {TotalBronze, TotalSilver, TotalGold};
        float Cheapest = TotalAccount[0];
        int BestAccount = 0;

        // Looping to find the cheapest account type or reccomended account type 
        for(int j=0; j<3; j++){
            if(TotalAccount[j]<Cheapest){
                Cheapest = TotalAccount[j];
                BestAccount = j;
            }
            else if(TotalAccount[j]==Cheapest){
                Cheapest = TotalAccount[j];
                BestAccount = j;
            }
        }


        // Sending account type into the print statement.
        Bronze.printResult(BestAccount);
        Silver.printResult(BestAccount);
        Gold.printResult(BestAccount);

    }


}