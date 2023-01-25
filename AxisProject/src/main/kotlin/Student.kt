class Student {
        private var name: String=""
        private var age: Int=0
        private var college: String=""

        fun setStudentName(name:String){
            this.name=name
        }

        fun setStudentAge(age:Int){
            this.age=age
        }

        fun setStudentCollege(college:String){
            this.college=college
        }

        fun getStudentDetails():String{
            return "Name :  $name, Age : $age, College : $college"
        }
    }


    fun main(args:Array<String>){
        val student1 = Student()


        student1.setStudentName("Manoj")
        student1.setStudentAge(22)
        student1.setStudentCollege("Atria")

        println("Student : ${student1.getStudentDetails()}")


        val student2 = Student()
        student2.setStudentName("Sathya")
        student2.setStudentAge(21)
        student2.setStudentCollege("Nitte")
        println("Student : ${student2.getStudentDetails()}")
    }
