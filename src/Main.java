import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Object[] characters = {'b', 'x', 'c', 'a', 'y', 'd', 'a', 'f'};
        Object[] numbers = {20, 1, 45 , 42 , 51, 3, 7, 23, 91};

        Comparator alphabetOrder = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if((char) o1 < (char) o2) {
                    return -1;
                }
                else if((char) o1 > (char) o2){
                    return 1;
                }
                else{
                    return 0;
                }
            }
        };
        Comparator ascendingOrder = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if((int) o1 < (int) o2) {
                    return -1;
                }
                else if((int) o1 > (int) o2){
                    return 1;
                }
                else{
                    return 0;
                }
            }
        };
        Comparator descendingOrder = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if((int) o1 > (int) o2) {
                    return -1;
                }
                else if((int) o1 < (int) o2){
                    return 1;
                }
                else{
                    return 0;
                }
            }
        };

        System.out.println("A L P H A B E T I C A L  O R D E R");
        System.out.println("Before Sort");
        printArray(characters);
        sort(characters, alphabetOrder);
        System.out.println("After Sort");
        printArray(characters);

        System.out.println("A S C E N D N G  O R D E R");
        System.out.println("Before Sort");
        printArray(numbers);
        sort(numbers, ascendingOrder);
        System.out.println("After Sort");
        printArray(numbers);

        System.out.println("D E S C E N D I N G  O R D E R");
        System.out.println("Before Sort");
        printArray(numbers);
        sort(numbers, descendingOrder);
        System.out.println("After Sort");
        printArray(numbers);



    }

    public static void sort(Object[] data, Comparator cmp) {
        // i divides array into two parts: already-sorted, not sorted
        for (int i = 0; i < data.length - 1; i++) {
            int minPos = i;
            // loop to find index containing a minimum value
            for (int j = i + 1; j < data.length; j++) {
                if (cmp.compare(data[j], data[minPos]) < 0) {
                    minPos = j;
                }
            }
            // swap minPos and i so that data in minPos index will
            // be the already-sorted part
            Object temp = data[minPos];
            data[minPos] = data[i];
            data[i] = temp;
        }
    }

    public static void printArray(Object[] array){
        for (Object i: array) {
            System.out.print(i);
            System.out.print(' ');
        }
        System.out.println();
    }


}
