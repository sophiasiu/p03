
public class Test {
	
	
	public static MyIntArray reverseOrder(MyIntArray arr) {
		
		MyIntArray reversedArray = new MyIntArray(arr.size); // initialize reversedArray
		
		
		for (int i = 0; i < arr.size ; i++) {
		    int val = arr.get(i);
		    reversedArray.set(i,arr.get(arr.size-1-i));
		    reversedArray.set(arr.size-1-i,val);
		   
		}
		
//		for (int i = 0; i<reversedArray.size; i++) {
//			System.out.print(reversedArray.get(i));
//		}

		return reversedArray;
		
	}
	
	
	public static int findClumps(MyIntArray arr) {
	
		int clumps = 0;
		Boolean inClump = false;
		
		
		for (int i=1; i<arr.size; i++) {
			
			if (arr.get(i) == arr.get(i-1) ) {
				if(!inClump) {
					clumps ++;
					inClump = true;
				}
			
			}else {
			
				inClump = false;
			}
			
		}
		
		
		return clumps;
			
	}
	
	
	public static void removeMyString(MyString base, MyString remove) {
		
				
		String s = base.getContents().replace(remove.getContents(), ""); //heo world
		
		System.out.println(s);
		
	
	}
	
	public static int countChar(MyString base, char c) {
		
		String baseString = base.getContents();
		return countCharHelper(baseString, c, 0);
	
	}
	
	
	
	public static int countCharHelper(String baseString, char c, int index) {
		
		if(baseString.length() <= index) {
			return 0;
		}
		
		if(baseString.charAt(index) == c){
			return 1 + countCharHelper(baseString, c, index+1);
		}
		
		
		
		return countCharHelper(baseString, c, index+1);
		
	}

	public static void main(String[] args) {
		
		int[] array = {1,1,2,1,1,1};
	
		MyIntArray x = new MyIntArray(array.length);
		 
		
		x.set(0, array[0]);
		x.set(1, array[1]);
		x.set(2, array[2]);
		x.set(3, array[3]);
		x.set(4, array[4]);
		x.set(5, array[5]);

		
				
//		x = reverseOrder(x); 
		

		
//		for (int i = 0; i<x.size; i++) {
//			System.out.print(x.get(i));
//		}
		
		//System.out.print(findClumps(x));
		
//		MyString word = new MyString("hello world");
//		MyString removeW = new MyString("o");
		
		//removeMyString(word,removeW);
		
		MyString word2 = new MyString("ABABABabababa");
		char z = 'a';
		
		//int m = countChar(word2,z);
		System.out.print(countChar(word2,z));
				
		
	}

}
