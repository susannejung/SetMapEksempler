package FilEksempler;

class Student implements Comparable<Student>{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

   /*   public int compareTo(Student st){
          if(age==st.age)
              return 0;
          else if(age>st.age)
              return 1;
          else
              return -1;
      }
      */


    public int compareTo(Student st){
        if(name.compareTo(st.name)==0)
            return 0;
        else if(name.compareTo(st.name)>0)
            return 1;
        else
            return -1;
    }
}

