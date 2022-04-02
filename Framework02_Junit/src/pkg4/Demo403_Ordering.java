package pkg4;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;

// Junit way to order @Test method execution
// alphabetical ascending order only
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Demo403_Ordering {

    @Test
    public void test2Update() {
        System.out.println("second");
    }

    @Test
    public void test1Create() {
        System.out.println("first");
    }


}