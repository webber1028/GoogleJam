package googlejam;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;

public class QualificationRound_B_2016 {
	public static void main(String[] args) throws Exception {
		
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		String[] strs = FileUtils.readFileToString(new File(classLoader.getResource("2016/QualificationRound_B/B-large-practice.in").getFile()), "UTF-8").split("\n");
		
		for (int caseNumber = 1 ; caseNumber < strs.length ; caseNumber++) {
			
			String str = strs[caseNumber] + "+";
			
			int count1 = StringUtils.countMatches(str, "-+");
			int count2 = StringUtils.countMatches(str, "+-");
		
			System.out.println("Case #" + caseNumber + ": " + (count1 + count2));
		}
	}
}