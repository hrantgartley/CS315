/*
 * Grant Hartley
 * 2024/31/01
 * Desc: Create a basic student class with name, classification, age, and major
 * as well as a constructor and toString method
 */

class Student {
    private String name;
    private String classification;
    private int age;
    private String major;

    public Student(String name, String classification, int age, String major) {
        this.name = name;
        this.classification = classification;
        this.age = age;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public String getClassification() {
        return classification;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public String toString() {
        return "Hi, my name is " + this.getName() + "\n" + "My classification, age, and major are: "
                + this.getClassification() + ", " + this.getAge() + ", " + this.getMajor() + "\n";
    }

    public static void main(String[] args) {
        Student grant = new Student("G Hartley.", "Senior", 20, "Information Technology");
        System.out.println(grant.toString());
    }

}
