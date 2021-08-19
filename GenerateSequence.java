public class GenerateSequence {
	
	public static void main(String[] args) {
		int start = 1;
		int n = 3 - 1;		// 0123
		String finalStr =  "" + start;

		for(int k = 0; k < n; k++) {

			int i = 0;
			int len = finalStr.length();
			String temp = "";
			while(i < len) {

				int count = 1, j, lastInd = i;

				for(j = i; j < len; j++) {
					if(j != len - 1) {
						if(finalStr.charAt(i) == finalStr.charAt(j + 1)) {
							// lastInd++;
							count++;
						} else {
							System.out.println("Count: " + count + ", " + finalStr.charAt(i));
							temp += String.valueOf(count) + finalStr.charAt(i);
							i = j+1;
							break;
						}
					}
					else {
						System.out.println("Count: " + 1 + ", " + finalStr.charAt(i));
						temp += String.valueOf(count) + finalStr.charAt(i);
						i = len + 1;
						break;
					}
				}


			}

			finalStr = temp;

		}

		System.out.println(finalStr);
		
	} 

}


// 4

// 1,4 - 1

// 1,1 1,4

// 3,1 1,4

// 1,3 2,1 1,4

// 1,1 1,3 1,2 2,1 1,4

// 3,1 1,3 1,1 2,2 2,1 1,4



// A - 80
// B - 60

// BirdA - 
// BirdB - 