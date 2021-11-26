import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.logging.XMLFormatter;

class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data = data;
        this.next = null;
    }
}
class SimpleLinkedList<T> {
    Node<T> head;
    private int size;
    SimpleLinkedList(){
        this.head = null;
    }

    public SimpleLinkedList(T[] values) {
        System.out.println("Size is " + values.length);
        for (int i = 0; i < values.length;i++){
            push(values[i]);
            this.size = values.length;
        }
    }
    void reverse(){
        Node<T> prev = null;
        Node<T> current = head;
        Node<T> next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public <T> T[] asArray(Class<T> characterClass){
        T[] ts = (T[]) new Object[size];
        if (characterClass.getSimpleName().equals("Character"))
        {
            Character[] ch = new Character[size];
            System.out.println("character class  " + characterClass.getSimpleName());
            ts = (T[]) new Character[size];
            int i = 0;
            int loopsize = size;
            while (i < loopsize) {
                ts[i] = (T) pop();
                i++;
            }
            System.out.println("main char array size is " + ch.length);
            for (T t : ts) {
                System.out.println(t);
            }
            return ts;
        }
        return ts;
    }

    void push(T data){
        Node<T> temp = new Node<>(data);
        if (this.head == null) {
            head = temp;
        }
        else {
            Node<T> x = head;
            while(x.next != null){
                x = x.next;
            }
            x.next = temp;
        }
        size++;
    }

    T pop(){
        Node<T> x = head;
        Node<T> prev = head;
        if (size == 0){
            throw new NoSuchElementException();
        }
        while (x.next!=null){
            prev = x;
            x = x.next;
        }
        T data = x.data;
        prev.next = null;
        size--;
        return data;
    }

    int size(){
        return size;
    }

    public String toString()
    {
        String S = "{ ";
        Node<T> X = head;
        if (X == null)
            return S + " }";
        while (X.next != null) {
            S += String.valueOf(X.data) + " -> ";
            X = X.next;
        }
        S += String.valueOf(X.data);
        return S + " }";
    }

    public static void main(String[] args) {
        // Integer[] values = new Integer[]{100,300,500,600,700};
        //SimpleLinkedList<Integer> list = new SimpleLinkedList<>(values);
        Character[] characters = new Character[]{'c','d','e','f'};
        SimpleLinkedList<Character> list = new SimpleLinkedList<>(characters);
        System.out.println(list);
        Character[] newchar;
        newchar = list.asArray(Character.class);
        System.out.println("new char " + newchar.length);
        for (Character c: newchar){
            System.out.println(c);
        }
        //System.out.println(""+ new String(list.toarray(Character.class)));
        //System.out.println(list.size());
        //list.reverse();
        //System.out.println(list);
    }
}

