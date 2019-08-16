/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author _sowill
 */
public class CardTest {
    
    public CardTest() {
    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToStringGood() {
        System.out.println("toString");
        Card instance = new CardImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testToStringBad() {
        System.out.println("toString");
        Card instance = new CardImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    public class CardImpl extends Card {

        public String toString() {
            return "";
        }
    }
    
}
