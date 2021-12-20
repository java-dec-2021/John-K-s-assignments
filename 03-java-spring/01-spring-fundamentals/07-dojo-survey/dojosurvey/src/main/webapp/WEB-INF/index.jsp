<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
  <body>
        <form action="/survey" method = "POST">
            <p>Your name: <input type = "text" name = "firstName"></p>
            <p>Your Dojo: 
                <select name = "location">
                    <option value = "New York">New York</option>
                    <option value = "Burbank">Burbank</option>
                    <option value = "Orlando">Orlando</option>
                    <option value = "Online">Online</option>
                </select>
            </p>
            <p>Favorite language: 
                <select name = "language">
                    <option value = "Java">Java</option>
                    <option value = "Python">Python</option>
                    <option value = "HTML">HTML</option>
                    <option value = "English">English</option>
                </select>
            </p>
            <p>Comment: </p>
            <p><textarea name = "comment" rows = "4" cols = "50"></textarea></p>
            <p><button>Submit</button> </p>
        </form>
    </body>
</html>