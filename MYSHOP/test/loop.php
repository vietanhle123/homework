<?php
// loop in php
// while(dk), for(;;), do{}while;, foreach()
$i = 5;
while ($i <= 10){
        $i++;
        echo "The number is ". $i. "<br>";
}

for ($j = 0; $j<=10;$j++){
    echo "The number is ".$j."<br>";
}

//foreach
$students = array("hiep", "trung","hieu", "vinh", "ngoc", "van");
foreach ($students as $stu){
    echo  $stu . "<br>";
}
?>
