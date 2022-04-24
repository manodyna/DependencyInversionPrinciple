package com.logicalconstant;

import java.util.List;

//When we place the abstraction in the same level as our implementation,
//we're making the component responsible for owning the abstraction
//This detail is what really inverts the dependency between the high-level and low-level modules
public class GoodCustomerService implements CustomerDAO{
    @Override
    public List<Customer> findAll() {
//        complex code to find a list of customers
        return null;
    }
}
