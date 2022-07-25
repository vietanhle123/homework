<?php
header("Access-Control-Allow-Origin: *");
header("Content-Type: application/json; charset=UTF-8");
header("Access-control=Allow-Methods: POST");
header("Access-Control-Max-Age: 3600");
header("Access-Control-Allow-Headers: Content-Type, Access-Control-Allow-Headers, Authorization, X-Requested-With ");
include_once 'Database.php';
include_once 'Employee.php';
$database = new Database();
$db = $database->getConection();
$iten = new Employee($db);
$iten->Id = isset($_GET['Id']) ? $_GET['Id'] : die();
$iten->getSinglemployee();
if($iten->name != null){
    $emp_arr = array(
        "Id" => $iten->Id,
        "Name" =>$iten->Name,
        "Email"=> $iten->Email,
        "Age"=> $iten->Age,
        "Designation"=> $iten->Designation,
        "Created"=> $iten->Created
    );
    http_response_code(200);
    echo json_encode($emp_arr);
}
else{
    http_response_code(404);
    echo  json_encode("Employee not found.");
}

?>
