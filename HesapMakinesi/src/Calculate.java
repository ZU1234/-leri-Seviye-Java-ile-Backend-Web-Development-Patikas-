import java.math.BigDecimal;

public final class Calculate {
    public Calculate() {
    }

    //Toplama
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static long sum(long num1, long num2) {
        return num1 + num2;
    }

    //*********************************************
    //Çıkarma
    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static long sub(long num1, long num2) {
        return num1 - num2;
    }

    //********************************************
    //Çarpma
    public static int mul(int num1, int num2) {

        return num1 - num2;
    }

    public static long mul(long num1, long num2) {

        return num1 - num2;
    }

    //********************************************
    //Bölme
    public static long div(long x, long y) {
        long q = x / y;
        return q;
    }

    public static int div(int x, int y) {
        int q = x / y;
        return q;
    }

    //********************************************
    //Türev
    public static String türev(int derece, String katsayilar) {
        String[] arr = katsayilar.split(" ");
        int j = derece;
        String result = "";
        int kat;
        for (int i = 0; i <= derece; i++) {
            kat = Integer.parseInt(arr[i]) * j;
            if (j > 2) {
                if (kat > 0) {

                    result = result.concat(kat + "x^" + (j - 1) + "+");
                } else if (kat < 0) {
                    result = result.concat(kat + "x^" + (j - 1) + "+");
                } else {

                }


            } else {
                if (j == 2) {
                    result = result.concat(kat + "x+");

                } else {
                    if (kat != 0) {
                        result = result.concat(kat + "+");
                    }

                }
            }
            j--;

        }
        result = result.substring(0, result.length() - 1);
        return result;

    }

    //********************************************
    //integral
    public static String integral(int derece, String katsayilar) {
        String[] arr = katsayilar.split(" ");
        int j = derece + 1;
        String result = "";
        int kat;
        for (int i = 0; i < arr.length; i++) {
            kat = Integer.parseInt(arr[i]) / j;
            result = result.concat(kat + "x^" + j + "+");
            j--;
        }
        result = result.concat("C");
        return result;
    }

    //********************************************
    //factoriel
    public static int factoriel(int value) {
        int result = 1;
        for (int i = 2; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    //******************************************
    //mod alma
    public static int mod(int value, int mod) {
        if (mod > value) {
            return -1;
        } else {
            while (value >= mod) {
                value -= mod;
            }
        }
        return value;
    }
    //*******************************************
    //Mutlak değer
    public static int mutlak(int value){

        if(value<0){
            return (value*(-1));
        }else {
            return value;
        }
    }
    //*******************************************

}
