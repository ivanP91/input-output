package com.clouway.task2;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by clouway on 12.05.16.
 */
public class Demo {
  public static void main(String[] args) throws IOException {
    System.out.print("name file:");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    File test = new File(name);
    System.out.println("Write to file.");
    test.writeFile();
  }
}

