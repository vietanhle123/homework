<?php
    header("Access-Control-Allow-Origin: *");
    header("Content-Type: application/json; charset=UTF-8");
    header("Access-Control-Allow-Methods: Delete");
    header("Access-Control-Max-Age: 3600");
    header("Access-Control-Allow-Headers: Content-Type,Access-Control-Allow-Headers, Authorization, X-Requested-With");

    include_once 'database.php';
    include_once  'employees.php';

    $database = new Database();
    $db = $database->getConection();

    $item = new Employee($db);
    $data = json_decode(file_get_contents("php://input"));

    $item->Name = $data->Name;
    $item->Email = $data->Email;
    $item->Age = $data->Age;
    $item->Designation = $data->Designation;
    $item->Created = $data('Y-m-d H:i:s');


    if($item->createEmployee()){
        echo ("Employee created successfully.");
    }else{
        echo ("Employee could not  be created");
    }
?>