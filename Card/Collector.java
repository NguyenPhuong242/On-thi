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

    public List<Card> addCard(Card card){
        List<Card> cardclone = new ArrayList<>();
        for(int i = 0; i < cards.size() + 1; i++){
            cardclone.add(card);
        }
        cards = cardclone;
        return cards;

    }

    public List<Card> getCards(Card card){
        List<Card> cardget = new ArrayList<>();
        for(int j = 0; j < cards.size(); j++){
            ((Collector) cardget).getCards(card);
        }
        return cardget;
    }
}
