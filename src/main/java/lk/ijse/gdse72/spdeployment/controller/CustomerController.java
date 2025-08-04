package lk.ijse.gdse72.spdeployment.controller;

import lk.ijse.gdse72.spdeployment.dto.CustomerDto;
import lk.ijse.gdse72.spdeployment.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public String getCustomer() {
        return "Customer 1";
    }

    @PostMapping
    public ResponseEntity<String> saveCustomer(@RequestBody CustomerDto customerDto) {
        try {
            customerService.saveCustomer(customerDto);
            return new ResponseEntity<>("Customer Saved", HttpStatus.CREATED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
