package lv.edgars;

public interface Array {

    //Add
    void add(int value);

    //Search
    int get();

    int get(int index);

    int indexOf(int value);

    boolean contains(int value);

    //Remove
    boolean remove(int value);

    void clear();

    //Array check
    boolean isEmpty();

    //Misc
    void display();

    void sortBubble();

    void sortSelect();

    void sortInsert();
}
