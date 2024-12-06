package org.sid.billingservice.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;
import org.sid.customerservice.entities.Customer;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;


public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billDate;
    private Long customerId;
    @OneToMany(mappedBy = "bill")
    private List<ProductItem> productItems;
    @Transient
    private Customer customer;

    public void setCustomer(org.sid.billingservice.model.Customer customerById) {
    }

    public Iterable<Object> getProductItems() {
    }

    public Long getCustomerId() {
    }
}
