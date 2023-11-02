package org.example;

import java.util.ArrayList;

public class Warehouse {
    private int id;
    private String location;
    private ArrayList<Product>products;

    public Warehouse(int id, String location) {
        this.id = id;
        this.location = location;

        products = new ArrayList<>;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Adds a product to the warehouse stock
     *
     * @param product The product to add to the warehouse stock
     */
    public void addProduct(Product product){
    products.add(product);
    }

    /**
     * Removes one product with the specified id
     * @param id The product id to remove
     */
    public void removeProductById(int id){
        for (int i = 0; i < products.size() ; i++) {
            Product product = products.get(i);
        }
    }

    public void listAllProducts(){
        for (var product:products) {
            System.out.println(product);
            
        }
    }
}
