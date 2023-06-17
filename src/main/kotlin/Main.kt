package com.example.classclassclassclass

class person(val man :String){
    var age : Int = 17
    var favLang : String = "Java"
    fun ageChange(){
        age+=1
    }
    fun printInfo(){
        println("$man 의 나이는 $age 이며, $man 이 가장 선호하는 언어는 $favLang 입니다")
    }

}
fun main(){
    val man = person("doyun")
    man.age = 18
    man.favLang = "kt"
    println(man)
    man.printInfo()
}