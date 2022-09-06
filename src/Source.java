public class Source {
    public static void main(String[] args) {
        String str = "Hello";
        char ch = 'l';
        System.out.println(strCount(str,ch)==2);
    }
    public static int strCount(String str, char letter) {
        int result =0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==letter) { result++;}
        }
        return result;
    }
}
