<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gestion des Étudiants</title>
    <style>
        body {
            font-family: 'Roboto', sans-serif;
            background: linear-gradient(120deg, #89f7fe, #66a6ff);
            margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            color: #fff;
        }
        .container {
            text-align: center;
            background: rgba(255, 255, 255, 0.1);
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 30px rgba(0, 0, 0, 0.1);
            backdrop-filter: blur(10px);
            -webkit-backdrop-filter: blur(10px);
        }
        .container h1 {
            font-size: 2.5rem;
            margin-bottom: 20px;
        }
        .container p {
            font-size: 1.2rem;
            margin-bottom: 30px;
        }
        .container button {
            padding: 12px 25px;
            margin: 10px;
            font-size: 1rem;
            font-weight: bold;
            border: none;
            border-radius: 50px;
            cursor: pointer;
            transition: all 0.3s ease-in-out;
            text-transform: uppercase;
            letter-spacing: 1px;
        }
        .container button.add {
            background-color: #4CAF50;
            color: white;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        }
        .container button.list {
            background-color: #007BFF;
            color: white;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        }
        .container button:hover {
            transform: scale(1.1);
            box-shadow: 0 6px 12px rgba(0, 0, 0, 0.3);
        }
        footer {
            position: absolute;
            bottom: 10px;
            font-size: 0.9rem;
            color: #ddd;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Bienvenue à l'application de gestion des étudiants</h1>
    <p>Choisissez une action :</p>
    <button class="add" onclick="window.location.href='addEtudiant.jsp'">Ajouter un étudiant</button>
    <button class="list" onclick="window.location.href='listEtudiants'">Voir la liste des étudiants</button>
</div>
<footer>&copy; 2024 Gestion des Étudiants. Tous droits réservés.</footer>
</body>
</html>
