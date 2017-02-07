package googlejam;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.io.FileUtils;

public class QualificationRound_A_2016 {
	public static void main(String[] args) throws Exception {
		
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		String[] strs = FileUtils.readFileToString(new File(classLoader.getResource("2016/QualificationRound_A/A-small-practice.in").getFile()), "UTF-8").split("\n");
		
		for (int caseNumber = 1 ; caseNumber < strs.length ; caseNumber++) {
			
			Set<Character> set = new HashSet<Character>();
			long number = Long.parseLong(strs[caseNumber]);
			long index = 1;
			while (true) {
				char[] digits = String.valueOf(number * index).toCharArray();
				for (char digit : digits) {
					set.add(digit);
				}
				
				if (set.size() == 10) {
					System.out.println("Case #" + caseNumber + ": " + number * index);
					break;
				}
				
				if (number == 0) {
					System.out.println("Case #" + caseNumber + ": " + "INSOMNIA");
					break;
				}
				
				index++;
			}
		}
	}
}