package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {

    val maria = Gerente("Maria do Carmo","31305512377",5000.0, "senha123")

    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)

}
