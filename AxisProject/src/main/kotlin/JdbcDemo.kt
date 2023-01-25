import java.io.File
import java.io.FileInputStream
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet
import java.sql.SQLException;
import java.sql.Statement
import java.sql.PreparedStatement

class JdbcDemo {
    var conn:Connection?=null;
    fun createConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance()
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem", "root", "password@123")
            if(conn!=null){
                print("Connection done");
            }
            print("connecting to db");
        }catch(e:SQLException){
            print(e);
        }
    }

    fun createTableUsingStam(){
        var stm:Statement?=null;
        var sql = "create table demo2(id int not null auto_increment, name varchar(255), age int not null, primary key(id));"
        try{
            stm=conn!!.createStatement();
            stm.execute(sql);
            print("Table created");
        }catch(e:SQLException){
            print(e)
        }
    }

    fun createTable(){
        var prestat: PreparedStatement?=null
        var sql="create table demo(id int not null auto_increment, name varchar(255), age int not null, primary key(id));"
        try{
            prestat=conn!!.prepareStatement(sql);
            var status=prestat.executeUpdate();
            print(status)
            if(status>0){
                print("Table is created");
            }
        }catch(e:SQLException){
            print(e)
        }
    }

    fun insertIntoTable(){
        println("Inserting data")
        var preStat: PreparedStatement?=null
        var sql ="insert into demo(name, age)values(?,?);"
        try{
            preStat=conn!!.prepareStatement(sql);
            println("Enter username")
            preStat.setString(1, readLine())
            println("Enter user age")
            var age = readLine()!!.toInt()
            preStat.setInt(2, age)
            var status=preStat.executeUpdate()
            print(status)
            if(status>0){
                print("Data inserted into table")
            }

        }catch(e:SQLException){
            print(e)
        }
    }
    fun connectionClose(){
        if(conn!=null){
          //  conn!!.close();
        }
    }

    fun updateTable(){
        var preStat:PreparedStatement?=null
        var sql = "update demo SET name=? where id=?;"
        try{
            preStat=conn!!.prepareStatement(sql)
            var name=readLine()
            preStat.setString(1,name)
            var id=readLine()!!.toInt()
            preStat.setInt(2, id);
            var status = preStat.executeUpdate();
            if(status>0){
                print("table is updated")
            }

        }catch(e:SQLException){
            print(e)
        }
    }

    fun insertImage(){
        var preStat:PreparedStatement?=null
        var sql = "Insert into demo(imagename, image) values (?, ?);"
        try{
            var ImageFile:File= File("image1.png")
            var readImageFile = FileInputStream(ImageFile)
            preStat=conn!!.prepareStatement(sql)
            preStat.setString(1, "demo")
            preStat.setBinaryStream(2,readImageFile)
            preStat.executeUpdate();
        }catch (e:SQLException){
            print(e)
        }

    }

    fun deleteData(){
        var preStat:PreparedStatement?=null;
        var sql = "Delete from demo where id=?;"
        try{
            preStat=conn!!.prepareStatement(sql);
            var id=readLine()!!.toInt()
            preStat.setInt(1, id)
            var status = preStat.executeUpdate();
            if(status>0){
                print("Data deleted")
            }
        }catch(e:SQLException){
            print(e)
        }
    }
    fun selectQuery(){
        var stm:Statement?=null;
        var res:ResultSet?=null;
        var sql="select * from account;"
        try{
            stm=conn!!.createStatement()
            //  print(res)
            res=stm!!.executeQuery(sql);
            print(res)
            while(res!!.next()){
                print("${res.getInt("accountid")}\t")
                print("${res.getBigDecimal("accountno")}\t")
                print("${res.getFloat("accountbalance")}\t")
                print("${res.getString("accounttype")}\t")
                print("${res.getInt("customerid")}\t\n")

            }

        }catch(e:SQLException){
            print(e);

        }finally{
            if(res!=null){
                try{
                    res.close()
                    conn!!.close();
                }catch(e:SQLException){
                    print(e)
                }
            }
        }

    }
    fun executeQueryOfDatabse(){
        var stm:Statement?=null;
        var res:ResultSet?=null;
        var sql="show tables;"
        try{
            stm=conn!!.createStatement()
          //  print(res)
            res=stm!!.executeQuery(sql);
            print(res)
            while(res!!.next()){
                print(res.getString("Tables_in_banksystem"))
            }

        }catch(e:SQLException){
            print(e);

        }finally{
            if(res!=null){
                try{
                    res.close()
                   // conn!!.close();
                }catch(e:SQLException){
                    print(e)
                }
            }
        }
    }
}

fun main(){
    var jdbcObj = JdbcDemo();
    jdbcObj.createConnection();
   // jdbcObj.executeQueryOfDatabse();
    //jdbcObj.selectQuery();
   // jdbcObj.createTable();
   // jdbcObj.createTableUsingStam();
    jdbcObj.insertIntoTable();
}