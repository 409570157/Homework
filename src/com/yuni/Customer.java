package com.yuni;

public class Customer {
    int customer;
    int consumption;
    int discount;
    int total;

    public Customer(int customer,int consumption,int discount,int total){
        this.customer = customer;
        this.consumption = consumption;
        this.discount = discount;
        this.total = total;
    }

    public void print(){
        System.out.println(customer +"\t"+consumption+"\t"+discount+"\t"+total);
    }
}
