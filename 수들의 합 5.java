import java.util.Scanner;

public class Hello{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        long N= scanner.nextLong();

        int start=1;
        int end=1;

        long sum=0;
        int count=0;
        while (start<N/2+1){
            if(sum==N){
                count+=1;
                sum-=start;
                sum+=end;
                start+=1;
                end+=1;
            }else if(sum<N){
                if(end<N+1){
                    sum+=end;
                    end+=1;
                }
            }else if(sum>N){
                sum-=start;
                start+=1;
            }
        }
        System.out.println(count+1);
        scanner.close();
    }
}
