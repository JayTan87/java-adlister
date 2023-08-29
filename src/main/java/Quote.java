import java.io.Serializable;

public class Quote implements Serializable {
    private String content;
    private String author;

    public Quote() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
