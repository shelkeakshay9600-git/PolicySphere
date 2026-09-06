package codereach.policysphere.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity

@Getter
@Setter
@RequiredArgsConstructor


public class Customer {

    @id
    private Long id;

    private String name;
    private String email;
    private LocalDate dob;


}


