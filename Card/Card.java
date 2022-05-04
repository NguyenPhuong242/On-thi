public class Card {
    private String name;
    private boolean shiny;
    private double value;
    private int year;

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

    public Card(String name,boolean shiny, double value, int year){
        this.name = name;
        this.shiny = shiny;
        this.value = value;
        this.year = year;
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
        
        if (card instanceof Card){
            if (this.name == card.name 
            && this.shiny == card.shiny
            && this.value == card.value
            && this.year == card.year){
                return true;
            }
            return false;
        }
        return false;
    }

    public String toString(){
        String shi = " ";
        if (shiny = true){
            shi += "shiny";
        }
        return name + " " + shi + " " + value + " " + year;
    }
}
