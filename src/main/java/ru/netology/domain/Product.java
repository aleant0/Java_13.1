package ru.netology.domain;

import ru.netology.repository.ProductRepository;

public class Product {
    protected int id;
    protected String name;
    protected int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public boolean matches(String search) {
        return getName().contains(search);
    }
}
