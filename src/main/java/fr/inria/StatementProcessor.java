package fr.inria;

import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtStatement;

/**
 * User: Simon
 * Date: 5/29/13
 * Time: 6:00 PM
 */
public class StatementProcessor extends AbstractProcessor<CtStatement> {
    int i = 0;


    public void process(CtStatement element) {
        i++;
        System.out.println("Statement: "+ i);
        System.out.println(element);
        System.out.println("-----------------------------------");
    }
}
