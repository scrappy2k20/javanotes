package consoleoutput;

public class ConsoleOutputPractice {

    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println(" T E S T S ");
        System.out.println("-----------------------------------");
        System.out.println("\n\n");
        System.out.println("TEST TYPE:\tSMOKE\t==============");
        System.out.println("TEST ENVI:\tStaging\t===============");

        System.out.println("===================================");

        pause();
        System.out.print("10%\r");
        pause();
        System.out.print("20%\r");
        pause();
        System.out.print("30%\r");
        pause();
        System.out.print("40%\r");
        pause();
        System.out.print("50%\r");
        pause();
        System.out.print("60%\r");
        pause();
        System.out.print("70%\r");
        pause();
        System.out.print("80%\r");
        pause();
        System.out.print("90%\r");
        pause();
        System.out.print("100%");

    }

    public static void pause() {
        try{
            Thread.sleep(500);
        }catch (InterruptedException e) {

        }
    }


}
