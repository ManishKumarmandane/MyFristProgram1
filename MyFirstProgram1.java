package Javaconcepts;

class Outer_Demo
{
    private int num = 175;// private variable of the outer class
    class Inner_Demo { //inner class
        public int getNum() {
            System.out.println("This is the getnum method of the inner class:");
            return num;
        }
    }
}
public class MyFirstProgram1
{
        public static void main(String[] args) {
            int y = 1, r = 7 ;
            char w = 'u';
            String i = "haridham9";
            String u = "manish";
            System.out.println("my first ");
            System.out.println("my fid");
            System.out.println("haridham avd");
            Outer_Demo outer = new Outer_Demo();
            // Instantiating the inner class
            do {
                System.out.println("sd");
            }
            while (r >=10);
            {
               System.out.println(r++);
            }
            {
                for (y = 1; y <= 2; y++)
                {
                    System.out.println(y);
                    System.out.println(u);
                    System.out.println(i);
                    String s = String.valueOf(w);
                    System.out.println("String is: " + s);
                    System.out.println("null");
                    System.out.println("git");
                    Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();
                    System.out.println(inner.getNum());
                }
            }

        }

        }
