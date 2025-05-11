# URL Retrieve on scala

## use URI Class on Java 20 and later

Use [java.net.URI Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/net/URI.html#toURL()) on scala

~~~scala
import java.net.URI
val exampleUrl = new URI("https://www.google.com/").toURL()
~~~

### URL Class Constructors are Deprecated from Java 20

Since Java 20, [Constructors of java.net.URL](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/net/URL.html#constructor-summary) are Deprecated.
Earlier Java 20, [java.net.URL Class](https://docs.oracle.com/javase/8/docs/api/java/net/URL.html) is available for the Constructor.

~~~scala
import java.net.URL
val exampleUrl = new URL("https://www.google.com/")
~~~

## Retrieve an URL to a file

Use [org.apache.commons.io.FileUtils.copyURLToFile()](http://commons.apache.org/proper/commons-io/javadocs/api-release/org/apache/commons/io/FileUtils.html#copyURLToFile-java.net.URL-java.io.File-int-int-) 

~~~scala
import org.apache.commons.io.FileUtils.copyURLToFile
import java.io.File

val contentFile = new File("content")
// prevent duplicate download
if (!contentFile.exists || contentFile.length() == 0) {
    copyURLToFile(exampleUrl, contentFile)
}
val contentFileLength = contentFile.length()
~~~

## Retrieve an URL to a string

Use [org.apache.commons.io.IOUtils,toString()](http://commons.apache.org/proper/commons-io/javadocs/api-release/org/apache/commons/io/IOUtils.html#toString-java.io.InputStream-java.nio.charset.Charset-)

Storing Scala String makes it easy to display in Zeppelin notebook.

~~~scala
import org.apache.commons.io.IOUtils
import java.nio.charset.Charset

val contentStr = IOUtils.toString(exampleUrl, Charset.forName("utf8"))
val contentStrLength = contentStr.length()
// if we want to the content show zeppelin inline
// print("%html ")
// print(contentStr)
~~~

 