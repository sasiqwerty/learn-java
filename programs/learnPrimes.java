package programs;

import programs.FileWriterExample;

public class learnPrimes {

    public static void main(String[] args) {
        String output = "test";
        int limit = 100000;
        System.out.println("prime numbers are up to" + limit + ":");
        for (int i = 2; i <= limit; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                output = (i + " ");
            }
            FileWriter(){
            try {
                FileWriter fw = new FileWriter("C:\\users\\sasi-i7\\documents\\learn-java\\programs\\testout.txt");
                fw.write("Welcome to javaTpoint.");
                fw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Success...");}
        }

    }

}
