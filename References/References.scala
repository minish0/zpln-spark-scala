// %spark
import java.lang.System.getProperty

val javaVersion: String = getProperty("java.version")
// val javaSpecVersion: String = (((getProperty("java.specification.version").toFloat * 10) % 10).toInt).toString
val javaSpecVersion: String = getProperty("java.specification.version")
println("%html <p style=\"font-size:16px\">Spark Version: " + sc.version + "<br>")
println("Scala Version(scala.util.Properties.versionString): " + util.Properties.versionString + "<br>")
println("Scala Version(scala.util.Properties.versionMsg): " + util.Properties.versionMsg + "<br>")
println("Scala Version(scala.util.Properties.versionNumberString): " + util.Properties.versionNumberString + ">br>")
println("Java Version: " + javaVersion + "</p>")
// html output 
println("%html <ul style=\"font-size:16px\">")
//
println("<li><a href=\"http://spark.apache.org/docs/" + sc.version + "/\"> Spark " + sc.version + " Documentation</a></li>")
println("<li><a href=\"http://spark.apache.org/docs/" + sc.version + "/api/scala/\"> Spark " + sc.version + " Scala API Documentation</a></li>")
println("<li><a href=\"http://spark.apache.org/docs/" + sc.version + "/api/python/\"> Spark " + sc.version + " Python API Documentation</a></li>")
println("<li><a href=\"https://www.scala-lang.org/api/" + util.Properties.versionNumberString + "/\"> Scala " + util.Properties.versionString + " Library API Reference</a></li>")
println("<li><a href=\"https://docs.oracle.com/javase/" + javaSpecVersion + "/docs/api/\"> Java " + javaSpecVersion + " Library API Reference</a></li>")
//
println("</ul>")
