package FilEksempler;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Student[] tabel1 = new Student[6];
        tabel1[0] = (new Student(1, "Bent", 17));
        tabel1[1] = (new Student(2, "Anne", 19));
        tabel1[2] = (new Student(3, "Anna", 20));
        tabel1[3] = (new Student(4, "Peter", 22));
        tabel1[4] = (new Student(5, "Jens", 25));
        tabel1[5] = (new Student(6, "Bodil", 21));


        TreeSet<Student> ts= new TreeSet<Student>(new StudentAgeComparator());

        TreeSet<Student> ts2=new TreeSet<>();

        for(int i=0;i<6;i++)
          ts.add(tabel1[i]);


        System.out.println("ts");
        System.out.println(ts);

        TreeSet<Student>ts1 = new TreeSet<Student>(Comparator.comparing(Student::getAge));
        for(int i=0;i<6;i++)
            ts1.add(tabel1[i]);
       System.out.println("ts1");
       System.out.println(ts1);


        TreeSet<Student>ts2 = new TreeSet<Student>( new StudentRollnoComparator());

        for(int i=0;i<6;i++)
            ts2.add(tabel1[i]);

        System.out.println("ts2");
        System.out.println(ts2);


        HashSet h= new LinkedHashSet(ts2);
        System.out.println("h");
        System.out.println(h);


        HashSet h1= new HashSet(ts2);
        System.out.println("h1");
        System.out.println(h1);

        System.out.println("h1");
        for (Object s: h1) {
            System.out.println(s.toString());
        }


        Iterator<Integer> it = h.iterator();
        System.out.println("Iterate HashSet using iterator : ");

        while (it.hasNext()) {
            // Print HashSet values
            System.out.println(it.next());
            Student s=(Student) it;
            s.getName();
        }


        System.out.println("Iterate HashSet using for loop : ");
        for (Object ele : h) {
            System.out.println(ele + " ");
            Student s=(Student) ele;
            s.getAge();
        }


        if(h1.contains(tabel1[3]))
           System.out.println("Peter er i mængden");



/*

        Map<Student, Integer> map = new TreeMap<>(new StudentNameComparator());

        Integer point;
        for (int i = 0; i < 6; i++) {
            Student key = tabel1[i];
            point=i*2;
            map.put(key, point);
        }

        System.out.println();
        System.out.println("Udskrift 1");
        System.out.println(map);


        System.out.println();
        System.out.println("Udskrift 2");
        for (Map.Entry<Student,Integer> pair: map.entrySet()) {
            System.out.println(pair.getValue().toString()+"  "+pair.getKey());
        }

        Map<Student, Integer> map1 = new TreeMap<>();
        for (int i = 0; i < 6; i++) {
            Student key = tabel1[i];
            point=i*2;
            map1.put(key, point);
        }

        System.out.println();
        System.out.println("Udskrift 3 sortering default på name, da compareTo i Student");
        for (Map.Entry<Student,Integer> pair: map1.entrySet()) {
            System.out.println(pair.getValue().toString()+"  "+pair.getKey());
        }

        System.out.println();
        System.out.println("Udskrift 4 tabel1[2]=Anna har Value=4");
        Integer s=map1.get(tabel1[2]);
        System.out.println(s);


        Map<Student, Integer> map2 = new TreeMap<>(new StudentAgeComparator());
        map2.putAll(map1);

        System.out.println();
        System.out.println("Udskrift 5");
        for (Map.Entry<Student,Integer> pair: map2.entrySet()) {
            // System.out.println(pair.getKey()+":"+pair.getValue());
            System.out.println(pair.getValue().toString()+"  "+pair.getKey());
        }

        System.out.println();
        System.out.println("Udskrift 6");
        if(map2.containsKey(tabel1[2]))
            System.out.println("Anna er i træet med value= "+map2.get(tabel1[2]));
*/
    }
}


