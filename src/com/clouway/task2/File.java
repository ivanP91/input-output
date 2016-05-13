package com.clouway.task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class File {


  public void write(String stopsymbol, String name) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    read(stopsymbol, in, name);
    in.close();
  }

  private void read(String stopsymbol, BufferedReader in, String name) throws IOException {
    BufferedWriter out = new BufferedWriter(new FileWriter(name));
    String line;
    do {
      line = in.readLine();
      out.write(line);
      out.newLine();
    } while (!line.equals(stopsymbol));
    out.close();
  }
}





