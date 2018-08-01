package pl.kamil_danielski.bookregister2.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class BookTest {

    Book book;
    @Before
    public void setUp() throws Exception {
        book = new Book();
    }

    @Test
    public void getId() {
        Long id =2L;
        book.setId(id);
        assertEquals(id, book.getId());
    }
    @Test
    public void getTitle() {
        String title = "Gunslinger";
        book.setTitle(title);
        assertEquals(title, book.getTitle());
    }

    @Test
    public void getDescription() {
        String description = "Nice book about guy with two guns";
        book.setDescription(description);
        assertEquals(description, book.getDescription());
    }

    @Test
    public void getAuthors() {
        Author author = new Author();
        author.setId(3L);
        Set<Author> authors = new HashSet<>();
        authors.add(author);
        assertEquals(new Long(3L), authors.iterator().next().getId());
        assertEquals(1, authors.size());
    }

    @Test
    public void getPublisher() {
    }

    @Test
    public void getImage() {
    }
}