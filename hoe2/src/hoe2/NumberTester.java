/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoe2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author angeh
 */
public class NumberTester implements NumberTest {

    NumberTester oddTester;
    NumberTester primeTester;
    NumberTester palindromTester;
    File objFile;

    public NumberTester(String fileName) {
        objFile = new File(fileName + ".txt");
        try {
            processData(readFile());
        } catch (Exception e) {
            System.out.println("Something is wrong with the File");
        }
        
        
    }

    public void setOddEvenTester(NumberTester oddTester) {

        this.oddTester = oddTester;

    }

    public void setPrimeTester(NumberTester primeTester) {

        this.primeTester = primeTester;

    }

    public void setPalindromeTester(NumberTester palindromeTester) {

        this.palindromTester = palindromeTester;

    }

    public void testFile() {
        //todo
    }

    @Override
    public boolean testNumber(int number) {
        return true;
    }

    public List readFile() {
        List<String> list = new ArrayList<>();

        try {

            Scanner reader = new Scanner(objFile);
            while (reader.hasNextLine()) {
                list.add(reader.nextLine());
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");

        }

        return list;

    }
    
    public List processData(List list1)
    {
    
          for(int i = 0;i<Integer.parseInt((String) list1.get(0));i++)
          {
          
               System.err.println(list1.get(i));
          
          
          }
    
          return new ArrayList();
    }

}
