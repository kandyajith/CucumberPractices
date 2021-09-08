package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AmazonHooks
{

    @Before
    public void setup()
    {
        System.out.println("Launch Amazon application");
    }
    @After
    public  void teardown()
    {
        System.out.println("Close the browser");
    }
}
