import org.junit.Test;

import static org.junit.Assert.*;

public class UsingAssert {

    @Test
    public void testAdd(){
        int num = 5;
        String temp = null;
        String str = "working on stuffs.";


//        check for equality
        assertEquals("working on stuffs.", str);

//        check for false condition
        assertFalse(num > 6);

//        check for null value
        assertNotNull(temp);    // this will fail
    }
}
