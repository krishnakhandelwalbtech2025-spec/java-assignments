public class MarksConversionDemo {
    public static void main(String[] args) {
        String[] marksInString = {"85", "90", "78", "88", "95"};
        int total = 0;

        for (String markStr : marksInString) {
            int mark = Integer.parseInt(markStr);   // String to Integer (wrapper class) conversion
            total += mark;
        }

        System.out.println("Total Marks : " + total);
        System.out.println("Average     : " + (total / marksInString.length));
    }
}
