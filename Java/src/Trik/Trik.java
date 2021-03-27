package Trik;

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
            int a[] = { 1, 0, 0 };
            String s = in.nextLine();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'A')
                    swap(a, 0, 1);
                else if (s.charAt(i) == 'B')
                    swap(a, 1, 2);
                else if (s.charAt(i) == 'C')
                    swap(a, 0, 2);
            }
            int ans = 0;
            for (int i = 0; i < 3; i++) {
                if (a[i] == 1) {
                    ans = i;
                    break;
                }
            }
            out.println(ans + 1);
        }

        public void swap(int[] a, int index1, int index2) {
            int temp = a[index1];
            a[index1] = a[index2];
            a[index2] = temp;
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

        public double nextDouble() {
            return Double.parseDouble(nextString());
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
