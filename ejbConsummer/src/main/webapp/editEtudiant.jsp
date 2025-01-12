<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Modifier Étudiant</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(120deg, #89f7fe, #66a6ff);
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .form-container {
            background-color: white;
            border-radius: 8px;
            padding: 20px 30px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            width: 400px;
        }
        .form-container h1 {
            text-align: center;
            margin-bottom: 20px;
            color: #4a90e2;
        }
        .form-container label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
            color: #333;
        }
        .form-container input {
            width: 100%;
            padding: 8px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 16px;
        }
        .form-container button {
            width: 100%;
            padding: 10px;
            background-color: #4a90e2;
            color: white;
            border: none;
            border-radius: 4px;
            font-size: 18px;
            cursor: pointer;
            transition: background-color 0.3s;
        }
        .form-container button:hover {
            background-color: #357ab7;
        }
        .form-container a {
            display: block;
            text-align: center;
            margin-top: 15px;
            color: #4a90e2;
            text-decoration: none;
        }
        .form-container a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<div class="form-container">
    <h1>Modifier Étudiant</h1>
    <form action="updateEtudiant" method="post">
        <input type="hidden" name="id_etudiant" value="${etudiant.id_etudiant}" />
        <label for="nom">Nom:</label>
        <input type="text" name="nom" id="nom" value="${etudiant.nom}" required />
        <label for="prenom">Prénom:</label>
        <input type="text" name="prenom" id="prenom" value="${etudiant.prenom}" required />
        <label for="cne">CNE:</label>
        <input type="text" name="cne" id="cne" value="${etudiant.cne}" required />
        <label for="adresse">Adresse:</label>
        <input type="text" name="adresse" id="adresse" value="${etudiant.adresse}" />
        <label for="niveau">Niveau:</label>
        <input type="text" name="niveau" id="niveau" value="${etudiant.niveau}" />
        <button type="submit">Enregistrer</button>
    </form>
    <a href="listEtudiants">Retour à la liste</a>
</div>
</body>
</html>
