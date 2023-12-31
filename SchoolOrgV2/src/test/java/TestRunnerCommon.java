import employee.TestEmployee;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunnerCommon {
    public static void main(String[] args){
//        Result result = JUnitCore.runClasses(UsingAssert.class);
        Result result = JUnitCore.runClasses(TestEmployee.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
