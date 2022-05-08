import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hello{
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        int[] arr= new int[n+1];
        st=new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        arr[n]=0;

        int start=0;
        int end=0;

        int count=0;
        int sum=0;
        while (start!=n+1 & end!=n+1){
            if(sum==m){
                count=count+1;
                if (end<=n+1){
                    sum-=arr[start];
                    sum+=arr[end];
                    start+=1;
                    end+=1;
                }
            }else if(sum<m){
                if (end<n+1){
                    sum+=arr[end];
                    end+=1;
                }
            }else if(sum>m){
                if(start<n+1){
                    sum-=arr[start];
                    start+=1;
                }
            }
        }
        System.out.println(count);
    }
}
