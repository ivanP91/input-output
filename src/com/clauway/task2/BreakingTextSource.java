package com.clauway.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BreakingTextSource implements TextSource {
  private final String breakCharacter;
  private String input = " ";

  public BreakingTextSource(String breakCharacter) {

    this.breakCharacter = breakCharacter;
  }

  public boolean hasNext() {
    if (!input.equals(breakCharacter)) {
      return true;
    }
    return false;
  }

  public String nextLine() {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try {
      input = in.readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return input;
  }
}