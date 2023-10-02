<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="ru.javarush.ivanov.quest.service.PageService" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">

    <title>It Came from the Internet</title>

    <style>

        .tab {
            text-indent: 1.5em;
            margin-left: 70px;
            margin-right: 70px;
            color: #ffffff;
        }

        body {
            background-image: url("/view/prologue.jpg");
            background-repeat: no-repeat;
            background-size: cover;
        }

        label {
            font-size: 2.0rem;
            color: #ffffff;
        }

        .title {
            margin-left: 70px;
            font-size: 3rem;
            color: #ffffff;
            background-color: #330101;
        }

        .start {
            margin-left: 70px;
            margin-right: 200px;
            font-size: 3rem;
        }

    </style>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
</head>
<body>

<br>
<br>
<br>
<br>


<a class="title">Он явился из Интернета</a>

<h2 class="tab" align="justify">
    Берегись, читатель! Как только начнешь квест, никто тебе не поможет!
    Хватай вирус! На мониторе появилось странное сообщение. В нём говорится, что в твоём компьютере вирус. И если ты не
    избавишься от него, то сам заразишься!
    Будь осторожнее! Этот браузер живой. И если вылезет из монитора, то вопьётся прямо тебе в шею.
    К тому же он стирает память! Сможешь избавиться от него, пока не забыл, что с тобой? Доверишься ли ты
    девочке–хакеру? Уж она–то непременно увлечет тебя в виртуальное приключение…

    Следуй инструкциям в конце каждой страницы. И делай выбор. Если твой выбор будет удачным — вернешься домой целым и
    невредимым. Но если примешь неверное решение — БЕРЕГИСЬ!
</h2>

<br>
<br>

<form class="form-horizontal" action="/prologue-servlet" method="post">
    <fieldset>
        <div class="form-group">
            <label class="col-md-4 control-label" for="name">Введи свое имя:</label>
            <div class="col-md-4">
                <input id="name" name="name" type="text" placeholder="Имя" class="form-control input-md">
            </div>
        </div>
    </fieldset>
</form>

<div>
    <h1 class="start"><a href="page1-servlet" style="background-color: #ffffff; color: #d00000;">Начать квест</a></h1>
</div>


<% PageService.badEndings = 0; %>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
        integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
        crossorigin="anonymous"></script>


</body>
</html>
