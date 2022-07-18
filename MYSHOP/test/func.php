<?php

/*$sum = 0; muốn  thằng  sum ở ngoài giống thằng sum bên trong thì khai báo global
    function getSum($n1, $n2){
        global $sum = $n1 +$n2;
        echo "Sum of two numbers $n1 and $n2 is : $sum";
        //echo "sum of two number $n1 anh $n2 is :sum";
        return $sum;
    }

    function getGreeting(){
        global $item;
    }
    //calling function
    getSum(10,15);*/

    function getSum($n1, $n2){
        $sum = $n1 +$n2;
        echo "Sum of two numbers $n1 and $n2 is : $sum";
        //echo "sum of two number $n1 anh $n2 is :sum";
        return $sum;
    }

    //calling function
    getSum(10,15);


?>