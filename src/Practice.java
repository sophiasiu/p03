
//public class Practice {
	
	
	
	/**
	 * @param MyIntArray arr
	 * @return MyIntArray reversedArray: arr in reversed order
	 * 
	
	 */
	
	// You need to initialize reveredArray so that you can return in in reverseOrder method.
	// You need to add i++ in for loop so that i will increment by one. 
	// You need to first value to last value, etc. so that it will reverse. 
	
//	public static MyIntArray reverseOrder(MyIntArray arr) {		
//		//MyIntArray reversedArray = new MyIntArray(arr.size); // initialize reversedArray
//		
//		for (int i=0; i<arr.size; i++) { //add i++
//			int val = arr.get(i);
//			reversedArray.set(arr.get(arr.size-i),val);
//			
//		}
//		
//		return reversedArray;
//		
//	}
//	
	
	
	/**
	 * @param MyIntArray arr
	 * @return int clumps : the number of clumps found
	 */

	// Set clumps equal to 0 and inClump equal to false (do not want to start as null)
	// For loop needs to start at 1 because you are comparing index 1 to index 0, etc.
 

//	public static int findClumps(MyIntArray arr) {
//		
//		int clumps;
//		Boolean inClump;
//		
//		for (int i=0; i<arr.size; i++) {
//			
//			if (arr.get(i) == arr.get(i-1) && !inClump) {
//				clumps += 1;
//				inClump = true;
//			}
//			
//			if (inClump) {
//				inClump = false;
//			}
//			
//			
//		}
//		
//		return clumps;
//				
//	}
//	
	
	/**
	 * 
	 * @param myString base: the original myString
	 * @param myString remove: the sequence to remove from myString
	 * @return base = base - remove
//	 */


	// You need to make method void because you are not returning anything.
	// You need to create String to equal to base.getContents().replace(remove, "");
	// You need to change contents/remove into getContents/remove.getContents() because this.contents is in another class.

//	public static MyString removeMyString(MyString base, MyString remove) {
//		
//		base.contents.replace(remove, "");
//		System.out.println(base);
//		
//	}
//	
	
	
	/**
	 * @param MyString base
	 * @param char c
	 * @return the number of times c appears in base
	 */
//	public static int countChar(MyString base, char c) {
//			
//			String baseString = base.contents;
//			return countCharHelper(baseString, c, 0);
//		
//	}
//	
//	
//	/**
//	 * @param String baseString
//	 * @param char c
//	 * @param int index
//	 * @return the number of times c appears in base
//	 */
//	public static int countCharHelper(String baseString, char c, int index) {
//		
//		if(baseString.charAt(index) == c){
//			return 1 + countCharHelper(baseString, c, index+1);
//		}
//		
//		return countCharHelper(baseString, c, index+1);
//		
//	}

//}
