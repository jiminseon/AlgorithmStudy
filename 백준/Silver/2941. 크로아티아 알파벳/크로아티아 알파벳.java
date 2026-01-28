import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] croatias = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < croatias.length; i++) {
            if (input.contains(croatias[i])) {
                input = input.replace(croatias[i], "a");
            }
        }
        System.out.print(input.length());
        br.close();

    }

}
