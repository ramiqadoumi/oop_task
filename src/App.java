import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        //game name
        System.out.println("Enter Game Name");
        String game_name = scan.next();
        Game game = new Game(game_name);

        //store card type
        ArrayList<CardType> cardtype = new ArrayList<>();
        cardtype.add(CardType.HEARTS);
        cardtype.add(CardType.CLUBS);
        cardtype.add(CardType.DIAMONDS);
        cardtype.add(CardType.SPADES);

        //determine number of cards according to game name 
        int cardnumber = 0;
        switch (game_name) {
            case "hand":
                cardnumber = 14;
                break;
            case "trex":
                cardnumber = 13;
                break;
            default:
                System.out.println("invaled name");
                break;
        }
        int card1[] = new int[cardnumber];
        int card2[] = new int[cardnumber];
        int card3[] = new int[cardnumber];
        int card4[] = new int[cardnumber];
        //player name
        String[] player_name = new String[4];
        System.out.println("player name");
        for (int i = 0; i < player_name.length; i++) {
            player_name[i] = scan.next();
        }
        Player p = new Player(player_name);

        //card number
        //store random number from 1 to 10 in array
        for (int i = 0; i < cardnumber; i++) {
            card1[i] = new Random().nextInt(11);
            card2[i] = new Random().nextInt(11);
            card3[i] = new Random().nextInt(11);
            card4[i] = new Random().nextInt(11);

        }
        System.out.println("The cards for each player, including number and type");
        //print name1 with his cards
        System.out.println(player_name[0] + " Cards");

        for (int i = 0; i < card1.length; i++) {
            System.out.print(card1[i] + " " + cardtype.get(0) + "   ");
            Collections.shuffle(cardtype);
        }
        System.out.println();

        //print name2 with his cards
        System.out.println(player_name[1] + " Cards");

        for (int i = 0; i < card2.length; i++) {
            System.out.print(card2[i] + " " + cardtype.get(0) + "   ");
            Collections.shuffle(cardtype);
        }
        System.out.println();

        //print name3 with his cards
        System.out.println(player_name[2] + " Cards");

        for (int i = 0; i < card3.length; i++) {
            System.out.print(card3[i] + " " + cardtype.get(0) + "   ");
            Collections.shuffle(cardtype);
        }
        System.out.println();

        //print name4 with his cards
        System.out.println(player_name[3] + " Cards");

        for (int i = 0; i < card4.length; i++) {
            System.out.print(card4[i] + " " + cardtype.get(0) + "   ");
            Collections.shuffle(cardtype);
        }
        System.out.println();

        System.out.println("Game Name " + game_name);
        System.out.println("Player Names " + Arrays.toString(p.players));

    }
}
