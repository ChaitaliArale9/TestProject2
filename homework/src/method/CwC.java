package method;

public class CwC {
	int a=10,b=5,result;
	public void doPublic() {
		result=a+b;
		  System.out.println(result);

	}
	
	 void doDefault() {
			result=a+b;
			  System.out.println(result);


	 }
	 
	 protected void doProtected() {
			result=a+b;
			  System.out.println(result);

	 }
	 
	 private void doPrivate() {
			result=a+b;
  System.out.println(result);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          CwC obj= new CwC();
          obj.doDefault();
          obj.doPrivate();
          obj.doProtected();
          obj.doPublic();
	}

}
