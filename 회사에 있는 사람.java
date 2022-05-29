import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Hello{
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);

        Integer n= Integer.parseInt(bufferedReader.readLine());
        ArrayList office=new ArrayList<>();
        for(int i=0; i<n; i++){
            String person=bufferedReader.readLine();
            String[] info=person.split(" ");
            person=info[0];
            if(office.contains(person)){
                office.remove(office.indexOf(person));
            }else {
                office.add(person);
            }
        }
        office.sort(Comparator.reverseOrder());
        for (Object o : office) {
            System.out.println(o);
        }
    }
}
