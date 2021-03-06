import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public Card deal()
    {
        Dealt = new ArrayList<Card>();
        if(isEmpty())
        {
            return null;
        }
        else
        {
            Dealt.add(unDealt.get(0));
            unDealt.remove(0);
            return Dealt.get(0);
        }
    }

    public void shuffle()
    {
        Collections.shuffle(unDealt);
    }
}
