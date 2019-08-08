/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author HEMANT KUMAR
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//       Map<String,String> mt = new HashMap<>();
//       mt.put("amit", "123");
//       mt.put("sumit", "223");
//       mt.put("aman", "323");
//       mt.put("ekta", "423");
//       mt.put("naman", "523");
//        System.out.println(mt.get("naman"));
//        Set<String> keys = mt.keySet();
//        for(String i: keys)
//            System.out.println(i +" : "+ mt.get(i));
       /* frame newframe[] = new frame[2];   
            newframe[0] = new frame();
            newframe[0].add("abc","amit","kumar");
            newframe[1] = new frame();
            newframe[1].add("bcd","sumit","kumar");
         newframe[1].get("abc"); 
         */
         
         Addition addition = new Addition();
         System.out.println(addition.add(5,5));
        
    }

    
    
}
