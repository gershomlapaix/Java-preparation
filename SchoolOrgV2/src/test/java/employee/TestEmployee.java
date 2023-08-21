package employee;

import org.example.employee.EmployeeBusinessLogic;
import org.example.employee.EmployeeDetails;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEmployee {
    EmployeeDetails employeeDetails = new EmployeeDetails();
    EmployeeBusinessLogic empBusinessLogic = new EmployeeBusinessLogic();


//    Test to check an appraisal

    @Ignore       // this makes the following test method not executed at all
    @Test
    public void testCalculateAppraisal(){
        employeeDetails.setAge(43);
        employeeDetails.setName("Kareem");
        employeeDetails.setMonthlySalary(15000);


        double appraisal = empBusinessLogic.calculateAppraisal(employeeDetails);
        assertEquals(1000, appraisal, 0.0);
    }

    // test to check yearly salary

    //execute before test
    @Before
    public void before() {
        System.out.println("I must be executed before the following test method");
    }
    @Test
    public void testCalculateYearlySalary() {
        employeeDetails.setName("Mario");
        employeeDetails.setAge(25);
        employeeDetails.setMonthlySalary(8000);

        double salary = empBusinessLogic.calculateYearlySalary(employeeDetails);
        assertEquals(96000, salary, 0.0);
    }

    @After
    public void after(){
        System.out.println("Done testing");
    }
}
