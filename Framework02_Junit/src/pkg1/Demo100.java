package pkg1;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

// @RunWith
// It specifies a group of many test classes to run along with the class where it is used.
// When a class is annotated with @RunWith or extends a class annotated with @RunWith,
// JUnit will invoke the class it references to run the tests in that class instead
// of the runner built into JUnit.

@RunWith(Suite.class)

// @Suite is a standard runner that allows you to manually build a suite containing tests
// from many classes.
@Suite.SuiteClasses({
        Demo01.class,
        Demo02.class
})

// Running multiple Junit annotated classes
public class Demo100 {

}
