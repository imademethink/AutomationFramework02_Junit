package pkg4;
import org.junit.Ignore;
import org.junit.Test;

// ignore annotation
public class Demo404_Ignore {
    @Test
    public void test2Update() {
        System.out.println("second");
    }
        
    @Ignore
    @Test
    public void test1Create() {
        System.out.println("first");
    }
}


// Few observations overall Junit
// can't set priority to test case
// can't set test case sequencing
// can't set test dependency on other @Test

