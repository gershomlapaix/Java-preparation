// basic testing example
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

import static org.junit.Assert.assertEquals;


public class BasicTesting {
    @Test
    public void testAdd(){
        String str = "Junit is working fine.";
        assertEquals("Junit is working fine.",str);
    }
}

// using testsuite: for combining multiple classes on which perform testing
@RunWith(Suite.class)
@Suite.SuiteClasses({TestJunit1.class, TestJunit2.class})

class JunitTestSuite{}

// classes on which to perform test
class TestJunit1{
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage(){
        System.out.println("Inside testPrintMessage()");
        assertEquals(message, messageUtil.printMessage());
    }
}

 class TestJunit2 {

    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertEquals(message,messageUtil.salutationMessage());
    }
}

//Messageutil classes
class MessageUtil{
    private String message;

//    constructor
    public MessageUtil(String message){
        this.message = message;
    }

//    for printing the message
    public String printMessage(){
        System.out.println(message);
        return message;
    }

    public String salutationMessage(){
        message = "Hi!" + message;
        System.out.println(message);
        return message;
    }
}

// Test runner: it is used for executing the test cases
class TestRunner{
    public static void main(String args[]){
        Result result = JUnitCore.runClasses(TestJunit1.class, TestJunit2.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
