package json

import org.json.JSONObject

val json = """
    {
       "owner": "John Smith",
       age: 55,
       "books":[
          {
             "id":"444",
             "language":"C",
             "edition":"First",
             "author":"Dennis Ritchie "
          },
          {
             "id":"555",
             "language":"C++",
             "edition":"second",
             "author":" Bjarne Stroustrup "
          }
       ]
    }
""".trimIndent()

fun main() {
    val obj = JSONObject(json)
    println(obj.getString("owner"))
    val books = obj.getJSONArray("books")
    val book = books[1] as JSONObject
    println(book.getString("author").trim())
}