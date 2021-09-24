package fiap.scj.graphqlexample.models;

public class Book {

    private String id;
    private String title;
    private String category;
    private String authorId;

    public Book(String id, String title, String category, String authorId) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.authorId = authorId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

}
