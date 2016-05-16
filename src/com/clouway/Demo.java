package com.clouway;
import java.io.IOException;
import java.util.Scanner;


public class Demo {
  public static void main(String[] args) throws IOException {
    System.out.print("name file: ");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.print("Enter breaker character ");
    String breaker = sc.nextLine();
    System.out.println("Write to file: ");
    File test = new File(name, breaker);
    test.write();
    System.out.println("content will be reversed in reversedfile.txt");
    test.reverse("reversedfile.txt");
  }
}
