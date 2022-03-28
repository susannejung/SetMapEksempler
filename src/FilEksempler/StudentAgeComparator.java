package FilEksempler;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {
    public StudentAgeComparator() {
    }

    @Override
    public int compare(Student s, Student s1) {
        if(s.age==s1.age)
            return 0;
        else if(s.age>s1.age)
            return 1;
        else
            return -1;
    }
}
