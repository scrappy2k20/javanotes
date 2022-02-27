package stringoperation;

import org.junit.Test;

import java.sql.SQLOutput;
import java.util.Locale;

public class StringConcat {

    @Test
    public void concatDemo() {
        String output = "Test score: " + 90;
        String actual = "Test score: 90";

        System.out.println(output);
        System.out.println(actual);
    }

    @Test
    public void concatUsage1() {
        boolean result = false;

        String testResultOutput = "Test Success: " + result;
        System.out.println(testResultOutput);
    }

    @Test
    public void concatUsage2() {
        String testName = "Regression";
        int totalNum = 60;
        int passed = 30;
        int skipped = 10;
        int failed = 20;

        String output = "Test Executed   : " + testName + "\n"
                      + "Total testcases : " + totalNum + "\n"
                      + "Total passed    : " + passed   + "\n"
                      + "Total skipped   : " + skipped  + "\n"
                      + "Total failed    : " + failed   + "\n";

        System.out.println(output.toUpperCase());
    }
}
