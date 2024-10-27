package org.example

import com.google.gson.annotations.SerializedName

class Jogo (@SerializedName("title") var titulo:String, @SerializedName("thumb") var capa: String ) {
    val descricao = ""


    override fun toString(): String {
        return "Jogo: \n" +
                "Título: $titulo \n" +
                "Capa: $capa \n" +
                "Descricao: $descricao"
    }


}