/**
 *The Player class should be able to represent the set of cards a player has in hand.
 * The player class must allow to take a card from the deck and put it in the hand, 
 * count the points of the cards in hand...
 **/
import java.util.ArrayList;

public class Player {
     private ArrayList<Card>  hand;   // The cards in the plyaer's hand.
 
     /*Constructor*/
 Player(){
    hand = new ArrayList<>();
    }  
 
 /*Accessor*/
 public ArrayList<Card> getHand() {
    return hand;
    }
 
 /**
     * Remove all cards from the hand, leaving it empty.
  */
    public void clear() {
    hand.clear();
    }

    /**
     * Add a card to the hand.  It is added at the end of the current hand.
     * @param card the non-null card to be added.
     * @throws NullPointerException if the parameter card is null.
     */
    public void add(Card card) {
         if(card == null) // card is null, throw exception
           throw new NullPointerException();
       hand.add(card); // non-null card, add it to the end
    }

    /**
     * Remove a card from the hand, if present.
     * @param card the card to be removed.  If card is null or if the card is not in 
     * the hand, then nothing is done.
     */
    public void remove(Card card) {
        if(card != null) // card is not null
       {
           // loop over the hand
           for(int i=0;i<hand.size();i++)
           {
               Card curr = (Card)hand.get(i); // get the Card at index i
               // card at index i = card to remove
               if(curr.getValue() == card.getValue() && curr.getColor() == card.getColor())
               {
                   hand.remove(i); // remove the card at index i, and exit the loop
                   break;
               }
           }
       }
    }

    /**
     * Remove the card in a specified position from the hand.
     * @param position the position of the card that is to be removed, where
     * positions are numbered starting from zero.
     * @throws IllegalArgumentException if the position does not exist in
     * the hand, that is if the position is less than 0 or greater than
     * or equal to the number of cards in the hand.
     */
    public void remove(int position) {
         if(position >= 0 && position < hand.size())
           hand.remove(position); // remove the card at position
       else // invalid position
           throw new IllegalArgumentException();
    }

    /**
     * Returns the number of cards in the hand.
     */
    public int totalCards() {
         return hand.size();
    }

    /**
     * Gets the card in a specified position in the hand.  (Note that this card
     * is not removed from the hand!)
     * @param position the position of the card that is to be returned
     * @throws IllegalArgumentException if position does not exist in the hand
     */
    public Card getCard(int position) {
        if(position >= 0 && position < hand.size())
           return (Card)hand.get(position); // valid position, return the Card at index position
       else // invalid position
           throw new IllegalArgumentException();
    }

   /**
     * Computes and returns the total value of this hand in the game
     */
    public int getHandTotal () 
    {
    int numAce = 0; // initialize number of Aces to 0
    int totalValue = 0; // initialize totalValue of hand is 0
    for(int i=0;i<hand.size();i++)
    {
    Card card = (Card)hand.get(i); // get the Card at index i
    if(card.getValue() > 1 && card.getValue() < 10) // Card is of value [2, 9], add the value
    {
        totalValue += card.getValue();
    }
    else if(card.getValue() == 1) 
    {
       totalValue += card.getValue(); // add the value i.e 1 to totalValue
       numAce++; // increment number of aces by 1
    }
    else if(card.getValue() > 10) // card is of value 10 or higher
    {
       totalValue += 10; // add 10 to totalValue   
    }  
    }
    while(numAce > 0)
    {
       if((totalValue+10) <= 21) 
       {
           totalValue += 10; // add 10 to total value
           numAce--; // decrement number of aces by 1
       }
       else
       {
           break;
       }
    }
    return totalValue;
    }
    
    /**
     * Sorts the cards in the hand so that cards of the same color are
     * grouped together, and within a color the cards are sorted by value.
     * Note that aces are considered to have the lowest value, 1.
     */
    public void sortByColor() {
    for(int i=0;i<hand.size()-1;i++)
       {
           // loop to compare adjacent cards and swap them if out of order
           for(int j=0;j<hand.size()-1-i;j++)
           {
               Card curr = (Card)hand.get(j);
               Card next = (Card)hand.get(j+1);
                 
               // color of curr > color of next or same color but value of curr > value of next, swap the cards
               if((curr.getColor() > next.getColor()) || ((curr.getColor() == next.getColor()) && (curr.getValue() > next.getValue())))
               {
                   hand.set(j, hand.get(j+1));
                   hand.set(j+1, curr);
               }
           }
       }
    }

    /**
     * Sorts the cards in the hand so that cards of the same value are
     * grouped together.  Cards with the same value are sorted by color.
     * Note that aces are considered to have the lowest value, 1.
     */
    public void sortByValue() {
    for(int i=0;i<hand.size()-1;i++)
       {
           // loop to compare adjacent cards and swap them if out of order
           for(int j=0;j<hand.size()-1-i;j++)
           {
               Card curr = (Card)hand.get(j);
               Card next = (Card)hand.get(j+1);
                 
               // value of curr > value of next or same value but color of curr > color of next, swap the cards
               if((curr.getValue() > next.getValue()) || ((curr.getValue() == next.getValue()) && (curr.getColor() > next.getColor())))
               {
                   hand.set(j, hand.get(j+1));
                   hand.set(j+1, curr);
               }
           }
       }
   }
} 