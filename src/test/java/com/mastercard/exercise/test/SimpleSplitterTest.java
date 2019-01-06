package com.mastercard.exercise.test;

import com.mastercard.exercise.Result;
import com.mastercard.exercise.SimpleSplitter;
import org.junit.Assert;
import org.junit.Test;

public class SimpleSplitterTest {

  @Test
  public void test() {
    SimpleSplitter simpleSplitter = new SimpleSplitter("The cow jumped over the moon");

    Result result = simpleSplitter.parse();
    Assert.assertEquals(6, result.getLength());
    Assert.assertEquals("jumped", result.getWord());
  }

  @Test
  public void testPunctuation() {
    SimpleSplitter simpleSplitter = new SimpleSplitter("The cow jumped over the longest.");

    Result result = simpleSplitter.parse();
    Assert.assertEquals(7, result.getLength());
    Assert.assertEquals("longest", result.getWord());
  }

  @Test
  public void testNull() {
    SimpleSplitter simpleSplitter = new SimpleSplitter(null);

    Result result = simpleSplitter.parse();
    Assert.assertEquals(0, result.getLength());
    Assert.assertNull(result.getWord());
  }

  @Test
  public void testEmpty() {
    SimpleSplitter simpleSplitter = new SimpleSplitter("");

    Result result = simpleSplitter.parse();
    Assert.assertEquals(0, result.getLength());
    Assert.assertNull(result.getWord());
  }

  @Test
  public void testSingleWord() {
    SimpleSplitter simpleSplitter = new SimpleSplitter("cow");

    Result result = simpleSplitter.parse();
    Assert.assertEquals(3, result.getLength());
    Assert.assertEquals("cow", result.getWord());
  }

}
