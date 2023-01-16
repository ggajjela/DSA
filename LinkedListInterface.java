public interface LinkedListInterface{

    /*
     * Add key at the beginning of the list.
     * Time complexity - O(1)
     * Space complexity - O(1)
     */
    void addAtHead(int key);

    /*
     * Add key at end of the list. Return true on success. Otherwise, return false.
     * Time complexity - O(n)
     * Space complexity - O(1)
     */

    void addAtTail(int key);

    /*
     * Add key at the specified index of the list. Return true on success. Otherwise, return false.
     * index zero indicates the first Node.
     * Time complexity - O(n)
     * Space complexity - O(1)
     */
    boolean addAtIndex(int index, int key);

    /*
     * Search key in the list. Return true if found. Otherwise, return false.
     * Time complexity - O(n)
     * Space complexity - O(1)
     */
    boolean search(int key);

    /*
     * Remove key if it is in the list. Return true on success. Otherwise, return false.
     * Time complexity - O(n)
     * Space complexity - O(1)
     */
    boolean remove(int key);

    /*
     * Remove key at specified index. Return true on success. Otherwise, return false.
     * Time complexity - O(n)
     * Space complexity - O(1)
     */
    boolean removeAtIndex(int index);

    /*
     * Return the size of the list.
     * Time complexity - O(1)
     * Space complexity - O(1)
     */
    int listLen();

    /*
     * Print all elements of the list.
     * Time complexity - O(n)
     * Space complexity - O(1)
     */
    void printList();

    Node getHead();

    boolean isEmpty();

}