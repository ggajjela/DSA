public class ArrayMethods implements ArrayInterface {

    private int[] array;
    private int arraySize;
    private boolean dupKeysAllowed;

    public ArrayMethods(int size) {
        array = new int[size];
        arraySize = 0;
        dupKeysAllowed = false;
    }

    public ArrayMethods(int size, boolean isDup) {
        dupKeysAllowed = isDup;
        array = new int[size];
        arraySize = 0;
    }

    @Override
    public void add(int key) {

        if (isFull()) {
            System.out.println("Array out of bounds. Cannot add key " + key);
            return;
        }

        // case 1: duplicate keys are not allowed
        if (!dupKeysAllowed && search(key)) {
            System.out.println("key " + key + " is a duplicate, which is not allowed to be added");
            return;
        }

        // case 2: duplicate keys are allowed
        array[arraySize] = key;
        arraySize++;
        return;
    }

    @Override
    public void remove(int key) {

        if (isEmpty()) {
            System.out.println("The array is empty. Cannot remove key " + key);
            return;
        }

        int index = getIndex(key);
        if (index == -1) {
            System.out.println("The key " + key + " is not in the array");
            return;
        }

        for (int i = index; i < (arraySize - 1); i++) {
            array[i] = array[i+1];
        }
        arraySize--;
        return;
    }


    @Override
    public boolean search(int key) {

        if (isEmpty()) {
            return false;
        }

        for (int i = 0; i < arraySize; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int getIndex(int key) {

        for(int i = 0; i < arraySize; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int countDups(int key) {

        int count = 0;
        for (int i = 0; i < arraySize; i++) {
            if (array[i] == key) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void printArray() {
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

    @Override
    public int size() {
        return arraySize;
    }

    @Override
    public boolean isEmpty() {
        if (arraySize == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if (arraySize == array.length) {
            return true;
        }
        return false;
    }

    public boolean binarySearch(int key) {
        int low = 0;
        int high = arraySize - 1;

        while (low <= high) {
            int mid = (low+high) / 2;

            if (array[mid] == key) {
                System.out.println("The key " + key + " is found at index " + mid);
                return true;
            } else if (key > array[mid]) {
                // right search
                low = mid + 1;
            } else {
                // left search
                high = mid - 1;
            }
        }
        return false;
    }
}
