package pl.kamil_danielski.bookregister2.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String city;
    private String street;
    private String streetNumber;
    private String appartmentNumber;
    private String zipCode;
}
