import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> lists = new ArrayList<>();
        String s;
        s = reader.readLine();
        String[] ss = s.split(" ");

        for (int i = 0; i < ss.length; i++)
            lists.add(Integer.valueOf(ss[i]));


        //Sort
        lists.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2)
                    return 1;
                if (o1 < o2)
                    return -1;
                return 0;
            }
        });

        Iterator<Integer> it = lists.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0)
                it.remove();
        }

        for (Integer p:lists) {
        System.out.println(p);
        }
    }
}
