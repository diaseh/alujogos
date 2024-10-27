package org.example

class Jogo (var titulo:String,  var capa: String ) {
    val descricao = ""


    override fun toString(): String {
        return "Jogo: \n" +
                "Título: $titulo \n" +
                "Capa: $capa \n" +
                "Descricao: $descricao"
    }


}