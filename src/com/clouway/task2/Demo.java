package com.clouway.task2;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by clouway on 12.05.16.
 */
public class Demo {
  public static void main(String[] args) throws IOException {
    File test = new File();
    System.out.print("name file:");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println("Enter Stopsymbol for writing:");
    String stopsymbol =sc.nextLine();
    System.out.println("Write to file.");
    test.write(stopsymbol, name);
  }
}

