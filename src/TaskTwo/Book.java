package TaskTwo;

public class Book {

    public static void main(String[] arg) {
        Title title = new Title();
        title.sow();

        Author author = new Author();
        author.show();

        Content content1 = new Content();
        String s = content1.getContent();
        System.out.println(s);

    }
}
