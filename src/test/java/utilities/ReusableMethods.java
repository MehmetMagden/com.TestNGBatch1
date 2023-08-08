package utilities;

public class ReusableMethods {

    public static void waitfor(int sec){


        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {

        }

    }
}
