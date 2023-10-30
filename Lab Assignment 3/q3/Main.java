import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner strInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);

        LinkedList<AlumniSTJ> alumni = new LinkedList<AlumniSTJ>();

        System.out.print("Enter number of alumni: ");
        int numAlumni = intInput.nextInt();

        System.out.println();

        for (int i = 0; i < numAlumni; i++) {
            System.out.print("Enter name: ");
            String name = strInput.nextLine();

            System.out.print("Enter IC: ");
            String IC = strInput.nextLine();

            System.out.print("Enter gender (F/M): ");
            char gender = strInput.nextLine().toUpperCase().charAt(0);

            System.out.print("Enter batch year: ");
            int batchYear = intInput.nextInt();

            System.out.print("Enter employment (Y/N): ");
            boolean employment = strInput.nextLine().toUpperCase().charAt(0) == 'Y';

            System.out.print("Enter education level (Diploma, Degree, Master, PhD): ");
            String educationLevel = strInput.nextLine();

            alumni.add(new AlumniSTJ(name, IC, gender, batchYear, employment, educationLevel));

            System.out.println();
        }

        // number of male alumni
        int numMale = 0;
        for (AlumniSTJ a : alumni) {
            if (a.getGender() == 'M') {
                numMale++;
            }
        }

        System.out.println("Number of male alumni: " + numMale);

        // number of female alumni
        int numFemale = 0;
        for (AlumniSTJ a : alumni) {
            if (a.getGender() == 'F') {
                numFemale++;
            }
        }

        System.out.println("Number of female alumni: " + numFemale);

        // number of alumni employed
        int numEmployed = 0;
        for (AlumniSTJ a : alumni) {
            if (a.getEmployment()) {
                numEmployed++;
            }
        }

        System.out.println("Number of alumni employed: " + numEmployed);

        // number of alumni unemployed
        int numUnemployed = 0;
        for (AlumniSTJ a : alumni) {
            if (!a.getEmployment()) {
                numUnemployed++;
            }
        }

        System.out.println("Number of alumni unemployed: " + numUnemployed);

        // number of alumni from SPM batch year 1995
        int numSPM1995 = 0;
        for (AlumniSTJ a : alumni) {
            if (a.getBatchYear() == 1995 && a.getEducationLevel().equals("SPM")) {
                numSPM1995++;
            }
        }

        System.out.println("Number of alumni from SPM batch year 1995: " + numSPM1995);

        // number of alumni age >= 50
        int numAge50 = 0;
        for (AlumniSTJ a : alumni) {
            if (a.calculateAge() >= 50) {
                numAge50++;
            }
        }

        System.out.println("Number of alumni age >= 50: " + numAge50);

        // total fee paid by alumni
        double totalFee = 0;
        for (AlumniSTJ a : alumni) {
            totalFee += a.calculateFees();
        }

        System.out.println("Total fee paid by alumni: RM" + totalFee);

        // sort alumni by their age
        for (int i = 0; i < alumni.size() - 1; i++) {
            for (int j = 0; j < alumni.size() - i - 1; j++) {
                if (alumni.get(j).calculateAge() > alumni.get(j + 1).calculateAge()) {
                    AlumniSTJ temp = alumni.get(j);
                    alumni.set(j, alumni.get(j + 1));
                    alumni.set(j + 1, temp);
                }
            }
        }

        // print the oldest alumni
        System.out.println("\nOldest alumni:\n" + alumni.getLast());

        strInput.close();
        intInput.close();
    }
}
