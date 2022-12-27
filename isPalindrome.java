public class isPalindrome{
    public static boolean m(String s){
          String t=s.toLowerCase();
          String h=t.replaceAll("[^a-z0-9]", "");
          StringBuilder sb=new StringBuilder(h);
          String y=sb.reverse().toString();
          return y.equals(h);

    }
    public static void main(String[] args) {
        System.out.println(isPalindrome.m("0P"));
    }
}