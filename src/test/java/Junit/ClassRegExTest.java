package Junit;

import JUnit.ClassRefEx;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClassRegExTest {

        @Test
        public void firstnameTest() {
            ClassRefEx ur = new ClassRefEx();
            boolean result = ur.firstname("Rupali");
            Assertions Assert = null;
            Assert.assertEquals(result, true);
        }
    @Test
    public void lastnameTest() {
        ClassRefEx ur = new ClassRefEx();
        boolean result = ur.firstname("Anap");
        Assertions Assert = null;
        Assert.assertEquals(result, true);
    }
    public void email() {
        ClassRefEx ur = new ClassRefEx();
        boolean result = ur.email("rupali@bl.co.in");
        Assertions Assert = null;
        Assert.assertEquals(result, true);
    }

}

