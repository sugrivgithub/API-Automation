package org.testing.trigger;

import java.io.IOException;

import org.testing.testScripts.TC01_PostRequest;
import org.testing.testScripts.TC02_GetAllMethod;

public class RUNNER {

    public static void main(String[] args) throws IOException {
        // Create instances of test scripts
        TC01_PostRequest tc1 = new TC01_PostRequest();
        TC02_GetAllMethod tc2 = new TC02_GetAllMethod();

        // Execute test cases
        tc1.executeTest();
        tc2.executeTest();
    }
}