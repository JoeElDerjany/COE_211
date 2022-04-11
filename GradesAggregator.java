import java.util.Scanner;

public class GradesAggregator{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] assignments = new int[6];
        int asn;
        int attendance;
        int midterm;
        
        for (int idx =0; idx < assignments.length; idx++){
            asn = idx + 1;
            System.out.println("Input the grade of assignment " + asn);
            assignments[idx] = scan.nextInt();
        }
        
        System.out.println("Input the number of attended labs");
        attendance = scan.nextInt();
        
        System.out.println("Input the midterm grade");
        midterm = scan.nextInt();
        
        int total = 0;
        for(int idx=0; idx < assignments.length; idx++){
            total += assignments[idx];
        }
        double avr = total / assignments.length;
        
        double assignmentsGrade = avr * 0.3;
        System.out.println("Assignments (30%): " + assignmentsGrade);
        double attendanceGrade = (attendance/7.0) * 5;
        System.out.println("Attendance (5%): " + attendanceGrade);
        double midtermGrade = midterm * 0.3;
        System.out.println("Midterm (30%): " + midtermGrade);
        
        double needed = 95-assignmentsGrade-attendanceGrade-midtermGrade;
        double gradeNeeded = needed / 0.35;
        System.out.println("You need " + gradeNeeded);
    }
}
