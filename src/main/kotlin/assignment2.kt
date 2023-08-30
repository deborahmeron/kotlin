fun main(){
    subjectmarks()


}

fun subjectmarks(){

    var math = 80
    var english = 60
    var chemistry = 74
    var physics = 83
    var agriculture = 90
    var kiswahili = 78
    var biology = 70

    var totalmarks = math+english+chemistry+physics+agriculture+kiswahili+biology

    var maximummarks = 700

//    var average = totalmarks/2

    val percentage = (totalmarks*100)/700

    println(percentage)

    when{
        percentage >80 -> println("Grade : A")
        percentage>60 -> println("Grade : B")
        percentage>40 -> println("Grade : C")
        else -> println("Grade : D")
    }



}