class College {
    var name: String=""
    var place: String=""

    fun getCollegedetails(){
        println("College name : $name and College place : $place")
    }

    class Branch {
        var bname: String=""
        var bid: String=""


        fun getBranchdetails(){
            println("Branch name : $bname and Branch Id : $bid")
        }

    }

    class Student {
        var sname: String=""
        var splace: String=""

        fun getStudentdetails(){
            println("Student name : $sname and Student Place : $splace")
        }
    }
}

fun main(){

    var college1 = College()
    var branch1 = College.Branch()
    var student1 = College.Student()

    college1.name = "Atria Institue Of technology"
    college1.place = "Bengaluru"
    branch1.bid = "ISE"
    branch1.bname = "Information Science & Engg"
    student1.sname = "Manoj"
    student1.splace = "Mysore"
    college1.getCollegedetails()
    branch1.getBranchdetails()
    student1.getStudentdetails()
}

