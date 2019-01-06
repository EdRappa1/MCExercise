package com.mastercard.exercise;

public class Main {

  public static void main(String[] args) {

    StreamSplitter parser = new StreamSplitter("The cow jumped over the moon");

    Result result = parser.parse();

    System.out.println(result.getLength() + " " + result.getWord());

  }

}
