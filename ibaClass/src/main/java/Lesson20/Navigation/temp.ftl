<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Another one</title>
</head>
<body>
<h1>${header}</h1>
<list>
<#list links as link>
    <li> <a href="${link.href}">${link.name}</a></li>
</#list>
</list>
</body>
</html>