/**
 * Created by maxmya on 02/03/16.
 */
public class Array {

    //Members
    private int[] myArray;
    private int insertPtr;
    private int size;
    private boolean sortflag;

    //Constructors
    public Array(int size) {

        this.size = size;
        myArray = new int[size];
        System.out.println("Array is created!");

    }

    //Insertions & deletion
    public void insert(int element) {

        if (insertPtr < size) {
            sortflag = false;
            myArray[insertPtr] = element;
            System.out.println("Element " + element + " is Added");
            insertPtr++;
        } else {
            System.err.print("The array is full !");
        }
    }

    public void delet(int key) {

        if (insertPtr >= key) {
            System.out.println("Element " + myArray[key] + " is deleted");
            for (int i = key; i < myArray.length - 1; i++) {

                myArray[key] = myArray[key + 1];

            }
        } else {

            System.err.println("Index " + key + " is empty or out of bounds !");
        }


    }


    //Sorting (Merge Sort)
    public void sort() {
        sortflag = true;
        Mergesort.sort(myArray);
    }


    //Searching

    //Sorted
    public int Bsearch(int element) {
        if (sortflag) {
            int low = 0;
            int high = size - 1;
            while (high >= low) {
                int middle = (low + high) / 2;
                if (myArray[middle] == element) {
                    return middle;
                }
                if (myArray[middle] < element) {
                    low = middle + 1;
                }
                if (myArray[middle] > element) {
                    high = middle - 1;
                }
            }
            return -1;
        } else {
            System.err.println("Array is not sorted !");
            return -1;
        }
    }

    //Unsorted
    public int searchUnsorted() {

    }


    // vogella.com --copied open source
    class Mergesort {
        private static int[] numbers;
        private static int[] helper;
        private static int number;

        public static void sort(int[] values) {
            numbers = values;
            number = values.length;
            helper = new int[number];
            mergesort(0, number - 1);
        }

        private static void mergesort(int low, int high) {
            if (low < high) {
                int middle = low + (high - low) / 2;
                mergesort(low, middle);
                mergesort(middle + 1, high);
                merge(low, middle, high);
            }
        }

        private static void merge(int low, int middle, int high) {
            for (int i = low; i <= high; i++) {
                helper[i] = numbers[i];
            }
            int i = low;
            int j = middle + 1;
            int k = low;
            while (i <= middle && j <= high) {
                if (helper[i] <= helper[j]) {
                    numbers[k] = helper[i];
                    i++;
                } else {
                    numbers[k] = helper[j];
                    j++;
                }
                k++;
            }
            while (i <= middle) {
                numbers[k] = helper[i];
                k++;
                i++;
            }

        }
    }





