import java.io.*;

public class Main {

    static final class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        FastScanner(InputStream in) {
            this.in = in;
        }

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len < 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            do { c = read(); } while (c <= ' ');
            int sign = 1;
            if (c == '-') { sign = -1; c = read(); }
            int val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }

        void readBinaryRow(byte[] row, int m) throws IOException {
            int c;
            do { c = read(); } while (c <= ' ');
            for (int j = 0; j < m; j++) {
                row[j] = (byte) (c - '0');
                c = read();
            }
            while (c > ' ') c = read();
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();

        int m = fs.nextInt();
        int n = fs.nextInt();
        int p = fs.nextInt();

        byte[][] matrix = new byte[n][m];
        for (int i = 0; i < n; i++) {
            fs.readBinaryRow(matrix[i], m);
        }

        for (int i = 0; i < p; i++) {
            int x = fs.nextInt();
            int y = fs.nextInt();
            int k = fs.nextInt();
            int ans = WildGarlic(x, y, k, matrix);
            out.append(ans).append('\n');
        }

        System.out.print(out);
    }

    private static int WildGarlic(int x, int y, int k, byte[][] matrix) {
        int count = 0;



        return count;
    }
}
