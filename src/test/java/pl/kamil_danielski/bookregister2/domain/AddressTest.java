package pl.kamil_danielski.bookregister2.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressTest {

    Address address;

    @Before
    public void setUp() throws Exception {
       address = new Address();
    }

    @Test
    public void getId() {
        Long id = 4L;
        address.setId(id);
        assertEquals(id, address.getId());
    }

    @Test
    public void getCity() {
        String city = "Warsaw";
        address.setCity(city);
        assertEquals(city, address.getCity());
    }

    @Test
    public void getStreet() {
        String street = "Domaniewska";
        address.setStreet(street);
        assertEquals(street, address.getStreet());
    }

    @Test
    public void getStreetNumber() {
        String streetNubmer = "5A";
        address.setStreetNumber(streetNubmer);
        assertEquals(streetNubmer, address.getStreetNumber());
    }

    @Test
    public void getAppartmentNumber() {
        String appartmentNumber = "12";
        address.setAppartmentNumber(appartmentNumber);
        assertEquals(appartmentNumber, address.getAppartmentNumber());
    }

    @Test
    public void getZipCode() {
        String zipCode = "02-198";
        address.setZipCode(zipCode);
        assertEquals(zipCode, address.getZipCode());
    }


}