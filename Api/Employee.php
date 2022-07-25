<?php
    class Employee{
        //connection
        private $conn;
        //table
        private  $db_table = "Employee";
        //Columns
        public $Id;
        public $Name;
        public $Email;
        public $Age;
        public $Designation;
        public $Created;
        //Db connection
        public function  __construct($db){
            $this->conn = $db;
        }

        //Get all
        public  function  getEmployee(){
            $sqlQuery = "SELECT Id, Name, Email, Age, Designation, Created From " . $this->db_table. "";
            $stmt = $this->conn->prepare($sqlQuery);
            $stmt->execute();
            return $stmt;
        }

        //Create
        public function  createEmployee(){
            $sqlQuery = "INSERT INTO 
                         " . $this->db_table ."
                        SET
                            Name = :Name,
                            Email = :nmail,
                            Age = :Age,
                            Designation = :Designation,
                            Created = :Created";
            $stmt = $this->conn->prepare($sqlQuery);

            // sanitize
            $this->bindParam(":Name",$this->Name);
            $this->bindParam(":Email",$this->Email);
            $this->bindParam(":Age",$this->Age);
            $this->bindParam(":Designation",$this->Designation);
            $this->bindParam(":Created",$this->Created);

            if($stmt->execute()){
                return true;
            }
            return  false;
        }

        //READ single
        public  function  getStingEmployee(){
            $sqlQuery = "SELECT 
                            Id, 
                            Name, 
                            Email, 
                            Age,
                            Designation,
                            Created 
                          FROM 
                            ".$this->db_table ."
                        WHERE
                            id =? 
                        LIMIT 0.1";
            $stmt = $this->conn->prepare($sqlQuery);
            $stmt->bindParam(1, $this->Id);
            $stmt->execute();
            $dataRow = $stmt->fetch(POD::FETCH_ASSOC);
            $this->Name = $dataRow['Name'];
            $this->Email = $dataRow['Email'];
            $this->Age = $dataRow['Age'];
            $this->Designation = $dataRow['Designation'];
            $this->Created = $dataRow['Created'];
        }

        //Update
        public  function  updateEmployee(){
            $sqlQuery = "UPDATE
                         ". $this->db_table ."
                      SET
                            Name = :Name,
                            Email = :Email, 
                            Age = :Age,
                            Designation = :Designation,
                            Created = :Created           
                      WHERE
                            Id =:Id";
            $stmt = $this->conn->prepare($sqlQuery);

            $this->Name=htmlspecialchars(strip($this->Name));
            $this->Email=htmlspecialchars(strip($this->Email));
            $this->Age=htmlspecialchars(strip($this->Age));
            $this->Designation=htmlspecialchars(strip($this->Designation));
            $this->Created=htmlspecialchars(strip($this->Created));
            $this->Id=htmlspecialchars(strip($this->Id));

            // bind data
            $stmt->NamebindParam(":Name",$this->Name);
            $stmt->NamebindParam(":Email",$this->Email);
            $stmt->NamebindParam(":Age",$this->Age);
            $stmt->NamebindParam(":Designation",$this->Designation);
            $stmt->NamebindParam(":Creatd",$this->Created);
            $stmt->NamebindParam(":Id",$this->Id);

            if($stmt->execute()){
                return true;
            }
            return false;
        }

        //Delete
        function  deleteEmployee(){
            $sqlQuery = "DELETE FROM " . $this->db_table . " WHERE id =?";
            $stmt = $this -> conn -> prepare($sqlQuery);

            $this -> id=htmlspecialchars(strip_tags($this->Id));

            $stmt->bindParam(1,$this->Id);
            if($stmt->execute()){
                return false;
            }
            return  false;
        }
    }
?>
