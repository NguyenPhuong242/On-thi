import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Card implements Comparable<Card> {
    private String name;
    private boolean shiny;
    private double value;
    private int year;
    private static int nextID  = 1;
    private int id;

    public String getName(){
        return name;
    }

    public boolean isShiny(){
        return shiny;
    }

    public double getValue(){
        return value;
    }

    public int getYear(){
        return year;
    }

    public int getID(){
        return id;
    }

    public Card(String name,boolean shiny, double value, int year){
        this.name = name;
        this.shiny = shiny;
        this.value = value;
        this.year = year;
        this.id = nextID;
    }

    public Card(Card card){
        this.name = card.name;
        this.shiny = card.shiny;
        this.value = card.value;
        this.year = card.year;
    }

    public boolean equals(Card card){
        if (card == null){
            return false;
        }
        
        if (!(card instanceof Card)){
            return false;
        }
        if (this.name == card.name 
        && this.shiny == card.shiny
        && this.value == card.value
        && this.year == card.year){
            return true;
        }
        return true;
    }

    public String toString(){
        String str = " ";
        if (shiny == true) {
            str += "Shiny ";
        }
        return name + str + " (" + value + " " + year + ")";
    }
    
    public int compareTo(Card card){
        if (this.value < card.value){
            return -1;
        }
        if (this.value == card.value){
            return 0;
        }
        return 1;

    }

    public int hashCode(){
        int code = 1;
        code += name.hashCode() * id;
        if (shiny == true){
            code *= 3;
        }
        else{
            code*=5;
        }
        code += (int) (value * id);
        code += year;
        return code;
    }

    public static Set<Card> cardSet(Collector[] collectors){
        Set<Card> cards = new HashSet<>();
        for (Collector collector : collectors ){
            List<Card> list = collector.getCards();
            for (Card card: list){
                cards.add(card);
            }
        }
        return cards;
    }

    public static Card rarest(Collector[] collectors){
        Map<Card, Integer> map = new HashMap<>();
        for(Collector collector :collectors){
            List<Card> list = collector.getCards();
            for (Card like: list){
                Integer value = map.get(like);
                if (value == null){
                    map.put(like, 1);
                }
                else{
                    map.put(like, value +1);
                }

            }
        }
        Integer minValue = Integer.MAX_VALUE;
        Card rarest = null;
        for (Card card : map.keySet()){
            Integer value = map.get(card);
            if (value<minValue){
                minValue = value;
                rarest = card;
            }
        }
        return rarest;
    }


}

    