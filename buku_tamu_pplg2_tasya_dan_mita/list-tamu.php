<?php include("config.php"); ?>
<html>
     <head>
         <title>DAFTAR BUKU TAMU GELAR KARYA SMK N 1 SAYUNG</title>
</head>

<body>
    <header>
        <h3>DAFTAR BUKU TAMU GELARKARYA SMK N 1 SAYUNG</3>
</header>

<nav>
    <a href="form-daftar.php"> [+]Tambah Baru </a>
</nav>

<br>

<table border="1">
    <thead>
        <tr>
            <th>id</th>
            <th>nama</th>
            <th>alamat</th>
            <th>asal_instansi</th>
            <th>pesan_kesan</th> 
            
</tr>
</thead>
<tbody>
    


<?php
$sql = "SELECT * FROM buku_tamu";
$query = mysqli_query($db, $sql);
$i=1;
 while($tamu = mysqli_fetch_array($query)){
    echo "<tr>";
    echo "<td>".$i."</td>";
    echo "<td>".$tamu['nama']."</td>";
    echo "<td>".$tamu['alamat']."</td>";
    echo "<td>".$tamu['asal_instansi']."</td>";
    echo "<td>".$tamu['pesan_dan_kesan']."</td>";
    echo "</tr>";
$i++;
}
?>

</tbody>
</table>

<p>total: <?php echo mysqli_num_rows($query) ?></p>

</body>
</html>
