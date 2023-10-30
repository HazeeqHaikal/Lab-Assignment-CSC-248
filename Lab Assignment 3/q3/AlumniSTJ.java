public class AlumniSTJ {
    private String name;
    private String IC;
    private char gender;
    private int batchYear;
    private boolean employment;
    private String educationLevel;

    public AlumniSTJ() {
    }

    public AlumniSTJ(String name, String IC, char gender, int batchYear, boolean employment, String educationLevel) {
        this.name = name;
        this.IC = IC;
        this.gender = gender;
        this.batchYear = batchYear;
        this.employment = employment;
        this.educationLevel = educationLevel;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIC() {
        return this.IC;
    }

    public void setIC(String IC) {
        this.IC = IC;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getBatchYear() {
        return this.batchYear;
    }

    public void setBatchYear(int batchYear) {
        this.batchYear = batchYear;
    }

    public boolean isEmployment() {
        return this.employment;
    }

    public boolean getEmployment() {
        return this.employment;
    }

    public void setEmployment(boolean employment) {
        this.employment = employment;
    }

    public String getEducationLevel() {
        return this.educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String toString() {
        return "Name of the member: " + name + "\nAge: " + calculateAge() +
                "\nIC Number: " + IC + "\nGender: " + gender + "\nBatch Year: "
                + batchYear + "\nEmployment Status: " + employment + "\nEducation Level: " + educationLevel + "\n";
    }

    public int calculateAge() {
        return 2015 - Integer.parseInt(IC.substring(0, 2));
    }

    public double calculateFees() {
        double fees = 0;
        if (employment) {
            fees = 30.00;
        } else {
            fees = 15.00;
        }
        return fees;
    }
}
