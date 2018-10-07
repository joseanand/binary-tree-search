/**
 * 
 */
package problems.balancedBrackets;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Arockia_Antonyraj
 *
 */
public class BalancedBrackets {

	// Complete the isBalanced function below.
	// static String isBalanced(String s) {
	// s = s.replace("{", "}");
	// s = s.replace("[", "]");
	// s = s.replace("(", ")");
	// char[] c_arr = s.toCharArray();
	// int origSize = c_arr.length;
	// int size = origSize / 2;
	// boolean validity = false;
	// int j = origSize - 1;
	// for (int i = 0; i < size; i++) {
	// System.out.println(c_arr[i] + " " + c_arr[j]);
	// if (c_arr[i] == c_arr[j]) {
	// validity = true;
	// } else {
	// validity = false;
	// return "NO";
	// }
	// j--;
	// }
	// if (validity) {
	// return "YES";
	// }
	// return "NO";
	// }

	static String isBalanced(String s) {
		char[] c = s.toCharArray();
		int origSize = c.length;
		int preindex = 0;
		boolean firstOccurrence= true;
		boolean validity=true;
		char[] pc = new char[origSize];
		for (int i = 0; i < origSize; i++) {
			if(closing(c[i])) {
				if(c[i]==replace(c[i-1]) && firstOccurrence) {
					firstOccurrence=false;
				} else if(!firstOccurrence) {
					int x = pc.length;
					for (int j = pc.length; j>=0; j--) {
						if (pc[j]!='Y') {
							if(c[i]==pc[j] ) {
								pc[j]='Y';
								break;
							}
						}
					}			
				} else {
					validity=false;
					return "NO";
				}
			}else {
				pc[pc.length]=replace(c[i]);
			}
		}
		if(validity) {
			return "YES";
		}
		return "NO";
	}
	
	static char replace(char c) {
		return String.valueOf(c).replace("{", "}").replace("[", "]").replace("(", ")").charAt(0);
	}

	static boolean closing(char c) {
		if (c=='}' || c==']' || c==')') {
			return true;
		}
		return false;

	}

	public static void main(String[] args) throws IOException {

		String s = "{[()]}";
		String result = isBalanced(s);
		System.out.println(result);

	}

}
