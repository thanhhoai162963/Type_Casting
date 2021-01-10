package com.example.nullsafety

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.crypto.Mac

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a:Float = 3.14F
        var laptop = createLaptop(MacBook())
        if (laptop is MacBook){
            laptop.name()
        }else if (laptop is Acer){
            laptop.name()
        }
        var b = laptop as? Acer
        Log.d("bbb","$b")
        var c: NameLaptop = MacBook()
    }
}
////Ép kiểu
fun createLaptop (laptop: NameLaptop) = laptop
class MacBook : NameLaptop(){
    override fun name() {
        println("MacBook")
    }

}
class Acer : NameLaptop(){
    override fun name() {
        println("Acer")
    }

}
abstract class NameLaptop{
    abstract fun name()
}