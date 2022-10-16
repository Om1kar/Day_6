package Day6Logical.J_Unit;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the change Amount to be returned");
        int Change = sc.nextInt();
        int FiveHundredRsNotes = 0;
        int ThousandRsNotes = 0;
        int HundredRsNotes = 0;
        int FiftyRsNotes = 0;
        int TenRsNotes = 0;
        int TwoRsCoins = 0;
        int OneRsCoin =0;

        while(Change>=1000) {
            ThousandRsNotes = ThousandRsNotes + 1;
            Change=Change - 1000;
        }
        while(Change>=500){
            FiveHundredRsNotes = FiveHundredRsNotes + 1;
            Change =Change - 500;
        }
        while(Change>=100) {
            HundredRsNotes = HundredRsNotes + 1;
            Change = Change  - 100;
        }
        while(Change>=50) {
            FiftyRsNotes = FiftyRsNotes + 1;
            Change = Change - 50;
        }
        while(Change>=10) {
            TenRsNotes = TenRsNotes + 1;
            Change = Change - 10;
        }
        while(Change>=2) {
            TwoRsCoins = TwoRsCoins + 1;
            Change = Change -2;
        }
        while(Change>=1) {
            OneRsCoin = OneRsCoin + 1;
            Change = Change - 1;
        }
        int TotalNotes = ThousandRsNotes + FiveHundredRsNotes + HundredRsNotes + FiftyRsNotes + TenRsNotes;
        int TotalCoins = TwoRsCoins + OneRsCoin;
        System.out.println("Here is your change = " + "500rsNotes = " + FiveHundredRsNotes + " " + "1000rsNotes = " + ThousandRsNotes + " " + "100rsNotes = " + HundredRsNotes + " " + "50rsNotes = " + FiftyRsNotes + " " + "10rsNotes = " + TenRsNotes + " " + "2rsCoin = " + TwoRsCoins + " " + "1rsCoins = " + OneRsCoin);
        System.out.println("Total Notes received = " +TotalNotes);
        System.out.println("Total coins received = " +TotalCoins);
    }
}
