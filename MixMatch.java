public class MixMatch {
    public static void main(String[] args) {
        
        int varInt = 7;
        System.out.println(varInt + " <-- Integer stores whole numbers");
        
        String varString = "String!";
        System.out.println(varString + "<-- Printing out a String !");

        float varFloat = 19.77f;
        System.out.println(varFloat + "<-- stores numbers with deciamals");

        char varChar = 'A';
        System.out.println(varChar + " <-- Stores single letter with single quotes");

        boolean varBool = true;
        System.out.println(varBool + " <-- stores T & F values");

        short varShort = 32767;
        System.out.println(varShort + " <-- stores numbers from -32768 to 32767");

        long varLong = 15000L;
        System.out.println(varLong + " <-- Stores numbers from -9223372036854775808 to 9223372036854775807");



        System.out.println(varInt + varString + varFloat + varChar + varBool + varShort + varLong);
    }
}