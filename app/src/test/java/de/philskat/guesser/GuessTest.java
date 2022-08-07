/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package de.philskat.guesser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import de.philskat.guesser.models.Guess;

public class GuessTest {
  public void initGuess() {
    Guess guess = new  Guess(50);

    assertTrue(guess.getGuessValue() > 0);
    assertTrue(guess.getGuessValue() < 50);
  }

  @Test
  public void checkGuess() {
    Guess guess = new Guess(10);

    assertEquals(true, guess.checkGuess(guess.getGuessValue()));
  }
}