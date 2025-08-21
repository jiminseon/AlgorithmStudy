import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        int cook = Integer.parseInt(br.readLine());

        int timeSecond =  hour * 3600 + minute * 60; 
        int cookSecond = cook * 60;

        int fullTime = timeSecond + cookSecond;

        int fullHour = fullTime / 3600 % 24;
        int fullMinute = (fullTime % 3600) / 60;

        System.out.println(fullHour + " " + fullMinute);
    }
}
