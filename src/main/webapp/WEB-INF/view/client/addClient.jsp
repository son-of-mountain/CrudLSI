<%--
  Created by IntelliJ IDEA.
  User: mouaad
  Date: 11/27/24
  Time: 12:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Ajouter un Client</title>
  </head>
  <body>
    <h1>Ajouter un Client</h1>
    <form action="clients" method="post">
      <label for="nom">Nom :</label>
      <input type="text" id="nom" name="nom"><br>

      <label for="email">Email :</label>
      <input type="text" id="email" name="nom"><br>

      <label for="adresse">Adresse : </label>
      <input type="text" id="adresse" name="adresse"><br>
      <button type="submit">Ajouter</button>
    </form>
  
  </body>
</html>
