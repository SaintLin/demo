package com.demo;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

   public static void main(String[] asg) {

      List<String> list = new ArrayList<String>();

      list.add("1");
      list.add("2");
      list.add("3");
      list.add("4");

      Iterator<String> iterator = list.iterator();
      while (iterator.hasNext()) {
         System.out.println(iterator.next());
      }
   }


}
