package exercise1;

public class Grade {
    private Student student;
    private Course course;
    private Letter score;
    private Professor professor;
    private Boolean pass;

    public Grade(Student student, Course course, Letter score, Professor professor) {
        this.student = student;
        this.course = course;
        this.score = score;
        this.professor = professor;
        pass = score.equals(Letter.F) || score.equals(Letter.D);
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Letter getScore() {
        return score;
    }

    public void setScore(Letter score) {
        this.score = score;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Boolean getPass() {
        return pass;
    }

    public void setPass(Boolean pass) {
        this.pass = pass;
    }
    //    @Override
//    public String toString() {
//        return "Grade{" +
//                "student=" + student +
//                ", course=" + course +
//                ", score=" + score +
//                '}';
//    }
}
