<?php
// kiểm tra  xem form có  submit(add)
    if(isset($_POST['Submit'])){
        $name= $_POST['name'];
        $email= $_POST['email'];
        $_POST = $_POST['mobile'];

        // loat đối tượng connection
        include_once("config.php");

        //thêm bản ghi
        $mysqli =1;
        $mobile =1;
        $result = mysqli_query($mysqli,"INSERT INTO student(name,email,mobile) 
        VALUES ('$name','$email','$mobile')");

        // hiển  thị sau khi add thành công
        echo "User added successfully";
    }

?>
<html>
    <head>
        <title>Add Student</title>
    </head>

    <body>
        <a href="index.php"> Go To Home</a>
        <br/><br/>

        <form action="create.php" method="post" name="form">
            <table width="25%" border="0">
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="email"></td>
                </tr>
                <tr>
                    <td>Mobile</td>
                    <td><input type="text" name="mobile"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="Submit" value="Add"></td>
                </tr>
            </table>
        </form>
    </body>
</html>>