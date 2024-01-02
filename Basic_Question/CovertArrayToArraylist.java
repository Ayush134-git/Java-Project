package Basic_Question;

import java.util.ArrayList;
import java.lang.reflect.Array;


public class CovertArrayToArraylist {

        public static void main(String[] args) {

            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(333);
            list.add(222);
            list.add(111);

            Object[] array = list.toArray();

            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);

            }

        }
    }


