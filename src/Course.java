public class Course {

    private int courseCapacity, waitListCapacity;
    private Student[] enrolledStudents, waitList;

    public Course(Student[] enrolledStudents, int courseCapacity, Student[] waitList, int waitListCapacity){
        this.courseCapacity = courseCapacity;
        this.waitListCapacity = waitListCapacity;
        this.waitList = new Student[waitListCapacity];
        this.enrolledStudents = new Student[courseCapacity];
    }

    public boolean dropStudent(){

    }


    public boolean addStudent(){

    }

    public static int nullCounter(String[] wordArray, int startPoint){
        if (startPoint >= wordArray.length){ return 0; } //input validation .

        int nullCount = 0;
        for (int count = startPoint; count < wordArray.length; count++) {
            String word = wordArray[count];
            if (word == null) {
                nullCount++;
            }
        }
        return nullCount;
    }
}
