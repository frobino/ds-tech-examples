package org.sparkexamples.wordcount;

import java.net.URISyntaxException;
import org.junit.Test;

public class WordCountTaskTest {
  @Test
  public void test() throws URISyntaxException {
    String inputFile = this.getClass().getClassLoader().getResource("loremipsum.txt").toString();
    new WordCountTask().run(inputFile);
  }
}