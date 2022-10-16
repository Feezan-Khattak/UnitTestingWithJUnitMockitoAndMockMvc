package com.greedycode.unittesting.demoUtils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;

import static org.junit.jupiter.api.Assertions.*;

class ObjectOperationTest {

    @Test
    @DisplayName("Given the object from the client and check if it is null or not")
    public void checkTheObjectNull(){
        // setup
        ObjectOperation operation = new ObjectOperation();
        String str1 = null;
        String str2 = "greedyCode";

        // execute and assert
        assertNull(operation.checkNull(str1), "object must be null");
        assertNotNull(operation.checkNull(str2), "Object must not be null");
    }

}