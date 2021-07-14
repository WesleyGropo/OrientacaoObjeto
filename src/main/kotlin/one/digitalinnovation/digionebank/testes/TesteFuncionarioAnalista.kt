package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {

    val joao = Analista("João Pedro","31305512377",2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}
