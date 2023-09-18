class Student {
    String name;
    int age;
    int marks;
}

public class Ex3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "abcd";
        s1.age = 20;
        s1.marks = 555;

        Student s2 = new Student();
        s2.name = "kdfjg";
        s2.age = 20;
        s2.marks = 555;

        Student s3 = new Student();
        s3.name = "dskflj";
        s3.age = 20;
        s3.marks = 555;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for (int i = 0; i < students.length; i++) {
        //     System.out.println("name : " + students[i].name + "\n age : " + students[i].age + "\n marks: " + students[i].marks);
        // }

        for (Student student : students) {
            System.out.println(student.name + " " + student.age);
        }

    }
}
