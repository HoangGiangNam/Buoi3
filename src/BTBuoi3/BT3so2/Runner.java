package BTBuoi3.BT3so2;

public class Runner {
    public static void main(String[] args) {
        Author author=new Author("Hoang Nam","Giang0@gmail.com",'m');
        Book book=new Book("Những chiếc thuyền",author,500000,3);

        System.out.println(author);
        System.out.println(book);
    }
}
