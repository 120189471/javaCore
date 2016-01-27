package com.ditest4_5;

/**
 *
 * Raises the salary of an employee
 * @author Searis ji
 * @version 1.001
 * @since 1.001
 * @param  byPercent the percentage by which to raise the salary(e.g. 10means 10%)
 * @return the amount of the raise
 * @see <a href="www.horstmann.com/corejava.html">The Core Java home page</a>
 *
 */
public class javaDocTest2 {
    public  double raiseSalary(double byPercent){
        double raise =salary*byPercent/100;
        salary+=raise;
        return raise;
    }
}
