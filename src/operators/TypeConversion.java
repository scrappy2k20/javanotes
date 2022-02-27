package operators;

import org.junit.Test;

public class TypeConversion {

    @Test
    public void implicitTypeConversionDemo() {
        // int ---> double
        int count = 10;  // count = 10
        double box = count; // count = 10.0
        System.out.println(box);

        // double ---> int
        double pi = 3.14;
        //int circle = pi;  // possible data loss

        // char ---> int
        // char ---> double
        char grade = 'F';
        int num = grade;
        double num2 = grade;
        System.out.println(num);
        System.out.println(num2);

        // int ---> char
        // double ---> char
        int a = 35;
        double b = 35.0;
        //char symbol = a;  // possible data loss

        //char ---> String
        //String ---> char
        char mathGrade = 'B';
        String engGrade = "A";
        // String hisGrade = mathGrade;  // incompatible data type
        // char hergrade = engGrade;  // incompatible data type

        // int ---> String
        // double ---> String
        int number1 = 190;
        double number2 = 190.09;
        // String value = number1;  // incompatible data type
        // String value2 = number2;  // incompatible data type



    }

    @Test
    public void explicitTypeConversionDemo() {

        // double ---> int
        double num = 10.90;
        int val = (int)10.90;  // explicit type conversion
        System.out.println(val);

     // int ---> char
        int a = 36;
        double b = 37.089;
        char ret = (char)a;  // explicit type conversion
        char ret2 = (char)b;
        System.out.println(ret);
        System.out.println(ret2);

        // int ---> String
        // char ---> String
        // double ---> String
        // boolean ---> String
        int numA = 1990;
        String var1 = String.valueOf(1990);  // "1990"
        String var2 = String.valueOf(98.923);  // "98.923"
        String var3 = String.valueOf('C');  // "C"
        String var4 = String.valueOf(true);  // "true"

        System.out.println(var4);

    }

    @Test
    public void typeConversionUsage () {
        double number = Math.random();  // 0.0 ~ 0.9999
        // System.out.println(number);

        // 0.0 ~ 0.9999
        double rand = Math.random() * 10;
        // System.out.println(rand);


        // 0.00 ~ 99.00
        // 0 ~ 99
        double randAge = (Math.random() * 100);  // 0 ~ 99
        int randAgeInt = (int)randAge;  // explicit type conversion
        System.out.println(randAgeInt);
    }

}
