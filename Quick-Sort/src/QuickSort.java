public class QuickSort {


    public static void quickSort(int[] arr) {
        int endindex = arr.length - 1;
        int beginindex = 0;

        Sort(arr, beginindex, endindex);
    }

    //Quick sort yapılan kısımdır.
    public static void Sort(int[] arr, int beginIndex, int endIndex) {
        //Başlangıç indexi bitiş indexine eşit yada büyük olursa döngü sonlanır.
        if (beginIndex >= endIndex) {
            return;
        }
        //*********************
        int pivot = arr[endIndex];//Dizinin son elemanı pivot olarak seçilir.
        int j = beginIndex - 1;//ilk döngüde -1 den başlar sonrakilerde başlangıç indexinden 1 eksik olur.
        for (int i = beginIndex; i < endIndex; i++) {
            if (arr[i] < pivot) {//pivottan küçük ise j bir arttırılacak ve j indisindeki değer ile i indisindeki
                // değer yer değiştirecek.
                j++;
                swap(arr, j, i);
            }
        }
        j++;
        swap(arr, endIndex, j);
        Sort(arr, 0, j - 1);//sol alt tarafı sıralar.
        Sort(arr, j + 1, endIndex);//sağ alt tarafı sıralar.
    }

    //*****************************************************************
    //Verilen indislerdeki dizi elemanlarının yer değiştirmesini sağlar.
    public static void swap(int[] arr, int indis1, int indis2) {
        int value1 = arr[indis1];
        int value2 = arr[indis2];

        arr[indis1] = value2;
        arr[indis2] = value1;
    }

    //*****************************************************************
    //Print işlemi yapılır.
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr.length - 1 == i) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }


}
