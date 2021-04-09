package exercise1;


import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        University university = new University("Maharishi");
        Department department = new Department("Compro");
        Department department1 = new Department("MSD");


        Professor professor = new Professor("John");
        Professor professor1 = new Professor("Jane");
        Professor professor2 = new Professor("Susy");


        department.setProfessorList(List.of(
                professor,
                professor1,
                professor2
        ));
        department1.setProfessorList(List.of(
                professor,
                professor1,
                professor2
        ));

        university.setDepartments(List.of(department1, department));

        Course course = new Course("MPP", 4);
        Course course1 = new Course("FPP", 4);
        Course course2 = new Course("WAP", 3);
        Course course3 = new Course("SA", 5);

        Student student = new Student("Student1");
        Student student1 = new Student("Student2");
        Student student2 = new Student("Student3");

        Grade grade1 = new Grade(student, course, Letter.B, professor);
        Grade grade2 = new Grade(student1, course1, Letter.F, professor1);
        Grade grade3 = new Grade(student2, course2, Letter.D, professor2);

        professor.addGrades(grade1);
        professor1.addGrades(grade2);
        professor2.addGrades(grade3);

        student.addGrade(grade1);
        student1.addGrade(grade2);
        student2.addGrade(grade3);

        student.addCourse(course);
        student1.addCourse(course1);
        student2.addCourse(course3);


        BiFunction<List<Course>, Integer, List<Course>> hardest = (x, y) ->
          x.stream()
                  .sorted((c1, c2) -> c2.getCreditScore() - c1.getCreditScore())
                  .limit(y)
                  .collect(Collectors.toList());

        List<Course> tough = hardest.apply(List.of(course1, course, course3, course2), 2);
        System.out.println(tough);


        Function<List<Grade>, List<Course>> gradeToCourse = grades ->
                grades
                .stream()
                .map(Grade::getCourse)
                .distinct()
                .collect(Collectors.toList());

        List<Course> crs = gradeToCourse.apply(List.of(grade1));
        System.out.println(crs);



        FunctionUtils.Ternary<List<Course>, Integer, Predicate<Course>, List<Course>> tops = (courses, k, p) ->
                courses
                        .stream()
                        .filter(p)
                        .sorted((c1, c2) -> c2.getCreditScore() - c1.getCreditScore())
                        .limit(k)
                        .collect(Collectors.toList());


        List<Course> tough1 = tops.apply(List.of(course1, course, course3, course2), 2, c -> c.getName().startsWith("S"));
        System.out.println(tough1);

        // most failed course
        BiFunction<List<Student>, Integer, List<String>> topFails = (students, k) ->
                students
                        .stream()
                        .flatMap(
                                student3 -> student3.getGrade().stream()
                        )
                        .filter(Grade::getPass)
                        .collect(Collectors.groupingBy(Grade::getCourse))
                        .entrySet()
                        .stream()
                        .sorted((o1, o2) -> o2.getValue().size() - o1.getValue().size())
                        .limit(k)
                        .map(o -> o.getKey().getName())
                        .collect(Collectors.toList());



        List<String> pr = topFails.apply(List.of(student, student1, student2), 2);
        System.out.println(pr);


        // most failed course
        BiFunction<University, Integer, List<Course>> topDepartmentCourseFailed = (university1, k) ->
                university1.getDepartments()
                        .stream()
                        .flatMap(department2 -> department2.getProfessorList().stream())
                        .flatMap(professors -> professors.getGrades().stream())
                        .filter(Grade::getPass)
                        .collect(Collectors.groupingBy(Grade::getCourse))
                        .entrySet()
                        .stream()
                        .sorted((o1, o2) -> o2.getValue().size() - o1.getValue().size())
                        .limit(k)
                        .map(Map.Entry::getKey)
                        .collect(Collectors.toList());



        List<Course> pr1 = topDepartmentCourseFailed.apply(university, 2);
        System.out.println(pr1);

    }
}
