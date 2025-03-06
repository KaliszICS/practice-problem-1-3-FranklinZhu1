import java.io.*;

public class PracticeProblem {

	public static String readFile(String filename) {
		BufferedReader in = null;
		try {
			String ans = "", a;
			in = new BufferedReader(new FileReader(filename));
			while ((a = in.readLine()) != null) ans += a + '\n';
			return ans;
		}
		catch (Exception e) {
			return "";
		}
		finally {
			try {
				if (in != null) in.close();
			}
			catch (Exception e) {
				return "";
			}
		}
	}

	public static String backwardsReadFile(String filename) {
		BufferedReader in = null;
		try {
			String temp = "", ans = "", a;
			in = new BufferedReader(new FileReader(filename));
			while ((a = in.readLine()) != null) temp += a + '\n';
			for (int i = temp.length() - 1; i >= 0; --i) ans += temp.charAt(i); // there's probably a better way to do this with filereader
			return ans;
		}
		catch (Exception e) {
			return "";
		}
		finally {
			try {
				if (in != null) in.close();
			}
			catch (Exception e) {
				return "";
			}
		}
	}

}