import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Hello{
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        PriorityQueue left=new PriorityQueue<>();
        PriorityQueue right=new PriorityQueue<>();
        for(int i=0; i<n; i++) {
            int x = Integer.parseInt(br.readLine());
            if(i==0){
                System.out.println(x);
                left.offer(-x);
            }else{
                int middle=(int) left.poll();
                middle=-middle;
                System.out.println(middle);

                if (middle>=x){
                    left.offer(-x);
                }else {
                    right.offer(x);
                }

                right.offer(middle);
                while (left.size()<right.size()){
                    if (! right.isEmpty()){
                        int temp= (int) right.poll();
                        left.offer(-temp);
                    }else {
                        break;
                    }
                }
            }

        }
        System.out.println(-(int) left.poll());
    }
}
