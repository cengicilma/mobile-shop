<?php


class DBController
{
    // Database Connection Properties
    //protected $host = 'eu-cdbr-west-02.cleardb.net';
    //protected $user = 'bb318d7035ad99';
    //protected $password = '860606f2';
    //protected $database = "heroku_5320e771ab01e00";

    // connection property
    //public $con = null;

    // call constructor
    public function __construct()
    {
        //Get Heroku ClearDB connection information
        $cleardb_url = parse_url(getenv("CLEARDB_DATABASE_URL"));
        $cleardb_server = $cleardb_url["host"];
        $cleardb_username = $cleardb_url["user"];
        $cleardb_password = $cleardb_url["pass"];
        $cleardb_db = substr($cleardb_url["path"],1);

        $active_group = 'default';
        $query_builder = TRUE;

        // Connect to DB
        $conn = mysqli_connect($cleardb_server, $cleardb_username, $cleardb_password, $cleardb_db);


       // $this->con = mysqli_connect($this->host, $this->user, $this->password, $this->database);
        if ($conn->connect_error){
            echo "Fail " . $this->con->connect_error;
        }
    }

    public function __destruct()
    {
        $this->closeConnection();
    }

    // for mysqli closing connection
    protected function closeConnection(){
        if ($this->con != null ){
            $this->con->close();
            $this->con = null;
        }
    }
}
