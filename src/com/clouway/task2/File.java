package com.clouway.task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class File {
  public String file;

  public File(String name) {
    file = name;
  }

  public void writeFile() throws IOException {
    BufferedWriter out = new BufferedWriter(new FileWriter(file));
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String line;

    do {
      line = in.readLine();
      out.write(line);
      out.newLine();
    } while (!line.equals("."));
    in.close();
    out.close();
  }
}


