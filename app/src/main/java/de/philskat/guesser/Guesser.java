package de.philskat.guesser;

import de.philskat.guesser.models.Guess;
import de.philskat.guesser.models.Reply;

public class Guesser {
  private int guessCount;
  private int upper;
  private Guess value;

  public Guesser(int upper) {
    this.guessCount = 0;
    this.upper = upper;
    this.value = new Guess(this.upper);
  }

  public Reply takeGuess(String guess) {
    int iGuess = Integer.parseInt(guess);
    int accuracy = 0;

    this.guessCount++;

    if (!value.checkGuess(iGuess)) {
      accuracy = Math.abs(iGuess - value.getGuessValue());

      if (iGuess > value.getGuessValue()) {
        return Reply.LOWER;
      } else {  
        return Reply.HIGHER;
      }
    } else {
      return Reply.CORRECT;
    }
  }

  public int getValue() {
    return value.getGuessValue();
  }

  public void newGuess() {
    value = new Guess(upper);
  }
}
