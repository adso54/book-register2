package pl.kamil_danielski.bookregister2.domain;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class AuthorTest {

    Author author;

    @Before
    public void setBefore(){
        author = new Author();
    }

    @Test
    public void getId() {
        Long id = 5L;
        author.setId(id);
        assertEquals(id, author.getId());
    }

    @Test
    public void getFirstName() {
        String firstName = "Stephen";
        author.setFirstName(firstName);
        assertEquals(firstName, author.getFirstName());
    }

    @Test
    public void getLastName() {
        String lastName = "King";
        author.setLastName(lastName);
        assertEquals(lastName, author.getLastName());
    }

    @Test
    public void getAge() {
        int age = 76;
        author.setAge(age);
        assertEquals(age, author.getAge());
    }

    @Test
    public void getBirthDate() {
        LocalDate birthDate = LocalDate.parse("1985-12-30");
        author.setBirhDate(birthDate);
        assertEquals(birthDate, author.getBirthDate());
        assertEquals(Period.between(birthDate, LocalDate.now()).getYears(), author.getAge());
    }

    @Test
    public void getBooks() {
        Book book = new Book();
        Long id = 4L;
        book.setId(id);
        Set<Book> books = new HashSet<>();
        books.add(book);
        assertEquals(book.getId(), books.iterator().next().getId());
        assertEquals(1, books.size());
    }
}