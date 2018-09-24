import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses(value={
        FractionMasterTest.class,
        ExerciseGeneratorTest.class,
        UserInterfaceTest.class})
public class MyAppMasterTest {
}
