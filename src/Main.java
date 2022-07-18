import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // task 1
        int currentNum = 0;

        while (currentNum < 10) {
            System.out.print(++currentNum + " ");
        }

        System.out.println();

        for (;currentNum > 0; currentNum--) {
            System.out.print(currentNum + " ");
        }

        //task 2

         int firstFriday = 5;
        for (int currentFriday = firstFriday; currentFriday <= 31 ; currentFriday += 7 ) {
            System.out.println("today is Friday, " + currentFriday + " -t number. Need to prepare a report ");
            
        }

        //task 3

        int currentYear = LocalDate.now().getYear();

        int start = currentYear - 200;
        int end = currentYear + 100;

        for (int i = start; i <= end; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
            
        }

    }
}