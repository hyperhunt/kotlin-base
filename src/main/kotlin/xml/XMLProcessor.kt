package xml

import org.xml.sax.InputSource
import java.io.StringReader
import javax.xml.parsers.DocumentBuilderFactory

/*val xml = """
    <catalog>
       <book id="bk101">
          <author>Gambardella, Matthew</author>
          <title>XML Developer's Guide</title>
          <genre>Computer</genre>
          <price>44.95</price>
          <publish_date>2000-10-01</publish_date>
          <description>An in-depth look at creating applications with XML.</description>
       </book>
       <book id="bk102">
          <author>Ralls, Kim</author>
          <title>Midnight Rain</title>
          <genre>Fantasy</genre>
          <price>5.95</price>
          <publish_date>2000-12-16</publish_date>
          <description>A former architect battles corporate zombies.</description>
       </book>
    </catalog>
""".trimIndent()*/

/*
fun main() {
    // Два типа парсеров в Джава
    // SAX - потоковый, вызывает колбеки функцию по условию, результат нужно где-то хранить.
    // DOM - создает древовидную модель документа, органичение по оперативной памяти.

    // BuilderFactory
*/
/*    val buildFactory = DocumentBuilderFactory.newInstance()
    val documentBuilder = buildFactory.newDocumentBuilder()
    val doc = documentBuilder.parse(InputSource(StringReader(xml)))
    val books = doc.getElementsByTagName("book")
    for (i in 0 until books.length) {
        val book = books.item(i)
        println(book.attributes.getNamedItem("id"))
        println(book.childNodes.item(1).textContent)
    }*//*

}*/
