package SumSquaredDigitsFunction;

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        Problem solver = new Problem();
        int tt = in.nextInt();
        solver.solve(tt, in, out);
        out.close();
    }

    static class Problem {
        public void solve(int tt, InputReader in, OutputWriter out) {
            while (tt-- > 0) {
                int cas = in.nextInt();
                int b = in.nextInt();
                int num = in.nextInt();
                String a = Integer.toString(Integer.parseInt(Integer.toString(num), 10), b);
                int sum = 0;
                for (int i = 0; i < a.length(); i++) {
                    double pow = 0;
                    if (a.charAt(i) == 'a') {
                        pow = 10 * 10;
                    } else if (a.charAt(i) == 'b') {
                        pow = 11 * 11;
                    } else if (a.charAt(i) == 'c') {
                        pow = 12 * 12;
                    } else if (a.charAt(i) == 'd') {
                        pow = 13 * 13;
                    } else if (a.charAt(i) == 'e') {
                        pow = 14 * 14;
                    } else if (a.charAt(i) == 'f') {
                        pow = 15 * 15;
                    } else {
                        pow = Math.pow(Integer.parseInt(a.charAt(i) + ""), 2);
                    }
                    sum += pow;
                }
                out.println(cas + " " + sum);
            }

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
