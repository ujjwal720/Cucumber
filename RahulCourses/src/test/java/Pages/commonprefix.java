package Pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class commonprefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s = { "flower", "florty", "flmui", "fl" };

		List<Integer> im = new ArrayList<Integer>();
		
		int flag=0;
		
		String resultant="";

		for (int i = 0; i <= s.length - 1; i++) {

			im.add(s[i].length());

		}

		Collections.sort(im);

		int lowest = im.get(0);

		for (int i = 0; i <= lowest - 1; i++) {
			
			if(flag==1) {
				
				break;
			}

			char t = s[0].charAt(i);

			for (int j = 0; j <= s.length - 1; j++) {
				
				char y=s[j].charAt(i);
				
				if(t==s[j].charAt(i)) {
					
					
				}
				
				else {
					
					flag=1;
					
					break;
				}

			}
			
			
			resultant=resultant+t;
			
			

		}
		
		System.out.println(resultant);

	}

}
