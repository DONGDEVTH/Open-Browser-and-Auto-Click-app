import java.awt.*;
import java.awt.event.*;
import java.net.URI;
import java.util.Scanner;

public class ap {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int click = 1;
        int num ;
        num = input.nextInt();
//        int i = 0 ;
        do {
            System.out.println(click);

            Desktop d = Desktop.getDesktop();
            try {
                d.browse(new URI("https://www.google.com"));

            } catch (Exception e) {
                e.printStackTrace();
            }

            Robot bot = null;
            try {
                bot = new Robot();
            } catch (Exception failed) {
                System.err.println("Failed instantiating Robot: " + failed);
            }
            bot.delay(4000);
            int mask = InputEvent.BUTTON1_DOWN_MASK;
//            bot.mouseMove(319, 746);
//            bot.mousePress(mask);
//            bot.mouseRelease(mask);
//            bot.delay(3000);

            bot.mouseMove(72, 371);
            bot.mousePress(mask);
            bot.mouseRelease(mask);
            bot.delay(2000);

            bot.mouseMove(72, 409);
            bot.mousePress(mask);
            bot.mouseRelease(mask);
            bot.delay(3000);

            bot.mouseMove(1262, 51);
            bot.mousePress(mask);
            bot.mouseRelease(mask);
            bot.delay(3000);

            bot.mouseMove(1343, 10);
            bot.mousePress(mask);
            bot.mouseRelease(mask);
            bot.delay(3000);

//        int clicks = 10 ;
            click++;
        }while(click <=num);


            return  ;
        }
//        System.out.println("AutoClicker complete.");
//        return  ;
    }





