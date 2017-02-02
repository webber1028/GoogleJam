package googlejam;

import java.io.File;
import org.apache.commons.io.FileUtils;

public class QualificationRound_A {
	public static void main(String[] args) throws Exception {
		
		String[] strs = FileUtils.readFileToString(new File("E:\\workspace\\A-large-practice.in"), "UTF-8").split("\n");
		
		for (int caseNumber = 1 ; caseNumber < strs.length ; caseNumber++) {
			char audiences[] = strs[caseNumber].split(" ")[1].toCharArray();
			int extraAudience = 0;
			int standupAudience = Character.getNumericValue(audiences[0]);
			for (int shynessLevel = 1; shynessLevel < audiences.length; shynessLevel++) {  
				int currentAudience = Character.getNumericValue(audiences[shynessLevel]);
				if ((shynessLevel > standupAudience + extraAudience) && (currentAudience > 0)) {
					extraAudience += (shynessLevel - standupAudience - extraAudience);
				}
				standupAudience += currentAudience;
			}
			
			System.out.println("Case #" + caseNumber + ": " + extraAudience);
		}
	}
}