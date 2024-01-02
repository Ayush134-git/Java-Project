package Basic_Question;

import java.util.ArrayList;
import java.util.List;

public class ArrayAccessElement {

        public static void main(String[] args) {

            List<String> language = new ArrayList<String>();

            language.add("java");
            language.add("Python");
            language.add("C++");
            language.add("Kafka");

            System.out.println("Language :"+ language);
            String str = language.get(2);
            System.out.println("Element at Index :" + str);

            language.set(2, "SpringBoot");
            System.out.println("Modified Language :"+language);


        }

}
