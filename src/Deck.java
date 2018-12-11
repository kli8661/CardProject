import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> unDealt;
    private ArrayList<Card> Dealt;
    private int size;

    public Deck(String[] rank, String[] suits, int[] values)
    {
        unDealt = new ArrayList<Card>();
        for(int i = 0; i < suits.length; i++)
        {
            for(int j = 0; j < rank.length; j++)
            {
                unDealt.add(new Card(rank[j], suits[i], values[j]));
            }
        }
        size = unDealt.size();
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public int size()
    {
        return unDealt.size();
    }

    public void deal()
    {

    }
}
