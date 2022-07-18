
<?php
    include_once (config.php);

    //trả  về true nếu người dùng  nhấn  submit(update)
    if(isset($_POST['update']))
    {
        $id = $_POST['id'];

        $name = $_POST['name'];
        $email = $_POST['email'];
        $mobile = $_POST['mobile'];

        //update database
        $mysqli =1;
        $result = mysqli_query($mysqli,"UPDATE student SET name='$name' WHERE id ='$id'");

        // quay về trang chủ  nếu cập nhập xong
        header("Location : index.php");

    }
?>


<?php

    $id = $_GET['id'];

    $result = mysqli_query($mysqli,"SELECT * FROM student WHERE id = $");
    while ($stu_data = mysqli_fetch_array($result)){

        $name = $stu_data['name'];
        $email = $stu_data['email'];
        $mobile = $stu_data['mobile'];
    }

?>

<html>
    <header>
        <title>Edit Student</title>
    </header>
    <br>
            <a href="index.php">Home</a>
            <br/><br/>
            <from name="update_student" method="post" action="edit.php">
                <table>
                    <tr>
                        <td>Name</td>
                        <td><input type="text" name="name" value=<?php echo $name;?>></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type="text" name="email" value=<?php echo $email;?>></td>
                    </tr>
                    <tr>
                        <td>Mobile</td>
                        <td><input type="text" name="mobile" value=<?php echo $mobile;?>></td>
                    </tr>
                    <tr>
                        <td><input type="hidden" name="id" value=<?php echo $_GET['id'];?>></td>
                        <td><input type="submit" name="update" value="Update"></td>
                    </tr>
                </table>
            </from>
    </body>
</html>>