package com.clauway.task2;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by clouway on 13.05.16.
 */
public class Demo {
  public static void main(String[] args) {
    File file = new File();
    System.out.print("name file:");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println("Enter Stop symbol ");
    String stopsymbol = sc.nextLine();
    System.out.println("Write to file.");
    TextSource textSource = new BreakingTextSource(stopsymbol);
    file.write(textSource, name);
  }
}