<!DOCTYPE html>
<html lang="ru">
<html>
<head>
    <meta charset="UTF-8">
    <title>Учет задолжников</title>
</head>
<body>
    <h4>Подробная информация о документе</h4>
    <b>Название документа: </b>${document.title}<br>
    <b>Комментарий: </b>${document.description}<br>
    <b>Серия: </b>${document.series}<br>
    <b>Номер: </b>${document.numeral}<br>
    <hr>
    <form action="/document/delete/${document.id}" method="post">
        <input type="submit" value="Удалить документ"/>
    </form>
</body>
</html>