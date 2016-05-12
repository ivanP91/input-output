package com.clouway.task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class InputOutputFile {
  public String file;
  public InputOutputFile(String name) {
    file = name;
  }
  public void writeFile() throws IOException {
    BufferedWriter out = new BufferedWriter(new FileWriter(file));
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String line;
    try {
      do {
        line = in.readLine();
        out.write(line);
        out.newLine();
      } while (!line.equals("."));
    } catch (IOException io) {
      io.printStackTrace();
    } finally {
      out.close();
      in.close();
    }
  }
}
