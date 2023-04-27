package org.example.aladin.service;

import org.example.aladin.model.Item;

import javax.persistence.*;
import java.util.List;

public class ItemService {
    private final EntityManager entityManager;

    public ItemService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public long countItems() {
        TypedQuery<Long> query = entityManager.createQuery("SELECT COUNT(i) FROM Item i", Long.class);
        return query.getSingleResult();
    }

    public List<Item> findItemsByPage(int page, int size) {
        TypedQuery<Item> query = entityManager.createQuery("SELECT i FROM Item i", Item.class);
        query.setFirstResult((page - 1) * size);
        query.setMaxResults(size);
        return query.getResultList();
    }

    public Item findItemById(Long id) {
        TypedQuery<Item> query = entityManager.createQuery("SELECT i FROM Item i WHERE i.id = :id", Item.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }
}
