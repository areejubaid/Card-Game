// THis class extends Card to add bonus points.
public class SpecialCard extends Card {
    private int bonuspoints;

    // Takes number, colour and bonus points as parameters to create a speacial card worth more point.
    // Uses super to call on the Card class.
    public SpecialCard(int number, String colour, int bonuspoints){
        super(number,colour);
        this.bonuspoints = bonuspoints;
    }

    // Getter for Bonus points.
    public int getBonusPoints(){
        return bonuspoints;
    }

    //Returns string representation of special card with bonus points.
    @Override
    public String toString(){
        return super.toString() + " (Bonus Points: )" + bonuspoints;
    }
}
