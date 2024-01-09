public class JobCandidate {
    private int regNo;
    private String name;
    private char qualification; // D for Diploma, B for Bachelor, M for Master, P for PhD
    private int age;
    private char gender; // M - Male, F - Female

    public JobCandidate(int regNo, String name, char qualification, int age, char gender) {
        this.regNo = regNo;
        this.name = name;
        this.qualification = qualification;
        this.age = age;
        this.gender = gender;
    }

    public int getRegNo() {
        return this.regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getQualification() {
        return this.qualification;
    }

    public void setQualification(char qualification) {
        this.qualification = qualification;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // toString() method
    public String toString() {
        return "Registration Number: " + regNo + "\nName: " + name + "\nQualification: " + qualification
                + "\nAge: " + age + "\nGender: " + gender;
    }
}