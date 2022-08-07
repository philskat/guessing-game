package de.philskat.guesser.models;

public class Guess {
  private int guessValue;

  public Guess(int upper) {
    if (upper > 0) {
      this.guessValue = (int)(Math.random() * upper);
    }
  }

  public boolean checkGuess(int guess) {
    return guess == guessValue;
  }

  public int getGuessValue() {
    return guessValue;
  }
}
