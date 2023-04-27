package org.example.aladin.service;

import org.example.aladin.model.Comment;

import javax.persistence.EntityManager;
import java.util.List;

public class CommentService {

    private EntityManager entityManager;

    public CommentService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void saveComment(Comment comment) {
        entityManager.getTransaction().begin();
        entityManager.persist(comment);
        entityManager.getTransaction().commit();
    }

    public List<Comment> findCommentsByItemId(Long itemId) {
        return entityManager.createQuery("SELECT c FROM Comment c WHERE c.item.id = :itemId ORDER BY c.createdAt DESC", Comment.class)
                .setParameter("itemId", itemId)
                .getResultList();
    }
}

