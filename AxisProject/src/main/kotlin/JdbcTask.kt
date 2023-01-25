import java.sql.*

class JdbcTask {
    var conn: Connection? = null;
    fun createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance()
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem", "root", "password@123")
            if (conn != null) {
                print("Connection done");
            }
            print("connecting to db");
        } catch (e: SQLException) {
            print(e);
        }
    }

    fun createTable() {
        var prestat: PreparedStatement? = null
        print("Enter table name")
        var tablename = readLine()!!.toString();
        var sql = "create table $tablename(staffid int not null auto_increment, staffname varchar(255), staffage int not null, primary key(staffid));"
        try{
            prestat=conn!!.prepareStatement(sql)
            var status=prestat.executeUpdate()
            if(status==0){
                print("Table is created");
            }
        }catch(e:SQLException){
            print(e)
        }
    }

    fun insertdata(){
        var prestat: PreparedStatement? = null
        print("Enter table name to insert data")
        var tablename = readLine()!!.toString();
        var sql = "insert into $tablename(staffname, staffage) values(?,?);"
        try{
            prestat=conn!!.prepareStatement(sql);
            println("Enter staffname")
            prestat.setString(1, readLine())
            println("Enter staff age")
            var age = readLine()!!.toInt()
            prestat.setInt(2, age)
            var status=prestat.executeUpdate()
            print(status)
            if(status>0){
                print("Data inserted into table")
            }

        }catch(e:SQLException){
            print(e)
        }
    }

    fun deletedata(){
        var prestat: PreparedStatement? = null
        print("Enter tablename to delete data")
        var tablename = readLine()!!.toString();
        var sql = "drop table $tablename;"
        try{
            prestat=conn!!.prepareStatement(sql)
            var status=prestat.executeUpdate()
            if(status==0){
                print("Data deleted")
            }
        }catch(e:SQLException){
        print(e)
    }

    }

    fun searchdata() {
        var stm: Statement? = null;
        var res: ResultSet? = null;
        print("Enter table name to search data")
        var tablename = readLine()!!.toString()
        print("Enter id to search")
        var id = readLine()!!.toInt()
        var sql = "select * from $tablename where id>$id;"
        try {
            stm = conn!!.createStatement()
            //  print(res)
            res = stm!!.executeQuery(sql);
            print(res)
            while (res!!.next()) {
                print("${res.getInt("staffid")}\t")
                print("${res.getString("staffname")}\t")
                print("${res.getInt("staffage")}\t")

            }

        } catch (e: SQLException) {
            print(e);

        } finally {
            if (res != null) {
                try {
                    res.close()
                    conn!!.close();
                } catch (e: SQLException) {
                    print(e)
                }
            }
        }
    }

}

fun main(){
    var Jdbc1 = JdbcTask()
    Jdbc1.createConnection()

    while(true){
        println("\n 1. Create Table \n 2. Insert data \n 3. Delete data \n 4. Search data \n 5. exit")
        var choice = readLine()!!.toInt()
        when(choice){
            1 -> Jdbc1.createTable();
            2 -> Jdbc1.insertdata();
            3 -> Jdbc1.deletedata();
            4 -> Jdbc1.searchdata();
            5 -> System.exit(1);
            else->{
                print("Invalid Choice")
            }
        }
    }
}


