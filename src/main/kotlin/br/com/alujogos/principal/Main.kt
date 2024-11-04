import br.com.alujogos.service.Consomer
import org.example.br.com.alujogos.model.Jogo
import java.util.*

fun main() {
    val leitura = Scanner(System.`in`)
    print("Digite o Código de Busca do Jogo: ")
    val busca = leitura.nextLine()

    val conectAPI = Consomer()
    val respostaJson = conectAPI.buscaGame(busca)

    var meuJogo: Jogo? = null


    val resultado = runCatching {
        meuJogo = Jogo(
            respostaJson.info.title,
            respostaJson.info.thumb
        )
    }

    resultado.onFailure {
        println("Jogo não cadastrado. Digite outro ID.")
    }.onSuccess {
        println("Deseja inserir uma descrição personlalizada ? S/N")
        val opcao = leitura.nextLine()
        if (opcao.equals("S", true)) {
            println("Insira a descrição personalizada para o jogo")
            val descricaoPersonalizada = leitura.nextLine()
            meuJogo?.descricao = descricaoPersonalizada
        } else {
            meuJogo?.descricao = meuJogo?.titulo

        }
        println(meuJogo)
    }
    resultado.onSuccess {
        println("Aplicação finalizada com Sucesso")
    }
}
