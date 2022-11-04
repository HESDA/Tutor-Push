package Perteemuan1

fun main(){

//val and var
//val tidak dapat diubah
//var bisa diubah
//    Tipe data String
    val nama : String = "Febrian"
    val umur : Int = 19
    val result = "Nama saya  $nama Umur saya $umur"
    println(result)

//  Tipe data
//  Bilangan Bulat
    val byte : Byte =  100
    val sort : Short = 100
    val int : Int = 100
    val long : Long =100L

//  Bilangan Pecahan
    val float =  15.5F
    val double = 20.122321

//  Tipe data char
    var char= '1'
    char = '8'

// Tipe data String
    val biodata = """
    Text String 
    Lebih dari
    1 Baris""".trimIndent()
    print(biodata)

//Tipe data Boolean
    val benar = true
    val salah = false
    println("Nama Saya" + nama + "Umur Saya " + umur)
    println("Nama Saya $nama Umur Saya $umur ")

}




















