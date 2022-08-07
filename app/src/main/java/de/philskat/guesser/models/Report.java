package de.philskat.guesser.models;

public class Report {
  private int[] guesses;
  private int actualValue;

  public Report(int[] guesses, int actualValue) {
    this.guesses = guesses;
    this.actualValue = actualValue;
  }

  public String getReport() {
    String result = "";

    for (int i = 0; i < guesses.length; i++) {
      result += guesses[i] + "\n";
    }

    result += "\n" + actualValue;

    return result;
  }
  
}
