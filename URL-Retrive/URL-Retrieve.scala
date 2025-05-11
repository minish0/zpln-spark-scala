// %spark
// if we want to prefer IPv4
// import java.util.Properties
// System.setProperty("java.net.preferIPv4Stack" , "true")
// System.setProperty("java.net.preferIPv6Addresses", "false")

// Retrieve an URI to File
import org.apache.commons.io.FileUtils.copyURLToFile
import java.io.File

val contentFile = new File("content")
// prevent duplicate download
if (!contentFile.exists || contentFile.length() == 0) {
    copyURLToFile(exampleUrl, contentFile)
}
val contentFileLength = contentFile.length()

// Retrieve an URL to String
import org.apache.commons.io.IOUtils
import java.nio.charset.Charset

val contentLength = contentFile.length()
val contentStr = IOUtils.toString(exampleUrl, Charset.forName("utf8"))
val contentStrLength = contentStr.length()
// if we want to the content show zeppelin inline
// print("%html ")
// print(contentStr)
