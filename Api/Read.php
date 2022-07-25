<?php
    header("Access-Control-Allow-Origin: *");
    header("Content-Type: application/json; charset=UTF-8");

    include_once 'Database.php';
    include_once 'Employee.php';
    // create database object
    $database = new Database();
    // call the  function
    $db =$database->getConnection();
    $items = new Employee($db);
    $stmt = $items->getEmployee();
    $itemCount = $stmt->rowCount();

    echo json_encode($itemCount);
    if($itemCount > 0){
        $employeeArr = array();
        $employeeArr ["body"] = array();
        $employeeArr["itemCount"] = $itemCount;

        While($row = $stmt->fetch(PDO::FETCH_ASSOC)){
            extract($row);
            $e = array(
               "Id" => $Id,
                "Name" =>$Name,
                "Email" =>$Email,
                "Age" => "Age",
                "Designation" =>$Designation,
                "Created" =>$Created,
            );
            array_push($employeeArr["body"],$e);
        }
        echo json_encode($employeeArr);
    }
    else{
        http_response_code(404);
        echo json_encode(
            array("message"=> "no record foung.")
        );
    }
?>
