import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Hello{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        PriorityQueue q=new PriorityQueue<>();
        for (int i=0; i<n; i++){
            q.offer(scanner.nextInt());
        }

        int answer=0;
        while (q.size()>1){
            int s1=(int) q.poll();
            int s2=(int) q.poll();
            answer+=s1*s2;
            q.offer(s1+s2);
        }
        System.out.println(answer);
    }
}
