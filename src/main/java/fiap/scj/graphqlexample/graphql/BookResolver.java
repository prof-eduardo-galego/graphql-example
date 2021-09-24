package fiap.scj.graphqlexample.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import fiap.scj.graphqlexample.models.Author;
import fiap.scj.graphqlexample.models.Book;
import fiap.scj.graphqlexample.repositories.AuthorRepo;

public class BookResolver implements GraphQLResolver<Book> {
    private AuthorRepo authorRepo;

    public BookResolver(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    public Author getAuthor(Book book) {
        return authorRepo.getAuthor(book.getAuthorId()).orElseThrow(RuntimeException::new);
    }
}
