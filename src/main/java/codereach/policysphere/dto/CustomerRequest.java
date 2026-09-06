package codereach.policysphere.dto;

import lombok.RequiredArgsConstructor;

@Getter
@Setter
@RequiredArgsConstructor

public class CustomerRequest {

    private String name ;
    private String email ;
    private LocalDate dob;
    private String password ;

}
