import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Album album = new Album();
        Album album2 = new Album();
        Album album3 = new Album();

        Quote quote = new Quote();
        quote.setContent("I love deadlines. I love the whooshing noise they make as they go by.");
        quote.setAuthor("Douglas Adams");

        Quote quote2 = new Quote();
        quote2.setContent("The universe is a big place, perhaps the biggest.");
        quote2.setAuthor("Kurt Vonnegut");

        Quote quote3 = new Quote();
        quote3.setContent("Clothes make the man. Naked people have little or no influence on society.");
        quote3.setAuthor("Mark Twain");

        Author author = new Author();
        Author author2 = new Author();
        Author author3 = new Author();

        ArrayList<Quote> quotesArray = new ArrayList<>();
        quotesArray.add(quote);
        quotesArray.add(quote2);
        quotesArray.add(quote3);

        for (Quote quoted : quotesArray) {
            System.out.println(quoted.getAuthor());
            System.out.println(quoted.getContent());
            System.out.println("--------------------");
        }
    }
}
