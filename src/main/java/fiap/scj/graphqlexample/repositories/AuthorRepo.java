package fiap.scj.graphqlexample.repositories;

import fiap.scj.graphqlexample.models.Author;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AuthorRepo {

    private static final List<Author> AUTHOR_COLLECTION = new ArrayList<>();

    static {
        AUTHOR_COLLECTION.add(new Author("1", "Antoine de Saint-Exupéry", "https://www.aliancafrancesa.com.br/wp-content/uploads/2019/06/antoine-de-saint-exupery-2-l.jpg"));
        AUTHOR_COLLECTION.add(new Author("2", "J. R. R. Tolkien", "https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/J._R._R._Tolkien%2C_1940s.jpg/800px-J._R._R._Tolkien%2C_1940s.jpg"));
        AUTHOR_COLLECTION.add(new Author("3", "Graciliano Ramos", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Graciliano_Ramos%2C_1940.tif/lossy-page1-200px-Graciliano_Ramos%2C_1940.tif.jpg"));
    }

    public Optional<Author> getAuthor(String id) {
        return AUTHOR_COLLECTION.stream().filter(author -> id.equals(author.getId())).findFirst();
    }

}
