object  Q5 extends App{
    def toUpper(s: String): String = {
   s.toUpperCase()
 }

 def toLower(s: String): String = {
   s.toLowerCase()
 }

 def format_name(name: String)(func: String => String): String = {
    func(name)
 }

 println(format_name("Benny")(toUpper(_)))
 println(format_name("Niroshan")(toLower(_)))
 println(format_name("Saman")(toLower(_)))
 println(format_name("Kumara")(toUpper(_)))
}