package fiap.scj.graphqlexample.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import fiap.scj.graphqlexample.models.Book;
import fiap.scj.graphqlexample.repositories.BookRepo;

import java.util.UUID;

public class Mutation implements GraphQLMutationResolver {
    private BookRepo repo;

    public Mutation(BookRepo repo) {
        this.repo = repo;
    }

    public Book writeBook(String title, String category, String author) {
        Book post = new Book(UUID.randomUUID().toString(), title, category, author);
        repo.save(post);
        return post;
    }
}