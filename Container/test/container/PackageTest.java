/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;


/**
 *
 * @author dany
 */
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
public class PackageTest extends TestCase {

 public PackageTest(String testName) {
 super(testName);
 }

    public static Test suite() {
        TestSuite suite = new TestSuite(PackageTest.class);
        return suite;
    }
 /**
 * Test of getVolume method, of class Package.
 */
 public void testGetVolume() {
 System.out.println("getVolume");
 Package instance = new Package(1.0);
 double expResult = 1.0;
 double result = instance.getVolume();
 assertEquals(expResult, result);
 }
}

