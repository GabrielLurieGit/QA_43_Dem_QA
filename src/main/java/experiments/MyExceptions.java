package experiments;

public class MyExceptions {

    public static void main(String[] args) {
method1();
uncheckedException(10,0);
    }


    public static void method1(){
        try {
            pauseThread();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void pauseThread() throws InterruptedException {
            Thread.sleep(3000);

    }

    public static void uncheckedException(int a,int b){
        int res = 0;
        try {
            res = a/b;
            System.out.println(res);
        }catch (ArithmeticException e){
            res = 1;
            System.out.println(res);
        }


    }
}
