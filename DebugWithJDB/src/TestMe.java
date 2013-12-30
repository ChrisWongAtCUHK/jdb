public class TestMe {
	private int intValue;
	private String stringValue;

	// http://www.javaworld.com/article/2077445/testing-debugging/debug-with-jdb.html
	public static void main(String[] args){
		TestMe testMe = new TestMe();
		testMe.setIntValue(1);
		testMe.setStringValue("test");
		int integer = testMe.getIntValue();
		String string = testMe.getStringValue();
		String toString = testMe.toString();
	}
	
	public TestMe(){
	}
	
	public int getIntValue(){
		return intValue;
	}
	
	public String getStringValue(){
		return stringValue;
	}
	
	public void setIntValue(int value){
		intValue = value;
	}
	
	public void setStringValue(String value){
		stringValue = value;
	}
	
	public String toString(){
		return "String value: " + stringValue + " int value: " + intValue;
	}

}
