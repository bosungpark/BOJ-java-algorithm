import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Hello{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        StringTokenizer st= new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());

        ArrayList humans=new ArrayList();
        for (int i=1; i<n+1; i++) {
            humans.add(i);
        }
        ArrayList answer=new ArrayList();
        int idx=0;
        while (humans.size()!=0){
            idx+=k-1;
            idx%=humans.size();

            int dead= humans.indexOf(idx);
//            System.out.println(dead);
            humans.remove(idx);
            answer.add(Integer.toString(dead));
        }
//        System.out.println(answer);
        sb.append("<");
        for (Object a : answer) {
            sb.append(a);
            sb.append(',');
            sb.append(' ');
        }
        sb.setLength(sb.length()-1);
        sb.append(">");

        System.out.println(sb);
        br.close();
        }
    }
