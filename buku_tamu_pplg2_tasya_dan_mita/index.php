
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BukuTamu</title>
    <style>
    </style>
</head>
<style>
    html {
        text-align: center;
        font-family: Arial;
        color: black;
    }
    body{
     background: url("background.jpg");
     background-size:100%;
    }
</style>
<body>
<div class="text">
    <h1>
            GELAR KARYA SMKN 1 SAYUNG
        </h1>
        <img src="logo1.png">
    </div>
    <div class="container">
        <img src="#" alt="smkn1sayung">
        <p>SILAHKAN MENDAFTAR DAN MELIHAT DAFTAR 
            <br>DI BAWAH 
        </p>
    <a href="form-daftar.php">
        <button class="btn fourth">Daftar</button>
    </a>
    <a href="list-tamu.php">
        <button class="btn fourth">Lihat Daftar</button>
    </a>
    <?php if(isset($_GET['status'])): ?>
    <p>
        <?php
            if($_GET['status'] = 'sukses'){
                echo "Pendaftaran siswa baru berhasil!";
            } else {
                echo "Pendaftaran gagal!";
            }
        ?>
    </p>
    <?php endif; ?>
</div>
</body>
</html>