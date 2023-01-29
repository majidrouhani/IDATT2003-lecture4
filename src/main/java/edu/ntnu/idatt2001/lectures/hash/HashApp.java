package edu.ntnu.idatt2001.lectures.hash;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class HashApp {
  private static final Logger logger = Logger.getLogger(HashApp.class.getName());

  public void testHashMap(){
    List<List<String>> records = new ArrayList<>();  

    InputStream is = this.getClass().getResourceAsStream("/books.csv");

    InputStreamReader isr = new InputStreamReader(is);
    BufferedReader br = new BufferedReader(isr);
    Stream<String> lines = br.lines();
    
  }

  public static void main(String[] args) throws FileNotFoundException, IOException {
    HashApp h = new HashApp();
    h.testHashMap();
  }
}