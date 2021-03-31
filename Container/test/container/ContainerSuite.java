/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author dany
 */
public class ContainerSuite extends TestCase {
    
    public ContainerSuite(String testName) {
        super(testName);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("ContainerSuite");
        suite.addTest(new TestSuite(container.PackageTest.class));
        suite.addTest(new TestSuite(container.ContainerTest.class));
        suite.addTest(new TestSuite(container.MainTest.class));
        suite.addTest(new TestSuite(container.WarehouseTest.class));
        return suite;
    }
    
}
