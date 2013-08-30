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
        //String expResult = "";
        //String result = CheckTri.checkTriType(p, q);
        //assertEquals(expResult, result);
        System.out.println("Let Test");
        int a[] = {5,6,4,0};
        int b[] = {5,6,5,5};
        int c[] = {5,5,6,0};
        
        String output[] = {"Equilateral Triangle","Isosceles Triangle","Scalene","Invalid"};
        
        for(int i=0; i <= output.length-1;i++){
            String result = CheckTri.checkTriType(a[i],b[i],c[i]);
            System.out.print("It is "+result);
            if (result == output[i]){
                System.out.println("-->> True");
            }
            else{
                System.out.println("-->> False");
            }
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}