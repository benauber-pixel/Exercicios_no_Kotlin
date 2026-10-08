
fun calcularDesconto(valor: Double, cupom: String?): Double {
    return when (cupom) {
        "PROMO10" -> valor - 10.0
        "PROMO20" -> valor - 20.0
        else -> valor
    }
}

fun auditarEntregas(enderecos: List<String?>) {
    for (enderecoNulo in enderecos) {
        val endereco = enderecoNulo ?: "Endereço Desconhecido"

        if (endereco == "Endereço Desconhecido") {
            println("Entrega Pendente: Falta de dados")
        } else {
            println("Rota traçada para: $endereco")
        }
    }
}

fun validarBioInfantil(bio: String?) {
    val tamanho = bio?.length ?: 0

    if (tamanho <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }
}

fun processarTransacoesPix() {
    val transacoes = listOf(50.0, null, 120.5, null, 10.0)
    var total = 0.0

    for (transacao in transacoes) {
        if (transacao != null) {
            total += transacao
        } else {
            println("Transação ignorada")
        }
    }

    println("Valor total processado: $total")
}

fun avaliarMotorista(nota: Int?) {
    val notaValida = nota ?: 0

    when (notaValida) {
        5 -> println("Excelente corrida!")
        4 -> println("Boa corrida.")
        1, 2, 3 -> println("Precisamos melhorar.")
        0 -> println("Nenhuma avaliação fornecida.")
        else -> println("Nota inválida.")
    }
}

fun gorjeta() {
    val calcularGorjeta: (Double?) -> Double = {
        val valor = it ?: 0.0
        if (valor < 0) {
            0.0
        } else {
            valor
        }
    }
    println(calcularGorjeta(25.0))
    println(calcularGorjeta(null))
    println(calcularGorjeta(-10.0))
}

fun limparBancoDeDados(emails: List<String?>) {
    var contasInvalidas = 0

    for (email in emails) {
        val tamanho = email?.trim()?.length ?: 0

        if (email == null || tamanho == 0) {
            contasInvalidas++
            println("Conta inválida encontrada (nula ou em branco).")
        }
    }

    println("Total de contas inválidas: $contasInvalidas")
}

fun main() {
    println("--- Questão 1 ---")
    println(calcularDesconto(100.0, "PROMO10"))
    println(calcularDesconto(100.0, "PROMO20"))
    println(calcularDesconto(100.0, "VIP50"))
    println(calcularDesconto(100.0, null))

    println("--- Questão 2 ---")
    val listaEnderecos = listOf("Rua A, 123", null, "Av. Central, 456")
    auditarEntregas(listaEnderecos)

    println("--- Questão 3 ---")
    validarBioInfantil("Gamer e estudante")
    validarBioInfantil(null)

    println("--- Questão 4 ---")
    processarTransacoesPix()

    println("--- Questão 5 ---")
    avaliarMotorista(5)
    avaliarMotorista(null)

    println("--- Questão 6 ---")
    gorjeta()

    println("--- Questão 7 ---")
    val listaEmails = listOf("teste@email.com", null, "   ", "usuario@email.com")
    limparBancoDeDados(listaEmails)
}