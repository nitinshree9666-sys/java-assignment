class Student1 {
    private int marks;

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100)
            this.marks = marks;
        else
            System.out.println("Invalid Marks");
    }

    public int getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        Student1 s = new Student1();
        s.setMarks(90);
        System.out.println(s.getMarks());
    }
}
