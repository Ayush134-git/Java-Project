package Basic_Question;

public class FibonacciSeries {
    static int a=0, b=1,c;
    public static void main(String[] args) {

        
        // whit recursion
        System.out.print(a+ " "+b);
        FibonacciSeries fib = new FibonacciSeries();
        fib.printfib(10);

    }
    void printfib(int i){
        if (i >=1){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            printfib(i-1);
        }
    }
}
