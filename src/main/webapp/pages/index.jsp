<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="org.example.aladin.service.ItemService" %>
<%@ page import="javax.persistence.*" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Project Name</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
          crossorigin="anonymous">
</head>
<body>
<div class="container my-5">
    <h1>Welcome to Project Name</h1>
    <p class="lead">이 프로젝트는 정말 멋진 기능을 수행합니다.</p>
    <hr>
    <%
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        ItemService itemService = new ItemService(entityManager);
        long count = itemService.countItems();
        entityManager.close();
        entityManagerFactory.close();
    %>
    <h2>Number of Items: <%= count %></h2>
    <a href="./items" class="btn btn-primary">View Item List</a>
</div>
<script src="https://code.jquery.com/jquery-3.6.0.slim.min.js"
        integrity="sha384-OMerDmgZNCKP8wEkJIVQJz0BnyBbz/1rFQyLERLOjBkRvFqz2T8kOnqZR3gT7GRv"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/2.9.3/umd/popper.min.js"
        integrity="sha384-GBThXfPtlQ2AbIWT4k4BMS4aH6f5KM6U5vlnnKPj6S38swi9PJAKaJwHWr+rtkt1"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</body>
</html>
