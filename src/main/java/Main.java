import com.sandra.Match;

public class Main {
    public static void main(String[] args) {
        // No command line as instructed - see README.
    	
    	
    	String player1="Jouer1";
    	String player2="Jouer2";
    	
    	Match match = new Match(player1, player2);
    	match.pointWonBy(player1);
    	match.score();
    }
}
