package org.example.aladin.model;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    private String title;

    private String link;

    private String author;

    private String pubDate;

    private String description;

    private String creator;

    private String isbn;

    private String isbn13;

    private Integer priceSales;

    private Integer priceStandard;

    private String stockStatus;

    private Integer mileage;

    private String cover;

    private Integer categoryId;

    private String categoryName;

    private String publisher;

    private Integer customerReviewRank;

    public Long getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getAuthor() {
        return author;
    }

    public String getPubDate() {
        return pubDate;
    }

    public String getDescription() {
        return description;
    }

    public String getCreator() {
        return creator;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public Integer getPriceSales() {
        return priceSales;
    }

    public Integer getPriceStandard() {
        return priceStandard;
    }

    public String getStockStatus() {
        return stockStatus;
    }

    public Integer getMileage() {
        return mileage;
    }

    public String getCover() {
        return cover;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getPublisher() {
        return publisher;
    }

    public Integer getCustomerReviewRank() {
        return customerReviewRank;
    }
}
