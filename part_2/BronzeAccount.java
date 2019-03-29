public class BronzeAccount extends StandardAccount {

    public BronzeAccount(int Daytime, int Evening, int Broadband){
        // Getting super parameters
        super(Daytime, Evening, Broadband);
        // Initialising the protected parameters as they should be for this account
        DaytimeCost = 0.12f;
        EveningCost = 0.05f;
        Type = "Bronze";
        Package = 35;
        BroadbandAmount = 200f;
        Channels = 60;
        BroadbandCost = .2f;
        // Calculating the Totals using the methods created in the StandardAccount.java file
        TotalBroadband = TotalBroadband(Broadband, BroadbandAmount, BroadbandCost);
        TotalDaytime = TotalDaytime(Daytime, DaytimeCost);
        TotalEvening = TotalEvening(Evening, EveningCost);
        Total = CalculateTotal();

    }
    
}