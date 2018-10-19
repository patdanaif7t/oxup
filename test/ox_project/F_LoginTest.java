/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ox_project;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author firstx
 */
public class F_LoginTest {


    /**
     * Test of isFill method, of class F_Login.
     */
    @Test
    public void testIsFill() {
        F_Login login = new F_Login();
        String id = "id";
        String pass = "pass";
        String idEmpty = "";
        String passEmpty = "";
        assertEquals(true, login.isFill(id, pass));
        assertEquals(false, login.isFill(idEmpty, passEmpty));
        
    }
      
    
}
