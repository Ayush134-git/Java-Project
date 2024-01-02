package Basic_Question;

public class Statickeyword {

        static int staticVariable = 5;
        static void staticMethod() {
            System.out.println("Static method: " + staticVariable);
        }

        int instanceVariable;
        void instanceMethod() {
            System.out.println("Instance method: " + instanceVariable);
        }

        public static void main(String[] args) {

            System.out.println("Static Variable: " + Statickeyword.staticVariable);
            Statickeyword.staticMethod();

            Statickeyword instance = new Statickeyword();

            instance.instanceVariable = 10;

            System.out.println("Instance Variable: " + instance.instanceVariable);
            instance.instanceMethod();
        }
    }


