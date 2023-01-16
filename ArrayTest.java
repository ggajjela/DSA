import java.lang.reflect.Array;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayMethods array1 = new ArrayMethods(5);
        array1.add(6);
        array1.add(7);
        array1.add(8);
        array1.add(9);
        array1.add(11);
        array1.printArray();

        int key = 6;
        if (array1.binarySearch(key)) {
            System.out.println("key " + key + " is found in the list");
        } else {
            System.out.println("key " + key + " is not found in the list");
        }
        key = 23;
        if (array1.search(key)) {
            System.out.println("key " + key + " is found in the list");
        } else {
            System.out.println("key " + key + " is not found in the list");
        }
        ArrayMethods arrayAllowDups = new ArrayMethods(10, true);
        arrayAllowDups.add(12);
        arrayAllowDups.add(8);
        arrayAllowDups.add(20);
        arrayAllowDups.add(15);
        arrayAllowDups.add(8);
        arrayAllowDups.printArray();

        key = 8;
        int count = arrayAllowDups.countDups(key);
        for (int i = 0; i < count; i++) {
            arrayAllowDups.remove(key);
        }
        arrayAllowDups.remove(15);

        arrayAllowDups.printArray();


    }
}
