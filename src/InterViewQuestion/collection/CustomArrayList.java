package InterViewQuestion.collection;

import java.util.ArrayList;

// How to create custom array list where i don't want to allow duplicate element
public class CustomArrayList extends ArrayList<Object> {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		if(this.contains(e)) {
			return false;
		}else {
			return super.add(e);
		}
		
	}

	public static void main(String[] args) {
		
		CustomArrayList arrayList = new CustomArrayList();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(2);
		arrayList.add(3);
		
		System.out.println(arrayList);

	}

}
