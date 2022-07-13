<!DOCTYPE html>
<html lang="ru">
<html>
<head>
    <meta charset="UTF-8">
    <title>Учет задолжников</title>
</head>

<body>
<h1>Учет задолжников</h1><hr>
<h4>Реестр документов</h4>

<form action="/document/search" method="get">
    Поиск документа:<br><br>
    <label for="title">Название</label>
    <input type="text" name="title" id="title">
    <br><br>
    <label for="numeral">Номер документа</label>
    <input type="text" name="numeral" id="numeral">
    <br><br>
    <input type="submit" value="Поиск"/>
</form>

<#list documents as document>
    <div>
        <p><b>${document.title}</b> ${document.series} ${document.numeral} | <a href="/document/${document.id}">Подробнее..</a></p>
    </div>
<#else>
    <h3>Документов не найдено</h3>
</#list>
<hr>
<h3>Добавить документ</h3>

<form action="/document/create" method="post">
    Название: <input type="text" name="title"/><br><br>
    Серия: <input type="text" name="series"/><br><br>
    Номер: <input type="number" name="numeral"/><br><br>
    Комментарий: <input type="text" name="description"/><br><br>
    <input type="submit" value="Добавить документ"/>
</form>
<br><br>
<a href="http://localhost:8080/">На главную</a>

</body>

</html>