package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BrowserDriver {

    @Before
    public void initialize(){
        setup();
    }

    @After
    public void closed(){
        close();
    }
}
