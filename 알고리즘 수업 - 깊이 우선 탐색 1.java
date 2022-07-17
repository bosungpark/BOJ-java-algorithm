import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Hello{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer=new StringTokenizer(bufferedReader.readLine());
        int n=Integer.parseInt(stringTokenizer.nextToken());
        int m=Integer.parseInt(stringTokenizer.nextToken());
        int r=Integer.parseInt(stringTokenizer.nextToken());

        Map graph=new HashMap();

        for(int i=0; i<n; i++){
            stringTokenizer=new StringTokenizer(bufferedReader.readLine());
            int u=Integer.parseInt(stringTokenizer.nextToken());
            int v=Integer.parseInt(stringTokenizer.nextToken());

            if(graph.containsKey(u)){
//                System.out.println("graph.get(u) = " + graph.get(u));
                ArrayList value=(ArrayList) graph.get(u);
                value.add(v);
                graph.put(u,value);
            }else {
                ArrayList value=new ArrayList();
                value.add(v);
                graph.put(u,value);
            }

            if(graph.containsKey(v)){
                ArrayList value=(ArrayList) graph.get(v);
                value.add(u);
                graph.put(v,value);
            }else {
                ArrayList value=new ArrayList();
                value.add(v);
                graph.put(v,value);
            }

        }
        System.out.println("graph = " + graph);
        ArrayList stack=new ArrayList();
        stack.add(r);
        ArrayList visited=new ArrayList();
        visited.add(r);
        while (stack.size()!=0){
            int node=(int) stack.get(stack.size()-1);
            stack.remove(stack.size()-1);

            ArrayList next=(ArrayList) graph.get(node);
            Collections.sort(next);
//            System.out.println("next = " + next);
//            System.out.println("visited = " + visited);

            for(int i=0; i<next.size(); i++){
                if (!visited.contains(next.get(i))){
                    stack.add(next.get(i));
                    visited.add(next.get(i));
                    break;
                }
            }
        }
//        System.out.println("visited = " + visited);
        int[] answer=new int[n];
        for(int i=0; i<visited.size(); i++){
            int node=(int)visited.get(i);
            answer[node-1]=i+1;
        }

        for (int i:answer){
            System.out.println(i);
        }
    }
}
