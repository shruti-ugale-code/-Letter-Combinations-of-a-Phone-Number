public class Phone_Keypad {
    public static void main(String[] args) {
        Pad("", "12");
    }
    public static void Pad(String p, String up){
        if (up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        int digit = up.charAt(0) - '0'; // to convert '2' into 2
        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch = (char)('a'+i); //adds i in the ascii value of a and converts it to char
            Pad(p+ch, up.substring(1));
        }
    }
}
