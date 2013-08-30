/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package checktri;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IC
 */
public class CheckTriTest {
    
    public CheckTriTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkTriType method, of class CheckTri.
     */
    @Test
    public void testCheckTriType() {
        System.out.println("checkTriType");
        int p = 0;
        int q = 0;
        String expResult = "";
        String result = CheckTri.checkTriType(p, q);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}