package com.mastercard.exercise;

import java.util.Arrays;
import java.util.Comparator;

public class StreamSplitter implements Splitter {

  private String source;

  public StreamSplitter(String source) {
    this.source = source;
  }

  public Result parse() {

    if (source == null || source.equals("")) {
      return new Result(0, null);
    }

    Result result = Arrays.stream(source.split(" "))
        .map(s -> {return new Result(s.length(), s);})
        .max(Comparator.comparing(Result::getLength))
        .get();

    return result;
  }

}
