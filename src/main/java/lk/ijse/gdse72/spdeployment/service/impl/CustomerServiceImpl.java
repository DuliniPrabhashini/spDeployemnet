package lk.ijse.gdse72.spdeployment.service.impl;

import lk.ijse.gdse72.spdeployment.dto.CustomerDto;
import lk.ijse.gdse72.spdeployment.entity.Customer;
import lk.ijse.gdse72.spdeployment.repo.CustomerRepository;
import lk.ijse.gdse72.spdeployment.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void saveCustomer(CustomerDto customerDto) {
        if (customerRepository.existsById(customerDto.getId())) {
            throw new RuntimeException("Customer already exists with ID: " + customerDto.getId());
        }

        // Manual conversion from DTO to Entity
        Customer customer = new Customer();
        customer.setId(customerDto.getId());
        customer.setName(customerDto.getName());
        customer.setAddress(customerDto.getAddress());
        customer.setPhone(customerDto.getPhone());

        customerRepository.save(customer);
    }
}