import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> unDealt;
    private ArrayList<Card> Dealt;

    public Deck(String[] rank, String[] suits, int[] values)
    {
        for(int i = 0; i <= 52; i++)
        {
            unDealt.add(i, Card(rank[i], suits[i], values[i]));
        }
    }

    public boolean isEmpty(ArrayList a)
    {
        if(a.size() == 0)
        {
            return true;
        }
        else
            return false;
    }

    public int size(ArrayList a)
    {
        return a.size();
    }

    public ArrayList<Card> deal(ArrayList a)
    {
        if (a.size() > 0)
        {
            a.get(0);
            Dealt.add(a.get(0));

        }
        else
        {
            return null;
        }
        return a;
    }
}
