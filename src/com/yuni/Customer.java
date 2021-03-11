package com.yuni;

public class Customer {
    String customer;
    int consumption;
    int discount;
    int total;

    public Customer(String customer,int consumption,int discount,int total){
        this.customer = customer;
        this.consumption = consumption;
        this.discount = discount;
        this.total = total;
    }

    public void print(){
        if (discount < 100) {

            System.out.println(customer + "\t" + consumption + "\t" +"\t"+ discount + "\t" + total);
        }else{
            System.out.println(customer + "\t" + consumption + "\t" + discount + "\t" + total);
        }
        }
    }

