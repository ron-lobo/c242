package org.ron.intro;

import java.util.HashSet;
import java.util.Set;

public class InnerClasses {

    public static void main(String[] args) {
        InnerClasses ic = new InnerClasses();
        ic.namedInnerAndStaticInner();
    }

    private static void doSomethingStatic() {
//        Student s0 = new Student(133, "Harry P");
        Employee e0 = new Employee(123, "Severus S");
    }

    private void namedInnerAndStaticInner() {
        Student s0 = new Student(133, "Harry P");
        Student s1 = new Student(139, "Hermione G");
        System.out.println("student: " + s0.id + ", " + s0.name);

        Employee e0 = new Employee(321, "Minerva");
        System.out.println("employee: " + e0.id + ", " + e0.name);

        // extremely rare
        class Course {
            private final int id;
            private String name;

            public Course(int id, String name) {
                this.id = id;
                this.name = name;
            }
        }
        Course c0 = new Course(88, "Potions");
        System.out.println("course: " + c0.id + ", " + c0.name);
    }

    public void anonInnerClass() {

        Student student = new Student(323, "Nevil L");

        Course c = new Course();
        c.register(student);
        c.deregister(student);
        System.out.println("num registered: " + c.getNumberOfEmployees());

        Enrollable enrollable = new Enrollable() {
            private Set<Student> students = new HashSet<>();

            @Override
            public void register(Student s) {
                students.add(s);
            }

            @Override
            public void deregister(Student s) {
                students.remove(s);
            }

            @Override
            public int getNumberOfEmployees() {
                return students.size();
            }
        };
        enrollable.register(student);
        enrollable.deregister(student);
//        System.out.println("num registered: " +  enrollable.getNumberOfEmployees());

//        Enrollable enrollable1 = new ???
    }

    public interface Enrollable {
        void register(Student s);

        void deregister(Student s);

        int getNumberOfEmployees();
    }

    public class Course implements Enrollable {
        private Set<Student> students = new HashSet<>();

        public void register(Student s) {
            students.add(s);
        }

        public void deregister(Student s) {
            students.remove(s);
        }

        public int getNumberOfEmployees() {
            return students.size();
        }
    }

    public class Student {
        private final int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static class Employee {
        private final int id;
        private String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
}
