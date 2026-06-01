package JAVA_DAY_6;
public class Cricket_Match_Scorecard {
	String playerName;
    int runs;
    int balls;
    double strikeRate;

    Cricket_Match_Scorecard(String pn, int r, int b)
    {
        playerName = pn;
        runs = r;
        balls = b;
        if (balls > 0) 
        {
            strikeRate = (double) (runs * 100) / balls;
        } else
        {
            strikeRate = 0;
        }
    }
    void display() {
        System.out.println("Strike Rate = " + (int) strikeRate);
    }

    public static void main(String[] args) {
        Cricket_Match_Scorecard player1 = new Cricket_Match_Scorecard("KOHLI", 250, 50);
        player1.display();
    }
}

