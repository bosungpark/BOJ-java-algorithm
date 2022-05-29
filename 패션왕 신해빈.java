import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Hello{
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);

        int T= Integer.parseInt(bufferedReader.readLine());

        for(int i=0; i<T; i++) {
            HashMap hashMap=new HashMap<>();
            int n = Integer.parseInt(bufferedReader.readLine());

            for (int j = 0; j < n; j++) {
                String c = bufferedReader.readLine();
                String[] clothes = c.split(" ");

                ArrayList arrayList = new ArrayList<>();
                if (hashMap.containsKey(clothes[1])) {
                    arrayList = (ArrayList) hashMap.get(clothes[1]);
                    arrayList.add(clothes[0]);
                } else {
                    arrayList.add(clothes[0]);
                }
                hashMap.put(clothes[1], arrayList);
            }
//            System.out.println(hashMap);
            int choices=1;
            for (Object value : hashMap.values()) {
                ArrayList a=(ArrayList) value;
                choices*=(a.size()+1);
            }
            System.out.println(choices-1);

        }
    }
}
