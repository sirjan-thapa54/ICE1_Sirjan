package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and searches for a hard-coded lucky card in the magic hand.
 * @author thapasir
 * @modifier Sirjan Thapa, 991755708
 */
public class CardTrick {

    public static void main(String[] args) {
       
        Card[] magicHand = new Card[7];
        
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) (Math.random() * 13) + 1); // Random value between 1 and 13
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]); // Random suit
            magicHand[i] = c;
        }

     
        Card luckyCard = new Card();
        luckyCard.setValue(6); 
        luckyCard.setSuit("Hearts");

      
        System.out.println("\nMagic Hand:");
        for (Card c : magicHand) {
            System.out.println("Card: " + c.getValue() + " of " + c.getSuit());
        }

        // Search for the lucky card in the magic hand
        boolean luckyFound = false;
        
        for (Card c : magicHand) {
            if (c.getValue() == luckyCard.getValue() && c.getSuit().equals(luckyCard.getSuit())) {
                luckyFound = true;
            }
        }

        // Report the result for the lucky card
        if (luckyFound) {
            System.out.println("\nCongratulations! The lucky card (" + luckyCard.getValue() + " of " + luckyCard.getSuit() + ") is in the magic hand.");
        } else {
            System.out.println("\nSorry, the lucky card (" + luckyCard.getValue() + " of " + luckyCard.getSuit() + ") is not in the magic hand.");
        }
    }
}
