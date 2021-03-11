package com.yuni;

public class List{
        public static void main(String[] args) {
                Customer[] customers = {
                        new Customer(13,490,0,490),
                        new Customer(52,1000,100,900),
                        new Customer(81,290,0, 290),
                        new Customer(2122, 2000, 200, 1800)
                };
                for (int i = 0; i <customers.length; i++) {
                        customers[i].print();
                }







}}
