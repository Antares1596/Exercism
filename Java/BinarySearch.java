import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    List<Integer> list;
    int size = 0;

    public BinarySearch(List<Integer> ls) {
        this.list = ls;
        this.size = ls.size();
        System.out.println(list);
    }

    int indexOf(int search) throws ValueNotFoundException{
        int start = 0,end = size - 1;
        while (start <= end ){
            int middle = start + (end - start)/2;
            if (list.get(middle) == search)
                return middle;
            if (list.get(middle) < search)
                start = middle + 1;
            else
                end = middle - 1;
        }
        throw new ValueNotFoundException("Value not in array");
    }
}
