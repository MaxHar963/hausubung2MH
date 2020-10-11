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
public class NumberTester {

    NumberTest oddevenTester;
    NumberTest primeTester;
    NumberTest palindromTester;
    File objFile;

    public NumberTester(String fileName) {
        objFile = new File(fileName + ".txt");
        

    }

    public interface NumberTest {

        boolean testNumber(int number);

    }

    public void setOddEvenTester(NumberTest oddTester) {

        this.oddevenTester = oddTester;

    }

    public void setPrimeTester(NumberTest primeTester) {

        this.primeTester = primeTester;

    }

    public void setPalindromeTester(NumberTest palindromeTester) {

        this.palindromTester = palindromeTester;

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

    public List<String> testFile(List<String> list1) {

        List<String> strList = new ArrayList<>();

        for (int i = 1; i < Integer.parseInt(list1.get(0)); i++) {

            String x = list1.get(i);
            String[] arr = x.split(" ");

            switch (arr[0]) {

                case "1":
                    if (oddevenTester.testNumber(Integer.parseInt(arr[1]))) {

                        strList.add("EVEN");

                    } else {

                        strList.add("ODD");

                    }
                    break;
                case "2":
                    if (primeTester.testNumber(Integer.parseInt(arr[1]))) {

                        strList.add("PRIME");

                    } else {

                        strList.add("NO PRIME");

                    }
                    break;
                case "3":
                    if (palindromTester.testNumber(Integer.parseInt(arr[1]))) {

                        strList.add("PALINDROME");

                    } else {

                        strList.add("NO PALINDROME");

                    }
                    break;

            }

        }

        return strList;
    }

}
