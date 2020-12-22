package xml

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

@Root(name = "catalog", strict = false) // name == "catalog" in XML file.
//@JvmOverloads constructor()
class Catalog {
    @get:ElementList(required = false, inline = true, name = "book")
    @set:ElementList(required = false, inline = true, name = "book")
//    @get:ElementList(required = false, name = "book")
//    @set:ElementList(required = false, name = "book")
    var books: List<Book>? = null
}

class Book {
    @get:Attribute(required = false)
    @set:Attribute(required = false)
    var id: String? = null

    @get:Element(required = false)
    @set:Element(required = false)
    var author: String? = null

    @get:Element(required = false)
    @set:Element(required = false)
    var title: String? = null

    @get:Element(required = false)
    @set:Element(required = false)
    var genre: String? = null

    @get:Element(required = false)
    @set:Element(required = false)
    var price: Float? = null

    @get:Element(name = "publish_date", required = false)
    @set:Element(name = "publish_date", required = false)
    var publishDate: String? = null

    @get:Element(required = false)
    @set:Element(required = false)
    var description: String? = null
}