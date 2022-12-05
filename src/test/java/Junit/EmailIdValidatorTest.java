package Junit;


import JUnit.EmailId;
//import com.beust.jcommander.Parameterized;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;




import java.util.Arrays;


public class EmailIdValidatorTest {


    @RunWith(Parameterized.class)
    public static class EmailIdValidationTest {
        private String emailId;

        public EmailIdValidationTest(String emailId, boolean expected) {
            this.emailId = emailId;

        }

        @Parameters
        public static Iterable<Object[]> data() {
            return Arrays.asList(new Object[][]{
                            {"rupali@testdomain.com", true},
                            {"rupali.deore@testdomain.com", true},
                            {"rupali@deoredomain.com", true},
                            {"rupali@deoredomaincom", false},
                            {"rup-deore@testdomain", false},
                            {"testdomain.com", false}
                    }
            );
        }

        @Test
        public void testIsValidEmailId() throws Exception {
            boolean actual= EmailId.isValid(emailId);

        }
    }
}
