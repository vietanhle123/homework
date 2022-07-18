<?php
//load file config.php // loại đối  tượng connection
include_once("config.php");
//đọc toàn  bộ bản  ghi
$mysqli =1;
$result = mysqli_query($mysqli,"SELECT * FROM student ORDER BY  id DESC ");
?>

<html>
    <head>
        <title>Student management</title>
    </head>

    <>
    <a href="create.php">Add new student</a><br/><br/>
        <table width="90%" border="1">

            <tr>
                <th>Name</th><th>Email</th><th>Mobile</th><th>Update</th>
            </tr>

            <?php
            while ($student_data = mysqli_fetch_array($result)){
                echo"<tr>";
                echo "<td>". $student_data['name']."<td>";
                echo "<td>". $student_data['email']."<td>";
                echo "<td>". $student_data['mobile']."<td>";
                echo "<td><a href='edit.php?id=$student_data[id]'>Edit</a> |
                <a href='delete.php?id=$student_data[id]'>Delete</a></td></tr>";

            }
            ?>
        </table>
    </body>
</html>
