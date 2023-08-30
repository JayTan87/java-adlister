import models.Album;
import models.Author;
import models.Quote;

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

        friend.setFirstName("bob");
        friend.setLastName("hill");
        stuff.setArtist("bob");
        somethin.setAuthor(friend);
        somethin.setContent("somethin");

        buddy.setFirstName("joe");
        buddy.setLastName("momma");
        thangs.setArtist("joe");
        speech.setAuthor(buddy);
        speech.setContent("speech");

        guy.setFirstName("dave");
        guy.setLastName("davidson");
        words.setArtist("dave");
        yes.setContent("yes");
        yes.setAuthor(guy);


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
