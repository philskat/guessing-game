package de.philskat.guesser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import de.philskat.guesser.models.Reply;

public class GuesserTest {
  @Test
  public void initGuess() {
    Guesser guesser = new Guesser(10);

    assertTrue(guesser.getValue() > 0);
    assertTrue(guesser.getValue() < 10);
  }

  public void checkGuess() {
    Guesser guesser = new Guesser(10);

    assertEquals(Reply.CORRECT, guesser.takeGuess("10"));
  }
}
