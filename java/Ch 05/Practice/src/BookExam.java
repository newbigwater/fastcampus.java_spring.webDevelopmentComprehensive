public class BookExam {
    public static void main(String[] args) {
        // Q1 : Book 자료형을 이용하여 책 정보를 정하고 출력
        Book b = new Book();
        b.title   = "C++";
        b.price   = 321321;
        b.company = "FastCampus";
        b.author  = "NBE";
        b.page    = 2000;
        b.isbn    = "ISBN-987654321";
        System.out.println(b.getInformation());
    }
}
