package array;

public class ObjectArrCopy2 {

	public static void main(String[] args) {
		
		//깊은 복사 
		Book[] bookArray3 = new Book[3];
		Book[] bookArray4 = new Book[3];
	
		bookArray3[0] = new Book("HarryPotter1", "J.K.Rolling");
		bookArray3[1] = new Book("HarryPotter2", "J.K.Rolling");
		bookArray3[2] = new Book("HarryPotter3", "J.K.Rolling");

		bookArray4[0] = new Book();
		bookArray4[1] = new Book();
		bookArray4[2] = new Book();
		
		for(int i = 0; i < bookArray3.length; i++) {
			bookArray4[i].setBookName(bookArray3[i].getBookName());
			bookArray4[i].setAuthor(bookArray3[i].getAuthor());
		}
		
		
		bookArray3[0].setAuthor("Blizzard");
		bookArray3[0].setBookName("Diablo");
		// bookArray3의 인스턴스 멤버 값을 바꿔도 bookArray4의 인스턴스 값에는 영향을 주지 않음.
		
		System.out.println("----bookArray3----");
		for(int i = 0; i < bookArray3.length; i++) {
			bookArray3[i].showBookInfo();
		}
		
		System.out.println("----bookArray4----");
		for(int i = 0; i < bookArray4.length; i++) {
			bookArray4[i].showBookInfo();
		}
	}

}
