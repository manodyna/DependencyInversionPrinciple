package com.logicalconstant;

import java.util.List;

//This is the type of abstraction that is CustomerService uses for consuming the low-level component
public interface CustomerDAO {
    public List<Customer> findAll();
}
