import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class openLock {
    // public int openLock(String[] deadends, String target) {
    //     Queue<String> q = new LinkedList<>();
    //     Set<String> deads = new HashSet<>(Arrays.asList(deadends));
    //     Set<String> visited = new HashSet<>();
    //     q.offer("0000");
    //     visited.add("0000");
    //     int level = 0;
    //     while(!q.isEmpty()) {
    //         int size = q.size();
    //         while(size > 0) {
    //             String s = q.poll();
    //             if(deads.contains(s)) {
    //                 size --;
    //                 continue;
    //             }
    //             if(s.equals(target)) return level;
    //             StringBuilder sb = new StringBuilder(s);
    //             for(int i = 0; i < 4; i ++) {
    //                 char c = sb.charAt(i);
    //                 String s1 = sb.substring(0, i) + (c == '9' ? 0 : c - '0' + 1) + sb.substring(i + 1);
    //                 String s2 = sb.substring(0, i) + (c == '0' ? 9 : c - '0' - 1) + sb.substring(i + 1);
    //                 if(!visited.contains(s1) && !deads.contains(s1)) {
    //                     q.offer(s1);
    //                     visited.add(s1);
    //                 }
    //                 if(!visited.contains(s2) && !deads.contains(s2)) {
    //                     q.offer(s2);
    //                     visited.add(s2);
    //                 }
    //             }
    //             size --;
    //         }
    //         level ++;
    //     }
    //     return -1;
    // }
    public static int open(String[] deadends, String target) {
        Set<String> deads = new HashSet<>(Arrays.asList(deadends));
        Set<String> end = new HashSet<>();
        Set<String> begin = new HashSet<>();
        int level = 0;
        end.add(target);
        begin.add("0000");
        while (!begin.isEmpty() && !end.isEmpty()) {
            Set<String> temp = new HashSet<>();
            for (String s : begin) {
                if (end.contains(s)) return level;
                if (deads.contains(s)) continue;
                StringBuilder sb=new StringBuilder(s);
                deads.add(s);
                for(int i = 0; i < 4; i ++) {
                    char c = sb.charAt(i);
                    String s1 = sb.substring(0, i) + (c == '9' ? 0 : c - '0' + 1) + sb.substring(i + 1);
                    String s2 = sb.substring(0, i) + (c == '0' ? 9 : c - '0' - 1) + sb.substring(i + 1);
                   /*if the number is 9 then its made 0 else it is incremented.Here if we encounter 0 ths 
                   it is incremented by 1.Then in the next string that 0 is made 9.For all other numbers
                   they are incremented by 1 and subtracted by 1 */ 
                    if(!deads.contains(s1)){
                        temp.add(s1);}
                    if(!deads.contains(s2))
                        temp.add(s2);
                }
            }
            level++;
            begin = end;
            end = temp;
           
        }
        return -1;

    }
    

    public static void main(String[] args) {
        String[] deadends = {"0201","0101","0102","1212","2002"};
        System.out.print(openLock.open(deadends,"0202"));

    }
}