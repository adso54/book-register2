package pl.kamil_danielski.bookregister2.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;

    @OneToOne(fetch = FetchType.EAGER)
    private Address address;
    private String email;
    private String phoneNumber;

}
