package org.example

class Jogo {
    var titulo = ""
    var capa = ""
    val descricao = ""


    override fun toString(): String {
        return "Jogo: \n" +
                "Título: $titulo \n" +
                "Capa: $capa \n" +
                "Descricao: $descricao"
    }


}