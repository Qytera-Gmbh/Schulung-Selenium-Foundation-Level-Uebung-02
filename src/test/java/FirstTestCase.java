import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

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
