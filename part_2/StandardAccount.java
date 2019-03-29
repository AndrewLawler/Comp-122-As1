public abstract class StandardAccount {

    // Initialising Protected Parameters
    protected String Type = "";
    protected int Package = 0;
    protected int Evening;
    protected int Daytime;
    protected float DaytimeCost;
    protected float EveningCost;
    protected float BroadbandAmount;
    protected int Broadband;
    protected int Channels;
    protected float BroadbandCost;
    protected float TotalEvening;
    protected float TotalBroadband;
    protected float TotalDaytime;
    protected float Total;

    // Creating constructor and telling it is the parameter from THIS page
    public StandardAccount(int Daytime, int Evening, int Broadband){
        this.Daytime = Daytime;
        this.Evening = Evening;
        this.Broadband = Broadband;
    }

    // Print Result Method
    public void printResult(int BestAccount){
        //String Array to print the best account
        String[] Accounts = {"Bronze", "Silver", "Gold"};

        // Outputs
        System.out.println("Account Summary for "+Type+" Account");
        System.out.println("Package Cost: "+Package);
        System.out.println("Cost of daytime calls: "+DaytimeCost+"/min");
        System.out.println("Cost of evening and weekend calls: "+EveningCost+"/min");
        System.out.println("Number of Channels: "+Channels);
        System.out.println("Broadband Included: "+BroadbandAmount+"GB");
        System.out.println("Broadband Cost (above included limit): "+BroadbandCost+"/GB");
        System.out.println("Total daytime calls cost: "+TotalDaytime);
        System.out.println("Total evening calls cost: "+TotalEvening);
        System.out.println("Total (extra) broadband cost: "+TotalBroadband);
        System.out.println("Total cost: "+Total);

        // if statements used to print the extra information
        if(Type=="Silver"){
            System.out.println("Spotify Account provided");
        }
        if(Type=="Gold"){
            System.out.println("Spotify Account provided");
            System.out.println("Music on Demand provided");
            System.out.println("\n");
            System.out.println(Accounts[BestAccount]+" Account is cheapest cost.");
        }
        System.out.println("\n");
    }

    // Calculate total method, takes in the parameters and calculates the overall total
    public float CalculateTotal(){
        Total = TotalBroadband+TotalEvening+TotalDaytime+Package;
        return Total;
    }

    // Input to check if the broadband input is greater than the actual broadband. If it is, it will calculate the added cost
    public float TotalBroadband(int Broadband, float BroadbandAmount, float BroadbandCost){
        if(Broadband>BroadbandAmount){
            float TotalBroadband = (Broadband - BroadbandAmount)*BroadbandCost;
            return TotalBroadband;
        }
        else{
            float TotalBroadband = 0f;
            return TotalBroadband;
        }
    }

    // Calculates the total evening cost by taking in the evening input and the cost
    public float TotalEvening(int Evening, float EveningCost){
        float TotalEvening = Evening*EveningCost;
        return TotalEvening;
    }

    // Calculates the daytime cost by taking in the daytime input and the cost
    public float TotalDaytime(int Daytime, float DaytimeCost){
        float TotalDaytime = Daytime*DaytimeCost;
        return TotalDaytime;
    }
}