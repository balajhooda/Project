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
public class UnoTest {
    
    public UnoTest() {
    }

    /**
     * Test of main method, of class Uno.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Uno.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playTurn method, of class Uno.
     */
    @Test
    public void testPlayTurn() {
        System.out.println("playTurn");
        int player = 0;
        Uno instance = new Uno();
        instance.playTurn(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
