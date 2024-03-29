import java.util.Random;

enum Suits {
    HEARTS,
    DIAMONDS,
    CLUBS,
    SPADES;
}

enum Values {
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING,
    ACE;
}

public class Card {
    private Suits cardSuit;
    private Values cardValue;

    Card(Values value, Suits suit) {
        this.cardValue = value;
        this.cardSuit = suit;
    }

    public Suits getCardSuit() {
        return cardSuit;
    }

    public Values getCardValue() {
        return cardValue;
    }

    public void printCard() {
        System.out.printf("%s of %s\n", this.getCardValue().name(), this.cardSuit.name());
    }

    public int calculateCard() {
        int value = 0;

        switch(getCardValue()) {
            case ONE:
                value = 1;
                break;
            case TWO:
                value = 2;
                break;
            case THREE:
                value = 3;
                break;
            case FOUR:
                value = 4;
                break;
            case FIVE:
                value = 5;
                break;
            case SIX:
                value = 6;
                break;
            case SEVEN:
                value = 7;
                break;
            case EIGHT:
                value = 8;
                break;
            case NINE:
                value = 9;
                break;
            case TEN, JACK, QUEEN, KING:
                value = 10;
                break;
            case ACE:
                value = 1;
                break;
            case default:
                break;
        }

        return value;
    }
}
