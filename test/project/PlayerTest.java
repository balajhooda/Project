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
public class PlayerTest {
    
    public PlayerTest() {
    }

    /**
     * Test of getPlayerID method, of class Player.
     */
    @Test
    public void testGetPlayerID() {
        System.out.println("getPlayerID");
        Player instance = null;
        String expResult = "";
        String result = instance.getPlayerID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPlayerID method, of class Player.
     */
    @Test
    public void testSetPlayerID() {
        System.out.println("setPlayerID");
        String givenID = "";
        Player instance = null;
        instance.setPlayerID(givenID);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of play method, of class Player.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        Player instance = null;
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
    }

    public class PlayerImpl extends Player {

        public PlayerImpl() {
            super("");
        }

        public void play() {
        }
    }
    
}
