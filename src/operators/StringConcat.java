package operators;

import org.junit.Test;

public class StringConcat {

    @Test
    public void stringConcatDemo() {

        String firstName = "Zachary";
        String middleName = "Richard";
        String middleName2 = "Douglas";
        String lastName = "Rhoades";
        System.out.println("Hello my name is " + firstName + " " + lastName);

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        String fullerName = firstName + " " + middleName + " " +  middleName2 + " " + lastName + "!";
        System.out.println(fullerName);

    }
}
