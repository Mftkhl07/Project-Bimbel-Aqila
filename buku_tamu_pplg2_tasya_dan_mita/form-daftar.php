<!DOCTYPE html>
<html lang="en">
<head>
    
    <title>BukuTamu</title>
    <style>
         body {
            background: url("background.jpg");
            text-align: center;
            background-size:100%
        }
   
        h1{
            color: white;
        }
    </style>
</head>
<body>
    <img src="logo1.png" alt="logo">
    <h1 style="font-family: verdana;">
    PENDAFTRAN BUKU TAMU <br>SMKN 1 SAYUNG
    </h1>
    <a href="list-tamu.php">
        <button style="float: right;";>Lihat Tamu</button>
    </a>
    <form action="proses-pendaftaran.php" method="POST" style="text-align: center;">
        <input style="margin-left: 5rem;" type="text" placeholder="Nama" name="nama"> <br>
        <input type="text" placeholder="Alamat" name="alamat"> <br>
        <input type="text" placeholder="Asal Instansi" name="asal_instansi"> <br>
        <input type="text" name="pesan_dan_kesan" placeholder="Pesan Dan Kesan"> <br>
        <input type="submit" value="Kirim" name="kirim">
        <input type="reset" value="Ulang" name="ulang">
    </form>

</body>
</html>