package org.ron.intro;

/**
 * A class to say Hello
 */
public class HelloWorld {

    /**
     * some info about the main() method
     *
     * @param args - passed in from the command line
     */
    public static void main(String[] args) {
        int i = 55;  // comment
        System.out.println("Hello C242");
        i++;
        System.out.println("Good Day C242");
        i += 5;
        System.out.println("Bye C242");
        /*
         multi line comment
         */

        StaticsIntro si = new StaticsIntro();
        si.c4 = 'X';
    }
}
