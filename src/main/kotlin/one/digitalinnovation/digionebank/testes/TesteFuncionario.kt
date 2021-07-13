package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val wesley = Pessoa(nome = "Wesley Rebeque Gropo" ,cpf = "31305512377" )
    println(wesley.nome)
    println(wesley.cpf)

    val joao = Funcionario("Wesley Rebeque Gropo","31305512377", BigDecimal.valueOf(2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}