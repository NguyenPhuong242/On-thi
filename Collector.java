import java.util.ArrayList;
import java.util.List;

public class Collector {
    private Card card;
    private List<Card> cards = new ArrayList<>();

    public Card getCard(){
        return card;
    }

    public List<Card> getList(){
        return cards;
    }

    public void addCard(Card card){
        cards.add(card);
    }


    public List<Card> getCards(){
        return cards;
    }
    
    

}
