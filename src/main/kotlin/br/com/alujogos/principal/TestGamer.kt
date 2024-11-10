package br.com.alujogos.principal

import br.com.alujogos.model.Gamer

fun main() {
    val gamer = Gamer("Eduardo", "eduardo@email.com")
    println(gamer)

    val gamer2 = Gamer(
        "Arthur",
        "arthur@email.com",
        "05/03/2013",
        "deusah")

    println(gamer2)
}