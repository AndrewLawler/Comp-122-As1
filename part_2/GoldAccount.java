public class GoldAccount extends StandardAccount {

    public GoldAccount(int Daytime, int Evening, int Broadband){
        // Getting super parameters
        super(Daytime, Evening, Broadband);
        // Setting parameters
        DaytimeCost = 0f;
        EveningCost = 0f;
        Type = "Gold";
        Package = 60;
        BroadbandAmount = 2000f;
        Channels = 230;
        BroadbandCost = .1f;
        // Calculating the Totals using the methods created in the StandardAccount.java file
        TotalBroadband = TotalBroadband(Broadband, BroadbandAmount, BroadbandCost);
        TotalDaytime = TotalDaytime(Daytime, DaytimeCost);
        TotalEvening = TotalEvening(Evening, EveningCost);
        Total = CalculateTotal();
    }
    
}