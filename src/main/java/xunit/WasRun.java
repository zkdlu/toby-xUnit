package xunit;

public class WasRun extends TestCase {
    public String log;

    @Override
    public void setUp() {
        this.log = "setUp";
    }

    @Override
    public void tearDown() {
        this.log += " tearDown";
    }

    public WasRun(String name) {
        super(name);
    }

    public void testMethod() {
        log += " testMethod";
    }
}
