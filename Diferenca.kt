package org.example

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    // Lista para armazenar os números
    var numbers = mutableListOf<Int>()
    var list = listOf<String>("primeiro", "segundo", "terceiro", "quarto")

    // Solicitar ao usuário que digite 4 números
    for (i in 0..3) {
        println("Digite o ${list[i]} número: ")
        val number = input.nextInt()
        numbers.add(number)
    }

    println("Números digitados: $numbers")

    // Cálculo da diferença
    val diferenca = numbers[0] * numbers[1] - numbers[2] * numbers[3]

    // Saída conforme o desafio
    println("\nDIFERENÇA = $diferenca")


}