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
    BufferedWriter output = new BufferedWriter(new FileWriter(file));
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    String line;

    try {
      do {
        line = input.readLine();
        output.write(line);
       // output.newLine();
      } while (!line.equals("."));
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      output.close();
      input.close();
    }
  }
}
