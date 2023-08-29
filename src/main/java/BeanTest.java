import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Album stuff = new Album();
        Album thangs = new Album();
        Album words = new Album();
        Author friend = new Author();
        Author buddy = new Author();
        Author guy = new Author();
        Quote somethin = new Quote();
        Quote speech = new Quote();
        Quote yes = new Quote();

        somethin.setAuthor("bob");
        somethin.setContent("somethin");

        speech.setAuthor("joe");
        speech.setContent("speech");

        yes.setAuthor("dave");
        yes.setContent("yes");

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(somethin);
        quotes.add(speech);
        quotes.add(yes);

        for(Quote quote : quotes){
            System.out.println(quote.getAuthor());
            System.out.println(quote.getContent());
        }
    }
}
