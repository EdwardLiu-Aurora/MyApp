import java.beans.Transient;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class UserInterface {
    public static void mainTest(String args[]) {
        int number = 0;
        int range = 0;
        String exercise = null;
        String answer = null;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-n")) number = Integer.valueOf(args[++i]);
            if (args[i].equals("-r")) range = Integer.valueOf(args[++i]);
            if (args[i].equals("-e")) exercise = args[++i];
            if (args[i].equals("-a")) answer = args[++i];
        }
        if (number > 0 && range > 1) {
            ExerciseGenerator exGen = new ExerciseGenerator(range, number);
            HashMap<String, String> result = exGen.generateExp();
            File exerciseFile = new File("Exercises.txt");
            File answerFile = new File("Answers.txt");
            FileWriter exerciseFileFW = null;
            FileWriter answerFileFW = null;
            try {
                exerciseFileFW = new FileWriter(exerciseFile);
                answerFileFW = new FileWriter(answerFile);
                if (result != null) {
                    int i = 1;
                    for (Map.Entry<String, String> entry : result.entrySet()) {
                        exerciseFileFW.append(i + ". " + entry.getKey() + "\r\n");
                        answerFileFW.append(i + ". " + entry.getValue() + "\r\n");
                        i++;
                        exerciseFileFW.flush();
                        answerFileFW.flush();
                    }
                    System.out.println("完成出题。");
                } else {
                    System.out.println("请减小出题数量或者增大数值范围。");
                }
            } catch (IOException e) {
                System.out.println("请检查该目录是否可写。");
            }
        }
        if (exercise != null && answer != null) {
            StringBuilder correct = new StringBuilder("");
            StringBuilder wrong = new StringBuilder("");
            int correctInt = 0;
            int wrongInt = 0;
            File exercises = new File(exercise);
            File answers = new File(answer);
            File grades = new File("Grade.txt");
            BufferedReader exercisesReader = null;
            BufferedReader answersReader = null;
            String e = null;
            String a = null;
            String t = null;
            try {
                exercisesReader = new BufferedReader(new FileReader(exercises));
                answersReader = new BufferedReader(new FileReader(answers));
                while((e=exercisesReader.readLine())!=null){
                    a = answersReader.readLine();
                    t = e.substring(0, e.indexOf("."));
                    if(Fraction.calculateStringExp(e.substring(e.indexOf(" ") + 1))
                            .toString()
                            .equals(a.substring(a.indexOf(" ") + 1))) {
                        correct.append(t).append(",");
                        correctInt++;
                    }
                    else {
                        wrong.append(t).append(",");
                        wrongInt++;
                    }
                }
                if(correct.length()>0) correct.deleteCharAt(correct.length()-1);
                if(wrong.length()>0) wrong.deleteCharAt(wrong.length()-1);
                FileWriter gradesFW = new FileWriter(grades);
                gradesFW.append("Correct: ");
                gradesFW.append(correctInt + "(");
                gradesFW.append(correct.toString() + ")");
                gradesFW.append("\r\n");
                gradesFW.flush();
                gradesFW.append("Wrong: ");
                gradesFW.append(wrongInt + "(");
                gradesFW.append(wrong.toString() + ")");
                gradesFW.append("\r\n");
                gradesFW.flush();
            }
            catch(Exception ex){
                System.out.println("批改程序出错，请检查输入的文件名是否正确。");
            }
            System.out.println("完成批改。");
        }
    }
}