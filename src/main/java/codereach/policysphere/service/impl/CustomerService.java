package codereach.policysphere.service.impl;

import codereach.policysphere.dto.CustomerRequest;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
   public CustomerRepository customerRepo;
    public CustomerService(CustomerRepo customerRepo){

        this.customerRepo =
                CustomerRepo;


    }

    customerRepo.saveCustomer(CustomerRequest cr);

}
