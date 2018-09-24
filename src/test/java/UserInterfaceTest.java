import org.junit.Test;

public class UserInterfaceTest {
    @Test
    public void mainTest(){
        UserInterface.mainTest(new String[] {"-r","2","-n","2000"});
        UserInterface.mainTest(new String[] {"-r","1","-n","1"});
        UserInterface.mainTest(new String[] {"-r","10","-n","1000"});
        UserInterface.mainTest(new String[] {"-e","Exercise.txt","-a","Answer.txt"});
        UserInterface.mainTest(new String[] {"-e","ExercisesF.txt","-a","AnswersF.txt"});
    }
}
