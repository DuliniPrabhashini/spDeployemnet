package lk.ijse.gdse72.spdeployment.repo;

import lk.ijse.gdse72.spdeployment.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    boolean existsById(int id);
}