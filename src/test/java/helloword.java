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

//    // �����˷����׳�NullPointerException�쳣
//    @Test(expected = NullPointerException.class)
//    public void testException() {
//        System.out.println("Test exception");
//        Object obj = null;
//        obj.toString();
//    }

//    // ���Դ˲��Է���
//    @Ignore
//    @Test
//    public void testMathMax() {
//        Assert.fail("û��ʵ��");
//    }
//    // ʹ�á����衱�����Բ��Է���
//    @Test
//    public void testAssume(){
//        System.out.println("Test assume");
//        // ������ʧ��ʱ�����ֹͣ���У����Ⲣ������ζ���Է���ʧ�ܡ�
//        Assume.assumeTrue(false);
//        Assert.fail("û��ʵ��");
//    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Tear down");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("Tear down After class");
    }

}
