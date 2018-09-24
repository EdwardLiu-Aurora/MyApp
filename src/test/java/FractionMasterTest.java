import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses(value={
        FractionArithmeticTest.class,
        FractionConstructorTest.class,
        FractionS2FTest.class})
public class FractionMasterTest {
}
