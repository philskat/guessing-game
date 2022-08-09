package de.philskat.guesser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import de.philskat.guesser.models.Reply;

public class GuessHandlerTest {
  @Test
  public void initGuess() {
    GuessHandler guesser = new GuessHandler(10);

    assertTrue(guesser.getValue() > 0);
    assertTrue(guesser.getValue() < 10);
  }

  @Test
  public void checkGuess() {
    GuessHandler guesser = new GuessHandler(10);

    assertEquals(Reply.CORRECT, guesser.takeGuess(Integer.toString(guesser.getValue())));
  }
}
