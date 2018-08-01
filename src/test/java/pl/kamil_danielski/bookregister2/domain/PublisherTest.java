package pl.kamil_danielski.bookregister2.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PublisherTest {

    Publisher publisher;

    @Before
    public void setUp() throws Exception {
        publisher = new Publisher();
    }

    @Test
    public void getId() {
        Long id = 3L;
        publisher.setId(id);
        assertEquals(id, publisher.getId());
    }

    @Test
    public void getName() {
        String name = "Helion";
        publisher.setName(name);
        assertEquals(name, publisher.getName());
    }

    @Test
    public void getAddress() {
        Address address = new Address();
        address.setId(7L);
        publisher.setAddress(address);
        assertEquals(new Long(7L), publisher.getAddress().getId());
    }

    @Test
    public void getEmail() {
        String email = "xxx.yyy@something.pl";
        publisher.setEmail(email);
        assertEquals(email, publisher.getEmail());
    }

    @Test
    public void getPhoneNumber() {
        String phoneNumber = "111 333 222";
        publisher.setPhoneNumber(phoneNumber);
        assertEquals(phoneNumber, publisher.getPhoneNumber());
    }
}