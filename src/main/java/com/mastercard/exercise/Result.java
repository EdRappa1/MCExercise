package com.mastercard.exercise;

public class Result {

  private int length;
  private String word;

  public Result() {
  }

  public Result(int length, String word) {
    this.length = length;
    this.word = word;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }
}
