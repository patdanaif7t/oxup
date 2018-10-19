/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ox_project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author firstx
 */
public class F_registerTest {
    
  


    /**
     * Test of isPasswordMatching method, of class F_register.
     */
    @Test
    public void testIsPasswordMatching() {
        
        F_register instance = new F_register();
        String txtPass = "111";
        String txtRePass = "111";
       
        assertEquals(true, instance.isPasswordMatching(txtPass, txtRePass));
        assertEquals(false, instance.isPasswordMatching(txtPass, "222"));
    }

   
    /**
     * Test of isFillAllFiled method, of class F_register.
     */
    @Test
    public void testIsFillAllFiled() {
        System.out.println("isFillAllFiled");
        String txtUsername = "";
        String txtPlayerName = "";
        String txtPassword = "";
        String txtConfirmPassword = "";
        F_register instance = new F_register();
        boolean expResult = false;
        boolean result = instance.isFillAllFiled(txtUsername, txtPlayerName, txtPassword, txtConfirmPassword);
        assertEquals(expResult, result);
        
        txtUsername = "asdf";
        txtPlayerName = "asdf";
        txtPassword = "asdf";
        txtConfirmPassword = "asdf";
        result = instance.isFillAllFiled(txtUsername, txtPlayerName, txtPassword, txtConfirmPassword);
        assertEquals(true, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

  

    /**
     * Test of checkUserPass method, of class F_register.
     */
    @Test
    public void testCheckUserPass() {
        System.out.println("checkUserPass");
        String txtUsername = "";
        String txtPassword = "";
        F_register instance = new F_register();
        boolean expResult = false;
        boolean result = instance.checkLengthIdPass(txtUsername, txtPassword);
        assertEquals(false, result);
        
        txtUsername = "12345678";
        txtPassword = "12345678";
        result = instance.checkLengthIdPass(txtUsername, txtPassword);
        assertEquals(true, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    
}
