package com.logicalconstant;

import java.util.List;

//This is our high level module
public class CustomerService{
    private CustomerDAO customerDAO;

    //    standard getters and setters
    public List<Customer> findAll() {
        return customerDAO.findAll();
    }

}
