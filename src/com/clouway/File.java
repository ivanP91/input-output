package com.clouway;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class File {
  private String file;
  private String breakCharacter;

  public File(String file, String breakCharacter) {
    this.breakCharacter=breakCharacter;
    this.file=file;
  }

  public void write() throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter out = new BufferedWriter((new FileWriter(file)));
    try {
      String line;
      do {
        line = in.readLine();
        out.write(line);
        out.newLine();
      } while (!line.equals(breakCharacter));
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      out.close();
      in.close();
    }
  }
  public void reverse(String toFile) throws IOException {
    BufferedReader input = new BufferedReader(new FileReader(file));
    BufferedWriter output = new BufferedWriter(new FileWriter(toFile));
    String line;
    try {
      do {
        line = input.readLine();
        StringBuilder buf = new StringBuilder(line);
        output.write(String.valueOf(buf.reverse()));
        output.newLine();
      }
      while (!line.equals(breakCharacter));
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      input.close();
      output.close();
    }
  }
}