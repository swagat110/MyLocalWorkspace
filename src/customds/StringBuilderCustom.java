package customds;


public class StringBuilderCustom {
	
	//to store strings as characters
	private char[] array;
	//current length of the array
	private int length;

	private static final int INITIAL_CAPACITY = 10;
	
	//Constructors
	public StringBuilderCustom() {
		
		this.array = new char[INITIAL_CAPACITY];
		this.length = 0;
	}
	
	public StringBuilderCustom(String str) {
		
		this.array = str.toCharArray();
		this.length = str.length();
	}
	
	public StringBuilderCustom(char[] str) {
		
		this.array = str;
		this.length = str.length;
	}
	
	//append
	public void append(String str) {
		
		while(increaseSizeRequired(str)) {
			increaseSize(str);
		}
		
		System.arraycopy(str.toCharArray(), 0, this.array, length, str.length());
		length = length + str.length();
	}
	
	private void increaseSize(String str) {
		// TODO Auto-generated method stub
		char[] tmp = new char[this.array.length*2];
		System.arraycopy(this.array, 0, tmp, 0, length);
		this.array = tmp;
		
	}

	private boolean increaseSizeRequired(String str) {
		// TODO Auto-generated method stub
		return(length+str.length()>this.array.length);
		
	}

	public void delete(int start, int end) {
		if(start == end)
			return;
		if(end > length)
			end = length-1;
		char[] tmp = new char[this.array.length];
		System.arraycopy(this.array, 0, tmp, 0, start);//exclude start index
		if(!(end==length-1))//2nd part of copy is not needed if end element is being deleted
			System.arraycopy(this.array, end+1, tmp, start, length-end); // exclude end index
		length = length - (end-start+1);
		this.array = tmp;	
		
	}
	
	@Override
	public String toString() {
		return new String(this.array,0,length);
	}
	
	

}
