
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8">

    <title>${requestScope.page5.title}</title>

    <style>
        body {
            background-image: url("/view/pages.jpg");
            background-repeat: no-repeat;
            background-size: cover;
        }

        .tab {
            margin-left: 150px;
            margin-right: 200px;
        }

        .text-center {
            font-size: 3rem;
            color: #d00000;
        }
    </style>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
</head>
<body>

<h2 class="tab" align="justify"> <pre> ${requestScope.page5.text} </pre> </h2>

<h1 class="text-center" >Поздравляю! Всё хорошо закончилось!</h1> <br>
<a class="text-center" href="index.jsp">Вернуться в начало</a>

<br>
<br>

<div class="dropdown">
    <button class="btn btn-info dropdown-toggle" data-toggle="dropdown">Статистика <span class="caret"></span></button>
    <ul class="dropdown-menu">
        <li class="disabled"><a href="#">Имя: <%= session.getAttribute("name") %> </a></li>
        <li class="disabled"><a href="#">Расположение: <%= session.getAttribute("5title") %> </a></li>
        <li class="disabled"><a href="#">Плохих концовок: <%= session.getAttribute("badEndings") %> </a></li>
    </ul>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>


</body>
</html>
