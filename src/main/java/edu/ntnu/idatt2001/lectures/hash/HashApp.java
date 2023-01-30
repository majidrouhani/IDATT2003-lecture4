package edu.ntnu.idatt2001.lectures.hash;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HashApp {
  private static final Logger logger = Logger.getLogger(HashApp.class.getName());

  public void testHashMap() throws IOException{
    List<String> listRecords = new ArrayList<>();  
    HashSet<String> hashSetRecords = new HashSet<>();  

    InputStream is = this.getClass().getResourceAsStream("/books.csv");

    InputStreamReader isr = new InputStreamReader(is);
    BufferedReader br = new BufferedReader(isr);
    
    for (String line = br.readLine(); line != null; line = br.readLine()) {
       listRecords.add(line);
       hashSetRecords.add(line);
    }


    logger.log(Level.INFO, "Lines {0}", listRecords.size());

    long start = System.currentTimeMillis();
    String thisLine = listRecords.get(271000);
    long finish = System.currentTimeMillis();
    long timeElapsed = finish - start;    
    System.out.println(timeElapsed);
    
    start = System.currentTimeMillis();    
    boolean result = hashSetRecords.contains(thisLine);
    finish = System.currentTimeMillis();
    timeElapsed = finish - start;    

    System.out.println(timeElapsed);
  }

  public static void main(String[] args) throws FileNotFoundException, IOException {
    HashApp h = new HashApp();
    h.testHashMap();
  }
}