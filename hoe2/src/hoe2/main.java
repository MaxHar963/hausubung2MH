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

        main ma = new main();

        boolean istrue = true;
        boolean istrue1 = true;

        Scanner in = new Scanner(System.in);

        AbstractCalculator relationalCalculator = new RationalCalculator(
                (a, b) -> {

                    double gemNenner = a.getB() * b.getB();

                    double x = gemNenner / a.getB() * a.getA();
                    double y = gemNenner / b.getB() * b.getA();
                    return new MyNumber(x + y, gemNenner);

                },
                (a, b) -> {

                    double gemNenner = a.getB() * b.getB();

                    double x = gemNenner / a.getB() * a.getA();
                    double y = gemNenner / b.getB() * b.getA();
                    return new MyNumber(x - y, gemNenner);

                },
                (a, b) -> {

                    return new MyNumber(a.getA() * b.getA(), b.getB() * a.getB());

                },
                (a, b) -> {

                    return new MyNumber(a.getA() / b.getA(), b.getB() / a.getB());

                });

        AbstractCalculator vectorCalculator = new VectorCalculator(
                (a, b) -> {

                    return new MyNumber(a.getA() + b.getB(), b.getA() + b.getB());

                },
                (a, b) -> {

                    return new MyNumber(a.getA() + -b.getB(), b.getA() - b.getB());

                },
                (a, b) -> {

                    return new MyNumber(a.getA() * b.getA() + a.getB() * b.getB(), 0);

                },
                (a, b) -> {

                    return new MyNumber(a.getA() / b.getA(), 0);

                });

        AbstractCalculator complexCalculator = new ComplexCalculator(
                (a, b) -> {

                    return new MyNumber(a.getA() + b.getB(), b.getA() + b.getB());

                },
                (a, b) -> {

                    return new MyNumber(a.getA() + -b.getB(), b.getA() - b.getB());

                },
                (a, b) -> {

                    return new MyNumber(a.getA() * b.getA() + a.getB() * b.getB(), 0);

                },
                (a, b) -> {

                    return new MyNumber(a.getA() / b.getA(), 0);

                });
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

                        String x = n + "";
                        return x.equals(new StringBuilder(x).reverse().toString());

                    };

                    n1.setOddEvenTester(isEven);
                    n1.setPrimeTester(isPrime);
                    n1.setPalindromeTester(isPalindorme);

                    List<String> list = n1.testFile(n1.readFile());

                    list.forEach((String s) -> System.out.println(s));

                    break;

                case 2:

                    while (istrue1) {

                        System.out.println("Choose calculator: ");
                        System.out.println("1 - Retional Calculator");
                        System.out.println("2 - Vector Calculator");
                        System.out.println("3 - Complex Calculator");
                        System.out.println("4 - Exit program");

                        int eingabe1 = Integer.parseInt(in.nextLine());
                        boolean istrue3 = true;
                        ArrayList<Integer> inputList;
                        switch (eingabe1) {

                            case 1:

                                while (istrue3) {
                                    inputList = (ArrayList<Integer>) ma.inputNumbers();

                                    ma.printChOP();
                                    int eingabe2 = Integer.parseInt(in.nextLine());
                                    MyNumber erg;
                                    switch (eingabe2) {

                                        case 1:
                                            istrue3 = false;
                                            erg = relationalCalculator.add.calc(new MyNumber(inputList.get(1), inputList.get(2)), new MyNumber(inputList.get(3), inputList.get(4)));
                                            break;
                                        case 2:
                                            istrue3 = false;
                                            erg = relationalCalculator.add.calc(new MyNumber(inputList.get(1), inputList.get(2)), new MyNumber(inputList.get(3), inputList.get(4)));
                                            break;
                                        case 3:
                                            istrue3 = false;
                                            erg = relationalCalculator.add.calc(new MyNumber(inputList.get(1), inputList.get(2)), new MyNumber(inputList.get(3), inputList.get(4)));
                                            break;
                                        case 4:
                                            istrue3 = false;
                                            erg = relationalCalculator.add.calc(new MyNumber(inputList.get(1), inputList.get(2)), new MyNumber(inputList.get(3), inputList.get(4)));
                                            break;
                                        case 5:
                                            //case : Zahlen neu eingeben     
                                            break;

                                    }
                                }

                                break;
                            case 2:
                                while (istrue3) {
                                    inputList = (ArrayList<Integer>) ma.inputNumbers();

                                    ma.printChOP();
                                    int eingabe2 = Integer.parseInt(in.nextLine());
                                    MyNumber erg;
                                    switch (eingabe2) {

                                        case 1:
                                            istrue3 = false;
                                            erg = vectorCalculator.add.calc(new MyNumber(inputList.get(1), inputList.get(2)), new MyNumber(inputList.get(3), inputList.get(4)));
                                            break;
                                        case 2:
                                            istrue3 = false;
                                            erg = vectorCalculator.add.calc(new MyNumber(inputList.get(1), inputList.get(2)), new MyNumber(inputList.get(3), inputList.get(4)));
                                            break;
                                        case 3:
                                            istrue3 = false;
                                            erg = vectorCalculator.add.calc(new MyNumber(inputList.get(1), inputList.get(2)), new MyNumber(inputList.get(3), inputList.get(4)));
                                            break;
                                        case 4:
                                            istrue3 = false;
                                            erg = vectorCalculator.add.calc(new MyNumber(inputList.get(1), inputList.get(2)), new MyNumber(inputList.get(3), inputList.get(4)));
                                            break;
                                        case 5:
                                            //case : Zahlen neu eingeben
                                            break;

                                    }
                                }

                                break;
                            case 3:
                                while (istrue3) {
                                    inputList = (ArrayList<Integer>) ma.inputNumbers();

                                    ma.printChOP();
                                    int eingabe2 = Integer.parseInt(in.nextLine());
                                    MyNumber erg;
                                    switch (eingabe2) {

                                        case 1:
                                            istrue3 = false;
                                            erg = complexCalculator.add.calc(new MyNumber(inputList.get(1), inputList.get(2)), new MyNumber(inputList.get(3), inputList.get(4)));
                                            break;
                                        case 2:
                                            istrue3 = false;
                                              erg = complexCalculator.add.calc(new MyNumber(inputList.get(1), inputList.get(2)), new MyNumber(inputList.get(3), inputList.get(4)));
                                            break;
                                        case 3:
                                            istrue3 = false;
                                            erg = complexCalculator.add.calc(new MyNumber(inputList.get(1), inputList.get(2)), new MyNumber(inputList.get(3), inputList.get(4)));
                                            break;
                                        case 4:
                                            istrue3 = false;
                                            erg = complexCalculator.add.calc(new MyNumber(inputList.get(1), inputList.get(2)), new MyNumber(inputList.get(3), inputList.get(4)));
                                            break;
                                        case 5:
                                            //case : Zahlen neu eingeben
                                            break;

                                    }
                                }
                                break;
                            case 4:
                                while (istrue3) {
                                    inputList = (ArrayList<Integer>) ma.inputNumbers();

                                    ma.printChOP();
                                    int eingabe2 = Integer.parseInt(in.nextLine());
                                    MyNumber erg;
                                    switch (eingabe2) {

                                        case 1:
                                            istrue3 = false;
                                            erg = relationalCalculator.add.calc(new MyNumber(inputList.get(1), inputList.get(2)), new MyNumber(inputList.get(3), inputList.get(4)));
                                            break;
                                        case 2:
                                            istrue3 = false;
                                            erg = relationalCalculator.add.calc(new MyNumber(inputList.get(1), inputList.get(2)), new MyNumber(inputList.get(3), inputList.get(4)));
                                            break;
                                        case 3:
                                            istrue3 = false;
                                            erg = relationalCalculator.add.calc(new MyNumber(inputList.get(1), inputList.get(2)), new MyNumber(inputList.get(3), inputList.get(4)));
                                            break;
                                        case 4:
                                            istrue3 = false;
                                            erg = relationalCalculator.add.calc(new MyNumber(inputList.get(1), inputList.get(2)), new MyNumber(inputList.get(3), inputList.get(4)));
                                            break;
                                        case 5:
                                            //case : Zahlen neu eingeben

                                            break;

                                    }
                                }
                                break;

                        }
                    }

                    break;
                case 3:
                    System.exit(0);
                    break;

            }
        }

    }

    public void printChOP() {

        System.out.println("Choose operation: ");
        System.out.println("1 - add");
        System.out.println("2 - subtract");
        System.out.println("3 - multiply");
        System.out.println("4 - divide");
        System.out.println("5 - enter numbers again");

    }

    public List<Integer> inputNumbers() {
        Scanner in = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        System.out.println("Enter number x a> ");

        list.add(Integer.parseInt(in.nextLine()));

        System.out.println("Enter number x b> ");
        list.add(Integer.parseInt(in.nextLine()));

        System.out.println("Enter number y a> ");

        list.add(Integer.parseInt(in.nextLine()));

        System.out.println("Enter number y b> ");

        list.add(Integer.parseInt(in.nextLine()));

        return list;

    }

    public void outputNumbers(MyNumber n) {

        System.out.println("Solution: ");
        System.out.println("a = " + n.getA());
        System.out.println("a = " + n.getB());

    }

}
