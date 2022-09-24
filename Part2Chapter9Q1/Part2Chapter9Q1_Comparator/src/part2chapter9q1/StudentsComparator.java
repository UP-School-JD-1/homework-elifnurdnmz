package part2chapter9q1;

import java.util.Comparator;

public class StudentsComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student s1=(Student) o1;
        Student s2=(Student) o2;
        if(s1.getYear()<s2.getYear()){
            return -1;
        }
        else if (s1.getYear()>s2.getYear()){
            return 1;
        }
        return 0;
    }
}