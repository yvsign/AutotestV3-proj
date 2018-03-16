package CreatingEntities;


import loginTests.ValidLogin;
import org.junit.Test;
import parentTest.ParentTest;

public class CreateWorker extends ParentTest {

    public CreateWorker(String browser) {

        super(browser);
    }

        @Test

        public void createWorker(){
        try {
            loginPage.loginUser("Student", "909090");
            log.info("login success");
            staff.openSlovariWorkers();
            log.info("SlovariWorkers was opened");

            staff.createWorker("Грозный", "Иван", "Васильевич", "08888899");
        }
        catch (Exception e){
            System.out.println("Exception is " + e);
        }
        }
    }

