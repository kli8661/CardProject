public class DeckTester {
    public static void main(String[] args)
    {
        String[] ranks = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = new String[]{"Diamond", "Hearts", "Clubs", "Spades"};
        int[] value = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13};
        Deck deck = new Deck(ranks, suits, value);
        deck.shuffle();
        System.out.println(deck.deal());
    }
}
