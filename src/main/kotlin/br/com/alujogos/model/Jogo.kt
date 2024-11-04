package org.example.br.com.alujogos.model

class Jogo (var titulo:String,
            var capa: String ) {
    var descricao : String? = null


    override fun toString(): String {
        return "Jogo: \n" +
                "Título: $titulo \n" +
                "Capa: $capa \n" +
                "Descricao: $descricao"
    }


}