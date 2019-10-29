package hWork;
import java.util.*; 

public class cardNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] suits = {"Club", "Diamond", "Heart", "Spade", };
		String [] rank = {"A", "2", "3", "4", "5","6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] cardName = {"C", "D", "H", "S"};
		String [] cardNumber = {"Ace", "One", "Two", "Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
		String RankV = "" ;
		String SuitV = "";
		
		
		Cardname( suits, rank, cardName, cardNumber, RankV, SuitV);
		
		
		
	}
	public static void Cardname( String[] suits, String[] rank,String[] cardName, String[] cardNumber, String RankV, String SuitV) {
		
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a Card name");
		String Rank = console.nextLine();
		String Suit = console.nextLine();
		
		//nest if statement to  test if Rank.equals rank in loop to find rank
		 for(int i =0; i < rank.length; i++)
         {
                 if(Rank.equals(rank[i]))
                 {
                         RankV = cardNumber[i];
                 }
         }
		 //nest if statement to find the  to find suits 
         for(int j =0; j < cardName.length; j++)
         {
                 if(Suit.equals(cardName[j]))
                 {
                         SuitV = suits[j];
                 }      
         }
        
         System.out.print(RankV +" of "+ SuitV);
 }
}



