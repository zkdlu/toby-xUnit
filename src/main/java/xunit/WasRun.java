package xunit;

public class WasRun extends TestCase {
    public boolean wasRun;
    public boolean wasSetUp;
    public String log;

    @Override
    public void setUp() {
        this.wasSetUp = true;
        this.log = "setUp";
    }

    public WasRun(String name) {
        super(name);
    }

    public void testMethod() {
        wasRun = true;
        log += " testMethod";
    }
}
