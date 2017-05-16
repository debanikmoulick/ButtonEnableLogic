<?
$username="u882659124_root";
$database="u882659124_ctug";
$password="debanik";
$host="mysql.hostinger.in";
$conn=mysql_connect($host,$username,$password);
mysql_select_db($database,$conn);
$query=mysql_query("select * from Admin",$conn);
while($row=mysql_fetch_array($query))
{
    $flag[]=$row;
}
print(json_encode($flag));
mysql_close($conn);
?>