import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Hello{
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);

        Set substrings=new HashSet<>();
        String word= bufferedReader.readLine();
        for(int i=1; i<word.length()+1; i++){
            for(int j=0; j<word.length()-i+1; j++){
                String w=word.substring(j,j+i);
//                System.out.println("w = " + w);
                substrings.add(w);
            }
        }
        System.out.println(substrings.size());
    }
}
