import org.junit.*;

/**
 * Created by q on 2016/3/16.
 */
public class helloword {
    public static void main(String args[])
    {
        System.out.println("Hello World");
    }
    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Set up before class");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Set up");
    }

    @Test
    public void testMathPow() {
        System.out.println("Test Math.pow");
        Assert.assertEquals(4.0, Math.pow(2.0, 2.0), 0.0);
    }

    @Test
    public void testMathMin() {
        System.out.println("Test Math.min");
        Assert.assertEquals(2.0, Math.min(2.0, 4.0), 0.0);
    }
//为什么

    @After
    public void tearDown() throws Exception {
        System.out.println("Tear down");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("Tear down After class");
    }

}
