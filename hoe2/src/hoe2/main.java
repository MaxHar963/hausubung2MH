/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoe2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author angeh
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //HalloJavamitForEach h = new HalloJavamitForEach();
        NumberTester n1 = new NumberTester("file");

        boolean istrue = true;
        boolean istrue1 = true;
        
        Scanner in = new Scanner(System.in);

        while (istrue) {

            System.out.println("NumberTester ...  1");
            System.out.println("AbstractCalulator ...  2");
            System.out.println("Exit ...  3");

            int eingabe = Integer.parseInt(in.nextLine());

            switch (eingabe) {

                case 1:
                    NumberTester.NumberTest isEven = (n) -> (n % 2) == 0;
                    NumberTester.NumberTest isPrime = (n) -> {

                        int sqrt = (int) Math.sqrt(n) + 1;
                        for (int i = 2; i < sqrt; i++) {
                            if (n % i == 0) {
                                return false;
                            }
                        }
                        return true;
                    };
                    NumberTester.NumberTest isPalindorme = (n) -> {

                        String x = n+"";
                        return x.equals(new StringBuilder(x).reverse().toString());
                        
                    };

                    n1.setOddEvenTester(isEven);
                    n1.setPrimeTester(isPrime);
                    n1.setPalindromeTester(isPalindorme);
                    
                    List<String> list = n1.testFile(n1.readFile());
                    
                    list.forEach((String s) -> System.out.println(s));
                    
                    break;

                case 2:
                    
                    AbstractCalculator relationalCalculator = new RationalCalculator(
                    (a, b) -> {
                    
                    double gemNenner = a.getB() * b.getB();
                    
                    double x = gemNenner/a.getB()*a.getA();
                    double y = gemNenner/b.getB()*b.getA();
                    return new Number(x+y,gemNenner);
                    
                    },
                    (a, b) -> {
                    
                    double gemNenner = a.getB() * b.getB();
                    
                    double x = gemNenner/a.getB()*a.getA();
                    double y = gemNenner/b.getB()*b.getA();
                    return new Number(x-y,gemNenner);
                    
                    
                    },
                    (a, b) -> {
                    
                    return new Number(a.getA()*b.getA(),b.getB()*a.getB());
                    
                    },
                    (a, b) -> {
                    
                    return new Number(a.getA()/b.getA(),b.getB()/a.getB());
                    
                    
                    });
                    
                    AbstractCalculator vectorCalculator = new VectorCalculator(
                    (a, b) -> {
                    
                    return new Number(a.getA()+b.getB(),b.getA()+b.getB());
                    
                    },
                    (a, b) -> {
                    
                    
                    return new Number(a.getA()+-b.getB(),b.getA()-b.getB());
                    
                    
                    },
                    (a, b) -> {
                    
                    return new Number(a.getA()*b.getA()+a.getB()*b.getB(),0);
                    
                    },
                    (a, b) -> {
                        
                        
                    
                    return new Number(a.getA()/b.getA(),0);
                    
                    
                    });
                    
                    AbstractCalculator complexCalculator = new ComplexCalculator(
                    (a, b) -> {
                    
                    return new Number(a.getA()+b.getB(),b.getA()+b.getB());
                    
                    },
                    (a, b) -> {
                    
                    
                    return new Number(a.getA()+-b.getB(),b.getA()-b.getB());
                    
                    
                    },
                    (a, b) -> {
                        
                        
                    
                    return new Number(a.getA()*b.getA()+a.getB()*b.getB(),0);
                    
                    },
                    (a, b) -> {
                        
                        
                    
                    return new Number(a.getA()/b.getA(),0);
                    
                    
                    });
                    
                     
                    while(istrue1)
                    {
                    
                        
                        
                    
                    }
                    
                    
                    
                    
                    
                    
                    break;
                case 3:
                    System.exit(0);
                    break;

            }
        }

    }}
