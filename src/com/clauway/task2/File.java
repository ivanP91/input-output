package com.clauway.task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class File {
  void write(TextSource source, String name) {
    BufferedWriter out;
    try {
      out = new BufferedWriter(new FileWriter(name));
      while (source.hasNext()) {
        String nextLine = source.nextLine() + "\n";
        out.write(nextLine);
      }
      out.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}





