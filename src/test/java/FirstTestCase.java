import org.junit.jupiter.api.*;

public class FirstTestCase {

    @Test
    @Tag("MyFirstTest")
    public void firstTestCase(){
        System.out.println("FirstTest");
    }

    @Test
    @Tag("MySecondTestcase")
    public void secondTestCase(){
        System.out.println("SecondTest");
    }
}
