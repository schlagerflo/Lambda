import java.io.*;

public class NumberTester {
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;

    BufferedReader reader;
    public NumberTester (String fileName) {
        try {
            reader = new BufferedReader(new FileReader(fileName));
        }catch (FileNotFoundException e){
            System.out.println("File was not found!");
        }
    }

    public void setOddEvenTester (NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester (NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester (NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile () {
        try{
            int tests = Integer.parseInt(reader.readLine());
            for (int i = 0; i < tests; i++)
            {
                String[] parts = reader.readLine().split(" ");
                int methodNum = Integer.parseInt(parts[0]);
                int parameter = Integer.parseInt(parts[1]);

                switch (methodNum){
                    case 1: System.out.println(oddTester.testNumber(parameter) ? "ODD" : "EVEN");
                    case 2: System.out.println(primeTester.testNumber(parameter) ? "PRIME" : "NO PRIME");
                    case 3: System.out.println(palindromeTester.testNumber(parameter) ? "PALINDROME" : "NO PALINDROME");
            }
            }
        }catch (IOException e){
            System.out.println("Error in Method 'testFile()'!");
        }
    }
}
