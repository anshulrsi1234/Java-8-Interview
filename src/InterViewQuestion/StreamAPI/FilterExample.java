package InterViewQuestion.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Program to filter  
public class FilterExample {
	
	public static void main(String[] args) {
		
		List<Book> list = Arrays.asList(new Book("11","Java7","Anshul"),new Book("12","AWS","james"),new Book("13","Java8","Arun"));

		List<String > bookList = list.stream().filter(i -> i.getBookAuthor().equals("james")).map(Book::getBookId).collect(Collectors.toList());

		System.out.println(" >>>> bookList <<<<<<  " + bookList);
		
		//=== Filter out the even number from the list
		List<Integer> numInteger = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> evenList = numInteger.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println("even Number is  >>>>> " + evenList);
		
		List<Book> bookList_ = list.stream().sorted(Comparator.comparing(Book::getBookname).thenComparing(Book::getBookAuthor)).collect(Collectors.toList());
		System.out.println("Sorted value is  ---> ");
		
		bookList_.forEach(emp -> {
			System.out.println(emp.getBookname() +"----- " + emp.getBookAuthor());
		});
		
	}		

}
	
	class Book{

		private String bookId;

		private String bookname;

		private String bookAuthor;

		public Book(String bookId, String bookname, String bookAuthor) {
			super();
			this.bookId = bookId;
			this.bookname = bookname;
			this.bookAuthor = bookAuthor;
		}

		public String getBookId() {
			return bookId;
		}

		public void setBookId(String bookId) {
			this.bookId = bookId;
		}

		public String getBookname() {
			return bookname;
		}

		public void setBookname(String bookname) {
			this.bookname = bookname;
		}

		public String getBookAuthor() {
			return bookAuthor;
		}

		public void setBookAuthor(String bookAuthor) {
			this.bookAuthor = bookAuthor;
		}
	}
	

