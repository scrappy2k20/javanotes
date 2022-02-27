package datatypevariable;

public class Constants {

    public static void main(String[] args) {
        // var that let's data update
        String currentTest = "SmokeTest";
        System.out.println( currentTest );

        currentTest = "RegressionTest";
        System.out.println( currentTest );

        // var that won't let you update the data
        final String PASSWORD = "Test123!";
        // PASSWORD = "Alpha123!";

        final String USERNAME;  // empty
        USERNAME = "AlphaleafDemo1";
        // USERNAME = "UserNumber1";

        System.out.println( currentTest );
        System.out.println(  PASSWORD   );
    }
}
