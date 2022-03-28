package FilEksempler;

import java.util.Comparator;

public class StudentRollnoComparator implements Comparator<Student> {
    public StudentRollnoComparator() {
    }

    @Override
    public int compare(Student s, Student s1) {

        if(s.rollno==s1.rollno)
            return 0;
        else if(s.rollno>s1.rollno)
            return 1;
        else
            return -1;
    }
}

