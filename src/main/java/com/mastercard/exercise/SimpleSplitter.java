package com.mastercard.exercise;

public class SimpleSplitter implements Splitter {

  private String source;
  private static final String punctuation = ".?!";

  public SimpleSplitter(String source) {
    this.source = source;
  }

  public Result parse() {

    if (source == null) {
      return new Result(0, null);
    }

    String lastCharacter = source.substring(source.length() - 1);
    if (punctuation.indexOf(lastCharacter) >= 0) {
      source = source.substring(0, source.length() - 1);
    }

    String[] words = source.split(" ");

    int maxLength = 0;
    String word = null;

    for (int i = 0; i < words.length; i++) {
      if (words[i].length() > maxLength) {
        maxLength = words[i].length();
        word = words[i];
      }
    }

    return new Result(maxLength, word);
  }

}
