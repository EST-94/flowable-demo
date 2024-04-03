package example.model;

public class Article {

    public String id;
    public String author;
    public String url;

    public Article(String id, String author, String url) {
        this.id = id;
        this.author = author;
        this.url = url;
    }

    public String getAuthor() {
        return author;
    }

    public String getUrl() {
        return url;
    }
}
