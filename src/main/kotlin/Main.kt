package my

fun main() {  //    args: Array<String>
   Main().run()
}

class Main {
   private val name: String = "Kirill"

   fun run() {
      println("hello $name")
   }
}