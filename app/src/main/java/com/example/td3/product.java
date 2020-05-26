package com.example.td3;

import java.util.List;

public class product {

    private Integer id;
    private String brand;
    private String name;
    private String price;
    private String price_sign;
    private String currency;
    private String image_link;
    private String product_link;
    private String website_link;
    private String description;
    private Integer rating;
    private String category;
    private String product_type;
    private List<tag> tag_list;
    private List<ProductColor> product_colours;
    private String api_featured_image;
    private String created_at;
    private String updated_at;
    private String product_api_url;

    public Integer getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getPrice_sign() {
        return price_sign;
    }

    public String getCurrency() {
        return currency;
    }

    public String getImage_link() {
        return image_link;
    }

    public String getProduct_link() {
        return product_link;
    }

    public String getWebsite_link() {
        return website_link;
    }

    public String getDescription() {
        return description;
    }

    public Integer getRating() {
        return rating;
    }

    public String getCategory() {
        return category;
    }

    public String getProduct_type() {
        return product_type;
    }

    public List<tag> getTag_list() {
        return tag_list;
    }

    public List<ProductColor> getProduct_colours() {
        return product_colours;
    }

    public String getApi_featured_image() {
        return api_featured_image;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public String getProduct_api_url() {
        return product_api_url;
    }
}
