/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoe2;

/**
 *
 * @author angeh
 */
public abstract class AbstractCalculator {

    protected CalculationOperation add;
    protected CalculationOperation subtract;
    protected CalculationOperation multiply;
    protected CalculationOperation divide;

    public AbstractCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        this.add = add;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
    }
    
    
    public abstract MyNumber add(MyNumber a, MyNumber b);
    public abstract MyNumber subtract(MyNumber a, MyNumber b);
    public abstract MyNumber multiply(MyNumber a, MyNumber b);
    public abstract MyNumber divide(MyNumber a, MyNumber b);
    
    
    public interface CalculationOperation {

        MyNumber calc(MyNumber x, MyNumber y);

    }

}
