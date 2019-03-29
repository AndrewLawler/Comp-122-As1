public class SilverAccount extends StandardAccount {

    public SilverAccount(int Daytime, int Evening, int Broadband){
        // Getting super parameters
        super(Daytime, Evening, Broadband);
        // Setting parameters
        DaytimeCost = 0.12f;
        EveningCost = 0f;
        Type = "Silver";
        Package = 45;
        BroadbandAmount = 300f;
        Channels = 130;
        BroadbandCost = .1f;
        // Calculating the Totals using the methods created in the StandardAccount.java file
        TotalBroadband = TotalBroadband(Broadband, BroadbandAmount, BroadbandCost);
        TotalDaytime = TotalDaytime(Daytime, DaytimeCost);
        TotalEvening = TotalEvening(Evening, EveningCost);
        Total = CalculateTotal();
        
    }
    
}