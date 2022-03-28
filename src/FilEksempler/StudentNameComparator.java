package FilEksempler;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {

    public StudentNameComparator() {
    }

    @Override
    public int compare(Student s, Student s1) {
        if(s.name.compareTo(s1.name)==0)
            return 0;
        else if(s.name.compareTo(s1.name)>0)
            return 1;
        else
            return -1;
    }
}

