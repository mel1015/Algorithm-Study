package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_200721_백준_2609_최대공약수와최소공배수 {

//	static int gcd(int a, int b) {
//		while (b > 0) {
//			int temp = b;
//			b = a % b;
//			a = temp;
//		}
//		return a;
//	}

	static int gcd(int a, int b) {
		if (b <= 0)
			return a;
		return gcd(b, a % b);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int gcdNum = gcd(a, b);

		System.out.println(gcdNum);
		System.out.println((a * b) / gcdNum);

		br.close();
	}
}