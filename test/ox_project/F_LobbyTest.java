/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ox_project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author firstx
 */
public class F_LobbyTest {
    

    /**
     * Test of isFull method, of class F_Lobby.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        F_Lobby lobby = new F_Lobby();
        boolean result = lobby.isFull(0);
        assertEquals(false, result);
        result = lobby.isFull(1);
        assertEquals(false, result);
        result = lobby.isFull(2);
        assertEquals(true, result);
    }
    @Test
    public void testSignout(){
        System.out.println("Signout");
        F_Lobby lobby = new F_Lobby();
        boolean result = lobby.Signout("yes");
        assertEquals(true, result);
        result = lobby.Signout("no");
        assertEquals(false, result);
        

    }
    
}
