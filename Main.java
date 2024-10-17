// This is a simple Java program.

//class HelloWorld {
//    // Your program begins with a call to main().
//    // Prints "Hello, World" to the terminal window.
//    public static void main(String args[])
//    {
//        System.out.println("Hello, World!");
//    }
//}

public class Main {
    /**
     * blablabla
     */
    public static void main(String[] args) {
        System.out.println("exercitiul 3");
        boolean yes = true;
        boolean no = false;
        int loVal = -999;
        int hiVal = 999;
        double grade = 87.5;
        double amount = 50.0;
        String hello = "world";
        System.out.println("1. yes == no || grade > amount: " + (yes == no || grade > amount));
        System.out.println("2. amount == 40.0 || 50.0: " + (amount == 40.0 || amount == 50.0));
        System.out.println("3. hiVal != loVal && loVal > 0: " + (hiVal != loVal && loVal > 0));
        System.out.println("4. true || hello.length() > 0: " + (true || hello.length() > 0));
        System.out.println("5. hello.isEmpty() || yes: " + (hello.isEmpty() || yes));
        System.out.println("6. grade <= 100 && false: " + (grade <= 100 && false));
        System.out.println("7. !yes || no: " + (!yes || no));
        System.out.println("8. grade > 75 && amount != hiVal && amount >= loVal: " + (grade > 75 && amount != hiVal && amount >= loVal));
        System.out.println("9. no && !no || yes && !yes: " + (no && !no || yes && !yes));

        System.out.println("exercitiul 4");
        float a = 100.25f;
        long b = (long)a;
        System.out.println("value of a: " + a);
        System.out.println("value of b: " + b);

        int c = (int)b;
        System.out.println("value of c: " + c);

        byte d = (byte)c;
        System.out.println("value of d: " + d);


        System.out.println("exercitiul 5");
        int a2 = 5;
        System.out.println(a2 + -a2 - a2++ % 10);
        System.out.println(a2 - a2 + --a2 / 10);
        for (int i2 = 2; i2 < 5; ) {
            i2++;
            a2 += a2;
        }
        System.out.println("a2 = " + a2);


    }


}
