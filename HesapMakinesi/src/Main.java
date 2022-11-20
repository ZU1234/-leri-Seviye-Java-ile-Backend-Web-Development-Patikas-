

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int number1 = 5;
        int number2 = 9;
        long num1 = 555555555;
        long num2 = 999999999;

        //Toplama
        int sum = Calculate.sum(number1, number2);
        long sumLong = Calculate.sum(num1, num2);

        System.out.println(sum);
        System.out.println(sumLong);

        //Çıkarma
        int sub=Calculate.sub(number2,number1);
        long subLong=Calculate.sub(num2,num1);

        System.out.println(sub);
        System.out.println(subLong);

        //Çarpma
        int mul=Calculate.mul(number1,number2);
        long mulLong=Calculate.mul(num1,num2);

        System.out.println(mul);
        System.out.println(mulLong);

        String turev=Calculate.türev(3,"3 4 2 0");
        String turev2=Calculate.türev(3,"5 5 1 4");

        System.out.println(turev);
        System.out.println(turev2);

        String integral=Calculate.integral(2,"9 8 2");
        System.out.println(integral);
        
        System.out.println(Calculate.factoriel(5));

        System.out.println(Calculate.mod(25,2));
        System.out.println(Calculate.mutlak(-5));

    }
}