public class ReverseString {

    public static String reverseUsingStringBuildeer(String str){
        StringBuilder stringBuilder = new StringBuilder();
        char[] strChars = str.toCharArray();

        for(int i = strChars.length - 1; i >= 0; i--) {
            stringBuilder.append(strChars[i]);
        }
        return stringBuilder.toString();
    }

    public static String reverseUsingCharArray(String str){
        char[] reversed = new char[str.length()];

        int newCharPos = 0;
        for(int oldCharPos = str.length() - 1; oldCharPos>=0; oldCharPos --){
            reversed[newCharPos++] = str.charAt(oldCharPos);
        }
        String reversedString = new String(reversed);
        return reversedString;
    }

    public static void main(String[] args) {
        String something = "Glenn";
        String reversedIteratively = reverseUsingStringBuildeer(something);
        System.out.println("Reversed iteratively using StringBuilder: " + reversedIteratively);
        System.out.println();
        reversedIteratively = reverseUsingCharArray(something);
        System.out.println("Reversed iteratively using char[] : " + reversedIteratively);
    }
}
