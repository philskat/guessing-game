package de.philskat.guesser;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.philskat.guesser.models.Reply;

public class App {
    public static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {        
        // Parse args
        for (int i = 0; i <= args.length; i++) {
            logger.info("Arg " + i + ": " + args[i]);
        }

        int upper = Integer.parseInt(args[1]);

        Guesser guesser = new Guesser(upper);
        boolean running = true;
        
        logger.info("Selected value: " + guesser.getValue());

        while (running) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Take a guess (0-50)");

            String guess = scanner.nextLine();

            logger.info("Guessed: " + guess);

            Reply reply = guesser.takeGuess(guess);

            switch (reply) {
                case HIGHER:
                    System.out.println("Higher");
                    break;

                case LOWER:
                    System.out.println("Lower");
                    break;

                case CORRECT:
                    System.out.println("Right choice");
                    running = false;
            }
        }
    }
}
