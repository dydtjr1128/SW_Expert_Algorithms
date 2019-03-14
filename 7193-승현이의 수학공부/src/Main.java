import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String temp[];
        int n, num, q;
        int len = Integer.parseInt(reader.readLine());

        for (int i = 0; i < len; i++) {
            temp = reader.readLine().split(" ");
            n = Integer.parseInt(temp[0]);
            q = temp[1].length();
            num = 0;
            for (int j = 0; j < q; j++) {
                //num += Math.pow(n,j)*(temp[1].charAt(q-j-1)-'0');
                num += (temp[1].charAt(q - j - 1) - '0');
            }
            writer.write(String.format("#%d %d\n", i + 1, num % (n - 1)));
        }
        writer.flush();
        writer.close();
    }
}