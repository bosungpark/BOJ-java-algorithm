import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Hello{
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String S= br.readLine();

        if(S.length()==1){
            System.out.println(1);
        }else {
            ArrayList stack = new ArrayList();
            for (int i = 0; i < S.length(); i++) {
                stack.add(S.charAt(i));
//                System.out.println(stack.size());
                if(stack.size()>1) {
//                    System.out.println(stack);
//                    System.out.println(stack.get(stack.size() - 2));
//                    System.out.println(stack.get(stack.size() - 1));
                    while (stack.get(stack.size() - 2).equals('(')  & stack.get(stack.size() - 1).equals(')')) {
//                        System.out.println(11111);
                        stack.remove(stack.size() - 1);
                        stack.remove(stack.size() - 1);
                    }
                }
            }
            System.out.println(stack.size());
        }
        }
    }
