import com.sun.source.tree.WhileLoopTree;

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    // Return size of the list with recursion
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    // Return size of the list with no recursion
    public int iterativeSize() {
        IntList p = this;
        int size = 0;

        while (p != null) {
            size++;
            p = p.rest;
        }
        return size;
    }

    public int get(int index) {
        int number = 0;
        IntList p = this;

        for (int i = 0; i < index + 1; i++) {
            number = p.first;
            p = p.rest;
        }
        return number;
    }


    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);
        int length = L.size();
        System.out.println(length);

        System.out.println(L.iterativeSize());

        System.out.println(L.get(0));
        System.out.println(L.get(1));
        System.out.println(L.get(2));

        // System.out.println(L.get(100));
    }
}


