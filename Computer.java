import java.util.Scanner;

public class Computer {
    private Player player;
    private Dealer dealer;
    private Scanner sc;
    private boolean isPlayerWin = false;

    public Computer(Player player, Dealer dealer) {
        this.player = player;
        this.dealer = dealer;
    }

    public Player getPlayer() {
        return player;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public boolean isPlayerWin() {
        int playerHandValue = player.getHand().calculateHand();
        int dealerHandValue = dealer.getHand().calculateHand();

        if (playerHandValue > dealerHandValue) {
            isPlayerWin = true;
        }

        return isPlayerWin;
    }

    public void deal() {
        dealer.dealerMoves();

        System.out.println("Here's the top card of the dealer's hand: ");
        dealer.getHand().showOneCard();

        System.out.println("Here's your hand: ");
        player.getHand().printHand();
    }

    // public void prompt() {
        
    // }
}
