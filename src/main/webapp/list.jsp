<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.example.aladin.model.Item" %>
<%@ page import="java.util.List" %>

<html>
<head>
    <title>Item List</title>
    <!-- Bootstrap 추가 -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
        integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
        crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
    <div class="container">
        <h1>Item List</h1>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Item Id</th>
                    <th>Title</th>
                    <th>Author</th>
                </tr>
            </thead>
            <tbody>
                <% for (Item item : (List<Item>) request.getAttribute("items")) { %>
                <tr>
                    <td><%= item.getItemId() %></td>
                    <td><%= item.getTitle() %></td>
                    <td><%= item.getAuthor() %></td>
                    <td><a href="items/<%= item.getItemId() %>">Detail</a></td> <!-- 개별 아이템 페이지 링크 추가 -->
                </tr>
                <% } %>
            </tbody>
        </table>
        <p>
            <% int currentPage = (int) request.getAttribute("currentPage"); %>
            <% int totalPages = (int) request.getAttribute("totalPages"); %>

        <% if (currentPage > 1) { %>
        <a href="?page=<%= currentPage - 1 %>" class="btn btn-primary">Prev</a>
        <% } else { %>
        <span class="btn btn-primary disabled">Prev</span>
        <% } %>

        <% for (int i = 1; i <= totalPages; i++) { %>
        <% if (currentPage == i) { %>
        <span class="btn btn-primary"><%= i %></span>
        <% } else { %>
        <a href="?page=<%= i %>" class="btn btn-default"><%= i %></a>
        <% } %>
        <% } %>

        <% if (currentPage < totalPages) { %>
        <a href="?page=<%= currentPage + 1 %>" class="btn btn-primary">Next</a>
        <% } else { %>
        <span class="btn btn-primary disabled">Next</span>
        <% } %>
    </p>
</div>

</body>
</html>