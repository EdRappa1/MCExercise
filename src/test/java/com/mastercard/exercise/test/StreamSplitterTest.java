package com.mastercard.exercise.test;

import com.mastercard.exercise.Result;
import com.mastercard.exercise.StreamSplitter;
import org.junit.Assert;
import org.junit.Test;

public class StreamSplitterTest {

  @Test
  public void test() {
    StreamSplitter splittererImpl = new StreamSplitter("The cow jumped over the moon.");

    Result result = splittererImpl.parse();
    Assert.assertEquals(6, result.getLength());
    Assert.assertEquals("jumped", result.getWord());
  }

  @Test
  public void testNull() {
    StreamSplitter splittererImpl = new StreamSplitter(null);

    Result result = splittererImpl.parse();
    Assert.assertEquals(0, result.getLength());
    Assert.assertNull(result.getWord());
  }

  @Test
  public void testEmpty() {
    StreamSplitter splittererImpl = new StreamSplitter("");

    Result result = splittererImpl.parse();
    Assert.assertEquals(0, result.getLength());
    Assert.assertNull(result.getWord());
  }

  @Test
  public void testSingleWord() {
    StreamSplitter splittererImpl = new StreamSplitter("cow");

    Result result = splittererImpl.parse();
    Assert.assertEquals(3, result.getLength());
    Assert.assertEquals("cow", result.getWord());
  }
}
