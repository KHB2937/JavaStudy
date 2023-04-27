<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ page import="org.example.aladin.model.Item" %>
<%@ page import="org.example.aladin.model.Comment" %>
<%@ page import="org.example.aladin.service.CommentService" %>
<%@ page import="javax.persistence.*" %>
<%@ page import="java.util.List" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Item Detail</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
          crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <div class="my-4">
            <a href="javascript:history.back()" class="btn btn-secondary">&laquo; Back</a>
        </div>
        <h1 class="my-4">Item Detail</h1>
        <table class="table table-bordered">
            <%-- item 객체 가져오기 --%>
            <%
            Object obj = request.getAttribute("item");
                Item item = null;
                if (obj instanceof Item) {
                    item = (Item) obj;
                }
            %>
           <tr>
               <th>Id</th>
               <td><%= item.getItemId() %></td>
           </tr>
           <tr>
               <th>Title</th>
               <td><%= item.getTitle() %></td>
           </tr>
           <tr>
               <th>Description</th>
               <td><%= item.getDescription() %></td>
           </tr>
           <tr>
               <th>Price Sales</th>
               <td><%= item.getPriceSales() %></td>
           </tr>
           <tr>
               <th>Price Standard</th>
               <td><%= item.getPriceStandard() %></td>
           </tr>
           <tr>
               <th>Category</th>
               <td><%= item.getCategoryName() %></td>
           </tr>
           <tr>
               <th>Publisher</th>
               <td><%= item.getPublisher() %></td>
           </tr>
           <tr>
               <th>Author</th>
               <td><%= item.getAuthor() %></td>
           </tr>
           <tr>
               <th>ISBN</th>
               <td><%= item.getIsbn() %></td>
           </tr>
           <tr>
               <th>ISBN13</th>
               <td><%= item.getIsbn13() %></td>
           </tr>
           <tr>
               <th>Stock Status</th>
               <td><%= item.getStockStatus() %></td>
           </tr>
           <tr>
               <th>Pub Date</th>
               <td><%= item.getPubDate() %></td>
           </tr>
           <tr>
               <th>Customer Review Rank</th>
               <td><%= item.getCustomerReviewRank() %></td>
           </tr>
           <tr>
               <th>Mileage</th>
               <td><%= item.getMileage() %></td>
           </tr>
        </table>
       <hr>

           <h2>댓글 목록</h2>

           <% EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPU");
              EntityManager entityManager = entityManagerFactory.createEntityManager();
              CommentService commentService = new CommentService(entityManager);
              List<Comment> comments = commentService.findCommentsByItemId(item.getItemId());

              for (Comment comment : comments) { %>
               <div>
                   <p><%= comment.getContent() %></p>
                   <small><%= comment.getCreatedAt() %></small>
               </div>
           <% } %>

           <hr>

           <h2>댓글 작성</h2>
                <form method="POST" action="../comment">
                    <input type="hidden" name="itemId" value="<%= item.getItemId() %>">
                    <div class="form-group">
                        <textarea class="form-control" name="content" rows="5"></textarea>
                    </div>
                    <button type="submit" class="btn btn-primary">댓글 작성</button>
                </form>

    </div>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
            crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
</body>
</html>