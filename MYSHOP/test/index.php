<?php
//data type
    $number = 10.5;//float
    echo $number. "<br>";
    $text = "hello ";//string
    echo $text. "<br>";

    $score = 5;//int
// print
    echo gettype($number)."<br>";
    echo gettype($text)."<br>";
// php vs html tags
    echo "<h1 style='color:blue'>This is blue </h1>";
//arrays
    $students = array("khoi","trung","minh");

    echo $students[0];
//assign value
    $marks = $arrayName = array("VA" =>10,"ngoc =>15","hai =>12");
    asort($marks);//SX gia  tri cua  mang
    ksort($marks);// sap xep theo key
    print_r($marks). "<br>";
    //var_dump($marks). "<br>";
//  sort in array
    $employee = array("vinh", "canh","trung", "hieu", "dung");
    sort($employee);//tang dan
    rsort($employee);// giam dan
    print_r(@$employee);

//condition in php
//if(), if,else if, switch case;
?>

