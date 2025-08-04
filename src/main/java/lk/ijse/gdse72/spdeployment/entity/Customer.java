package lk.ijse.gdse72.spdeployment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
public class Customer {
    @Id
    private int id;
    private String name;
    private String address;
    private String phone;

}
