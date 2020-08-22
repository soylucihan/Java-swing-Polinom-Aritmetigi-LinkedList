
package veriyapilari;


public class Node<T> {

    Node<T> next;
    T data1, data2;

    Node(T data1, T data2) {
        this.data1 = data1;
        this.data2 = data2;
        next = null;
    }
}
