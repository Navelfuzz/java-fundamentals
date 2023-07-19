import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("I own " + 1 + " " + pluralize("dog", 1) + ".");
        System.out.println("I own " + 2 + " " + pluralize("cat", 2) + ".");
        System.out.println("I own " + 0 + " " + pluralize("turtle", 0) + ".");

        flipNHeads(1);
        flipNHeads(2);
        
        clock();
    }

    public static String pluralize(String word, int number) {
        if (number == 1) {
            return word;
        } else {
            return word + "s";
        }
    }
    
   public static void flipNHeads(int n) {
        int flips = 0;
        int consecutiveHeads = 0;

        while (consecutiveHeads < n) {
            double random = Math.random();
            flips++;

            if (random < 0.5) {
                System.out.println("tails");
                consecutiveHeads = 0;
            } else {
                System.out.println("heads");
                consecutiveHeads++;
            }
        }

        System.out.println("It took " + flips + " flips to flip " + n + " head(s) in a row.");
    }

    public static void clock() {
        LocalDateTime previousTime = null;

        while (true) {
            LocalDateTime currentTime = LocalDateTime.now();
            if (previousTime == null || currentTime.isAfter(previousTime)) {
                String time = currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println(time);
                previousTime = currentTime;

                try {
                    Thread.sleep(1000); // Delay for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}