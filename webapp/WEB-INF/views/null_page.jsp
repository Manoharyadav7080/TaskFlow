<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Error Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            background-color: #f8f9fa;
            padding: 50px;
        }
        h1 {
            font-size: 36px;
            color: #333;
        }
        h2 {
            font-size: 24px;
            color: #666;
        }
        p {
            font-size: 18px;
            color: #888;
        }
        a {
            text-decoration: none;
            color: #007bff;
            font-size: 18px;
            margin: 0 10px;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <h1>Oops! Sorry</h1>
    <h2>Something went wrong !!</h2>
    <p>Sorry, an error has occurred. Requested page not found!</p>
    <br>
    <a href="/springmvcsearch/home.jsp">Take Me Home</a>
    <a href="home.jsp">Contact Support</a>
</body>
</html>