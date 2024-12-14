package com.example.src

import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis
import java.util.concurrent.Semaphore

// Função que simula a soma parcial de uma lista
fun sumPartial(list: List<Int>): Int {
    return list.sum()
}

fun main() {
    val totalNumbers = 1_000_000 // Tamanho da lista total
    val numbers = List(totalNumbers) { it + 1 } // Lista de números de 1 até totalNumbers

    val threadCounts = listOf(10, 25, 50, 100) // Diferentes números de threads para teste

    println("Iniciando simulação do cluster computacional...\n")

    for (nThreads in threadCounts) {
        println("Testando com $nThreads threads...")

        // ----- Execução Paralela -----
        val partialSums = MutableList(nThreads) { 0 } // Resultados parciais
        val semaphore = Semaphore(1) // Semáforo para sincronização
        val serverResults = mutableListOf<Pair<Int, Int>>() // Armazena os resultados com índices

        val parallelTime = measureTimeMillis {
            val chunkSize = totalNumbers / nThreads

            // Inicia as threads (nós do cluster)
            val threads = List(nThreads) { index ->
                thread {
                    val start = index * chunkSize
                    val end = if (index == nThreads - 1) totalNumbers else start + chunkSize
                    val sublist = numbers.subList(start, end)

                    val partialSum = sumPartial(sublist)

                    // Simula uma latência para imitar a variabilidade do cluster
                    Thread.sleep((50..200).random().toLong())

                    // Envia resultado para o servidor central (com sincronização)
                    semaphore.acquire()
                    serverResults.add(index to partialSum)
                    partialSums[index] = partialSum
                    semaphore.release()
                }
            }

            // Aguarda todas as threads finalizarem
            threads.forEach { it.join() }
        }

        // Organiza os resultados na ordem correta
        serverResults.sortBy { it.first }
        val consolidatedResult = serverResults.sumOf { it.second }

        // Exibe resultados parciais e total
        println("Resultados parciais das threads:")
        serverResults.forEach { println("Thread ${it.first + 1}: Soma Parcial = ${it.second}") }
        println("Resultado Consolidado pelo Servidor Central: $consolidatedResult")
        println("Tempo de Execução Paralela: $parallelTime ms\n")

        // ----- Execução Sequencial -----
        val sequentialTime = measureTimeMillis {
            val sequentialResult = sumPartial(numbers)
            println("Resultado Sequencial: $sequentialResult")
        }
        println("Tempo de Execução Sequencial: $sequentialTime ms")
        println("----------------------------------------------------\n")
    }
}
