package org.hyperskill

fun String.prin() {
    println("--> $this")
}

fun main() {
    "content".substring(1,1).prin()
    "content".substring(0,0).prin()
//    "content".substring(-1,-1).prin()
    "content".substringAfter("t").prin()
    "content".substring(0,1).prin()
    "content".substringBefore("c").prin()
}