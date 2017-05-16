
<?php
$type=$_POST['submit'];
$host="localhost";
$username="root";
$password="";
$database="project";
$user=$_POST['username'];
$pass=$_POST['password'];
$phone=$POST['phone'];
$email=$_POST['email'];
print $user."  ".$pass;
$conn=mysql_connect($host,$username,$password)or die ("not server");
mysql_select_db($database,$conn)or die ("not selected");
$query=mysql_query("insert into project(uname,password,phone,email)values('$user'','$pass',$phone,'$email')",$conn);
if($row=mysql_fetch_array($query))
{
    if($row=="true")
    {
        echo "success";
    }
    else
    {
        echo "not successful";
    }
}
?>