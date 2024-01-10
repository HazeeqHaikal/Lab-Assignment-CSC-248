import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner intInput = new Scanner(System.in);
        Scanner strInput = new Scanner(System.in);

        BSTCandidate candidateTree = new BSTCandidate();

        String[][] jobCandidates = {
                { "3358", "MUHAMMAD AZMIL BIN AHIMAD", "D", "22", "M" },
                { "5262", "SYAHIRAH BINTI ISMAIL", "P", "32", "F" },
                { "4221", "HUSNA BT ROHA", "M", "28", "F" },
                { "3395", "MUHAMMAD DANIAL BIN NAZIM", "S", "26", "M" },
                { "3222", "DIYANA NUR BINTI HASBI", "S", "24", "F" },
                { "5256", "BATRISYA BINTI DIN", "P", "35", "F" },
                { "3345", "AMIR HAKIM BIN DANIAL", "D", "25", "M" },
                { "3353", "LUQMAN BIN AHMAD", "D", "25", "M" }
        };

        for (int i = 0; i < jobCandidates.length; i++) {
            JobCandidate candidate = new JobCandidate(Integer.parseInt(jobCandidates[i][0]), jobCandidates[i][1],
                    jobCandidates[i][2].charAt(0), Integer.parseInt(jobCandidates[i][3]),
                    jobCandidates[i][4].charAt(0));
            candidateTree.insert(candidate);
        }

        // calculate and display total candidates with masters and phd qualification
        int total = candidateTree.countCandidate('M') + candidateTree.countCandidate('P');
        System.out.println("Total candidates with masters and phd qualification: " + total);

    }
}
