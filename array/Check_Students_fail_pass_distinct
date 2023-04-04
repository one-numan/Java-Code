class Assign {
    

    public static void main(String args[]) {
        // Main Function Start here
        int marks[] = { 22, 19, 33, 40, 90, 83, 32, 75 };

        // Function Call analyseMarks and Marks is array passing as argument
        analyseMarks(marks);
    }

    public static void analyseMarks(int marks[]) {
        // Count How many Student - Pass , Distinct , Fail
        // There are 8 Student
        
        int countDistinct = 0, countFail = 0, countPass = 0;
        // Loop Started 
        for (int i = 0; i <= 7; i++) {
            int markarr = marks[i];
            // assign into variable 
            
            if (markarr >= 75) {
                // check Distinct 
                countDistinct++;
                // Increase Distinct
            } else if (markarr >= 33 && markarr < 75) {
                // Check Pass Student
                countPass++;

                
            } else if (markarr < 33) {
                // Check Fail
                countFail++;
            }
        }
        System.out.println("\n\nDistinct Student are " + countDistinct);
        System.out.println("Pass Student are " + countPass);
        System.out.println("Fail Student are " + countFail +"\n\n");

    }
}
