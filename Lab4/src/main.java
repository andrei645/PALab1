import com.School;
import com.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args){

        Student student1 = new Student("Andrei");
        Student student2 = new Student("Marian");
        System.out.println(student1.getName());
        System.out.println(student2.getName());
        student1.addPreference("School1");
        student1.addPreference("School2");
        student2.addPreference("School1");
        student2.addPreference("School2");
        System.out.println(student1.getPreference());
        System.out.println(student2.getPreference());
        School h1 = new School("School1");
        School h2 = new School("School2");
        h1.addPreference("Marian");
        h1.addPreference("Razvan");
        System.out.println(h1.getName());
        System.out.println(h1.getPreference());


        HashMap<Student, List<School>> map1= new HashMap<Student, List<School>>();
        map1.put(student1,Arrays.asList(h1, h2));
        for(Student key : map1.keySet()) {
            System.out.println(key.getName() + " " +  key.getPreference()); //afisare map1
        }


        HashMap <School, List<Student>> map2 = new HashMap<School, List<Student>>();
        map2.put(h1, Arrays.asList(student1, student2));
        for (School key2 : map2.keySet()){
            System.out.println(key2.getName() + " " + key2.getPreference());
        }

    }
}
