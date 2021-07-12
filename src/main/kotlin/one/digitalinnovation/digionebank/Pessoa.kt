package one.digitalinnovation.digionebank



class Pessoa {
    var nome: String = "wesley"
    var cpf: String = "123.123.123.11"
    private set

}

fun main() {
    val wesley = Pessoa()

    println(wesley)
    println(wesley.nome)
    println(wesley.cpf)

}

