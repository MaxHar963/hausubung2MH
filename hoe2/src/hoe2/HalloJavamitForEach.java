/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoe2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author angeh
 */
public class HalloJavamitForEach {
    
    List<String> list1 = new ArrayList<>();

    public HalloJavamitForEach() {
        list1.add("Hallo Java");
        list1.add("Hallo Java2");
        Testmethod();
    }
    
    public void Testmethod()    
    {
        System.out.println("for-Schleife: \n");
        
        for(int i = 0;i<list1.size();i++)
        {
            System.out.println(list1.get(i));
        }
        
        System.out.println("\nforeach-Lambda: \n");
        list1.forEach((String s) -> System.out.println(s));
        
    }
}
