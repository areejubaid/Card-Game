/* This class represents each playing card and the colour and number on it.
 * It uses Comparable to sort based on card number.
 */
class Card implements Comparable<Card>{
    private Integer number;
    private String colour;
    
    // Constuctor that creates a card with number and colour and takes these as paramenters.
    public Card(Integer number1, String colour1){
        this.number = number1;
        this.colour = colour1;
    }

    //Getter for number
    public int getNumber(){
        return this.number;
    }

    // Getter for colour
    public String getColour(){
        return this.colour;
    }

    //Returns string representation of card.
    @Override
    public String toString(){
        return colour + " " + number;
    }

    // Compares this card and obj to check if they are equal.
    // They are equal if they have the same number and colour.
    @Override
    public boolean equals(Object obj){
        if (this==obj){
            return true;
        }
        if (!(obj instanceof Card)){
            return false;
        }
        Card card = (Card) obj;
        return number == card.number && colour.equals(card.colour);
    }

    // Uses comparator to compare two cards based on their number to be sorted.
    @Override
    public int compareTo(Card other){
        return Integer.compare(this.number, other.number);
    }
}