<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Liste des Étudiants</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(120deg, #ff9a9e, #fad0c4);
            margin: 0;
            padding: 20px;
        }
        h1 {
            text-align: center;
            color: #4a4a4a;
            margin-bottom: 20px;
        }
        table {
            width: 90%;
            margin: 0 auto;
            border-collapse: collapse;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        }
        table th, table td {
            border: 1px solid #ddd;
            padding: 10px;
            text-align: center;
        }
        table th {
            background-color: #4a90e2;
            color: white;
            font-size: 16px;
        }
        table tr:nth-child(even) {
            background-color: #f9f9f9;
        }
        table tr:hover {
            background-color: #f1f1f1;
        }
        table td a {
            text-decoration: none;
            color: #4a90e2;
            font-weight: bold;
            padding: 5px 10px;
            border: 1px solid #4a90e2;
            border-radius: 4px;
            transition: background-color 0.3s, color 0.3s;
        }
        table td a:hover {
            background-color: #4a90e2;
            color: white;
        }
        .add-btn {
            display: block;
            width: 200px;
            margin: 20px auto;
            padding: 10px;
            text-align: center;
            background-color: #4a90e2;
            color: white;
            font-size: 16px;
            text-decoration: none;
            border-radius: 4px;
            transition: background-color 0.3s;
        }
        .add-btn:hover {
            background-color: #357ab7;
        }
    </style>
</head>
<body>
<h1>Liste des Étudiants</h1>
<table>
    <tr>
        <th>ID</th>
        <th>Nom</th>
        <th>Prénom</th>
        <th>CNE</th>
        <th>Adresse</th>
        <th>Niveau</th>
        <th>Actions</th>
    </tr>
    <c:forEach var="etudiant" items="${etudiants}">
        <tr>
            <td>${etudiant.id_etudiant}</td>
            <td>${etudiant.nom}</td>
            <td>${etudiant.prenom}</td>
            <td>${etudiant.cne}</td>
            <td>${etudiant.adresse}</td>
            <td>${etudiant.niveau}</td>
            <td>
                <a href="deleteEtudiant?id_etudiant=${etudiant.id_etudiant}">Supprimer</a>
                <a href="updateEtudiant?id_etudiant=${etudiant.id_etudiant}">Modifier</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a class="add-btn" href="addEtudiant.jsp">Ajouter un nouvel étudiant</a>
</body>
</html>
