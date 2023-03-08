<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajout de vol</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>

</head>
<body>
	<form method="post">
	
	<div class="mb-3">
    <label for="aeroportD" class="form-label">id Aeroport de départ</label>
    <input type="number" class="form-control" id="aeroportD" value="aeroportDepart">  
  </div>
  
  <div class="mb-3">
    <label for="dateD" class="form-label">Date de départ</label>
    <input type="date" class="form-control" id="dateD" value="dateDepart">  
  </div>
  
  <div class="mb-3">
    <label for="heureD" class="form-label">Heure de départ</label>
    <input type="time" class="form-control" id="heureD" value="heureDepart">  
  </div>
  
  
    <div class="mb-3">
    <label for="aeroportA" class="form-label">id Aeroport d'arrivée</label>
    <input type="number" class="form-control" id="aeroportA" value="aeroportArrivee">  
  </div>
  
   <div class="mb-3">
    <label for="dateA" class="form-label">Date d'arrivée</label>
    <input type="date" class="form-control" id="dateA" value="dateArrivee">  
  </div>
  
   <div class="mb-3">
    <label for="heureA" class="form-label">Heure d'arrivée</label>
    <input type="time" class="form-control" id="heureA" value="heureArrivee">  
  </div>
  
  
  <button type="submit" class="btn btn-primary">Valider</button>
  <button type="reset" class="btn btn-primary">Annuler</button>
</form>
</body>
</html>