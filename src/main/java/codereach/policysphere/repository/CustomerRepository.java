import codereach.policysphere.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Long, Customer> {


    private CustomerRepository customRepo ;

    customRepo.findByEmail(String email);



}

