package org.example.aladin.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    @Column(nullable = false, length = 2000)
    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, name = "created_at") // createdAt 필드에 대응하는 컬럼 지정
    private Date createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}

/*
* CREATE TABLE comments (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    item_id BIGINT NOT NULL,
    content VARCHAR(2000) NOT NULL,
    created_at DATETIME NOT NULL
);
*/