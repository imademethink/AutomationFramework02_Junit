import org.junit.Test;

import java.util.ArrayList;

public class Demo01 {

    @Test
    public void Demo01Scenario1(){
        System.out.println("Demo01Scenario1");
    }

    // with timeout parameter

    @Test(timeout=1500l) // 1500 milli sec
    public void Demo01Scenario2(){
        System.out.println("Demo01Scenario2");
        while(true);
    }

    // with expected parameter

    @Test(expected=IndexOutOfBoundsException.class)
    public void Demo01Scenario3() {
        System.out.println("Demo01Scenario3");
        new ArrayList<Object>().get(1);
    }
}

// Create simple Java project
// Add Junit jar 4.13 dependency
// https://mvnrepository.com/artifact/junit/junit/4.13-beta-2
// Create above class

// Start using @Test annotation
// Annotation is form of syntactic metadata or additional information
// that can be added to Java source code
// Metadata/ annotation/ tag can be added to a class or method
// e.g. @Override, @Deprecated, @SuppressWarnings

// What is @Test annotation
// The @Test annotation tells JUnit that the public void method e.g. Demo01Scenario1
// to which it is attached can be run as a test case.
// To run the method, JUnit first constructs a fresh instance of the class then invokes the annotated method.
// How to Run this class without main method ?
// Intellij or Eclipse comes up with a plugin to run Junit tests
// "C:\Program Files\Java\jdk1.8.0_211\bin\java.exe" -ea -Didea.test.cyclic.buffer.size=2097152 "... " com.intellij.rt.execution.junit.JUnitStarter -ideVersion5 -junit4 Demo01

// @Test methods should not be private or static.
// @Test methods should return void only.
