package Pet;

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        Problem solver = new Problem();
        // int tt = in.nextInt();
        solver.solve(1, in, out);
        out.close();
    }

    static class Problem {
        public void solve(int tt, InputReader in, OutputWriter out) {
            int ans[] = new int[5];
            for (int i = 0; i < 5; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();
                int d = in.nextInt();
                ans[i] = a + b + c + d;
            }
            int max = ans[0];
            int index = 0;
            for (int i = 1; i < 5; i++) {
                if (max < ans[i]) {
                    max = ans[i];
                    index = i;
                }
            }
            out.println(index + 1 + " " + max);

        }

    }

    static class OutputWriter extends PrintWriter {
        public OutputWriter(String fileName) throws FileNotFoundException {
            super(fileName);
        }

        public OutputWriter(OutputStream outputStream) {
            super(outputStream);
        }

        public OutputWriter(Writer writer) {
            super(writer);
        }

    }

    static class InputReader {
        BufferedReader br;
        StringTokenizer in;

        public InputReader(String fileName) {
            try {
                br = new BufferedReader(new FileReader(fileName));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public InputReader(InputStream inputStream) {
            br = new BufferedReader(new InputStreamReader(inputStream));
        }

        boolean hasMoreTokens() {
            while (in == null || !in.hasMoreTokens()) {
                String s = nextLine();
                if (s == null) {
                    return false;
                }
                in = new StringTokenizer(s);
            }
            return true;
        }

        public String nextString() {
            return hasMoreTokens() ? in.nextToken() : null;
        }

        public String nextLine() {
            try {
                in = null;
                return br.readLine();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public long nextLong() {
            return Long.parseLong(nextString());
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        public int[][] nextIntIntArray(int n, int m) {
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = nextInt();
                }
            }
            return a;
        }

    }
}
