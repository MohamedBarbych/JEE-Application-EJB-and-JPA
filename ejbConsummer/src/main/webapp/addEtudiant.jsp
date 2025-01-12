<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ajouter un Étudiant</title>
    <style>
        body {
            font-family: 'Roboto', sans-serif;
            background: linear-gradient(135deg, #ff9a9e, #fad0c4);
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            color: #333;
        }
        .form-container {
            background: rgba(255, 255, 255, 0.8);
            padding: 40px 30px;
            border-radius: 10px;
            box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);
            width: 100%;
            max-width: 400px;
            text-align: center;
        }
        .form-container h1 {
            margin-bottom: 20px;
            color: #4CAF50;
            font-size: 24px;
        }
        .form-container label {
            display: block;
            margin: 10px 0 5px;
            text-align: left;
            font-weight: bold;
        }
        .form-container input {
            width: calc(100% - 20px);
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ddd;
            border-radius: 5px;
            font-size: 16px;
            box-sizing: border-box;
        }
        .form-container button {
            padding: 12px 20px;
            background: #4CAF50;
            color: #fff;
            font-size: 16px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            width: 100%;
            transition: all 0.3s ease-in-out;
        }
        .form-container button:hover {
            background: #43a047;
            transform: scale(1.05);
        }
        .form-container a {
            display: inline-block;
            margin-top: 15px;
            color: #007BFF;
            text-decoration: none;
        }
        .form-container a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<div class="form-container">
    <h1>Ajouter un Étudiant</h1>
    <form action="addEtudiant" method="post">
        <label for="nom">Nom :</label>
        <input type="text" name="nom" id="nom" placeholder="Entrez le nom" required>
        <label for="prenom">Prénom :</label>
        <input type="text" name="prenom" id="prenom" placeholder="Entrez le prénom" required>
        <label for="cne">CNE :</label>
        <input type="text" name="cne" id="cne" placeholder="Entrez le CNE" required>
        <label for="adresse">Adresse :</label>
        <input type="text" name="adresse" id="adresse" placeholder="Entrez l'adresse" required>
        <label for="niveau">Niveau :</label>
        <input type="text" name="niveau" id="niveau" placeholder="Entrez le niveau" required>
        <button type="submit">Ajouter</button>
        <a href="listEtudiants">Retour à la liste des étudiants</a>
    </form>
</div>
</body>
</html>
