<?php


class DBController
{
    // Database Connection Properties
    protected $host = 'remotemysql.com';
    protected $user = 'HE3Yb7najI';
    protected $password = 'H7k5uNcgQb';
    protected $database = 'HE3Yb7najI';

    // connection property
    public $con = null;

    // call constructor
    public function __construct()
    {
        //Get Heroku ClearDB connection information
//        $cleardb_url = parse_url(getenv("CLEARDB_DATABASE_URL"));
//        $cleardb_server = $cleardb_url["host"];
//        $cleardb_username = $cleardb_url["user"];
//        $cleardb_password = $cleardb_url["pass"];
//        $cleardb_db = substr($cleardb_url["path"],1);

//        $active_group = 'default';
//        $query_builder = TRUE;

        // Connect to DB
        //$con = mysqli_connect($cleardb_server, $cleardb_username, $cleardb_password, $cleardb_db);


        $this->con = mysqli_connect($this->host, $this->user, $this->password, $this->database);
        if ($this->con->connect_error){
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
