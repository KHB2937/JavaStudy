<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="org.example.aladin.model.Item" %>

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