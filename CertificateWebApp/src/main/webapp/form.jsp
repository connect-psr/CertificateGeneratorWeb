<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Online Certificate Generator</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f0f8ff;
            padding: 20px;
        }
        .container {
            max-width: 600px;
            margin: auto;
            background: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 10px #aaa;
        }
        input, select, button {
            width: 100%;
            padding: 10px;
            margin-top: 15px;
            border-radius: 5px;
            border: 1px solid #ccc;
        }
        button {
            background-color: #007bff;
            color: white;
            font-weight: bold;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Online Certificate Generator</h2>
    <form action="CertificateServlet" method="post">
        <label for="name">Recipient Name:</label>
        <input type="text" id="name" name="name" required>

        <label for="email">Recipient Email:</label>
        <input type="email" id="email" name="email" required>

        <label for="course">Course/Topic:</label>
        <input type="text" id="course" name="course" required>

        <label for="date">Date:</label>
        <input type="date" id="date" name="date" required>

        <label for="issuer">Issued By:</label>
        <input type="text" id="issuer" name="issuer" required>

        <label for="signature">Signature Name:</label>
        <input type="text" id="signature" name="signature" required>

        <button type="submit">Generate & Send Certificate</button>
    </form>
</div>
</body>
</html>
