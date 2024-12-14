# 💡 Simulador de Cluster Computacional

## 🎡 **Visão Geral**
Este projeto simula um **cluster computacional** utilizando threads para executar tarefas em paralelo. O programa divide uma função em partes e as executa simultaneamente, consolidando os resultados em um servidor central.

## 🔍 **Funcionalidades**
- Criação de **n threads** (10, 25, 50 e 100) representando os nós do cluster.
- Divisão de uma lista de números inteiros entre as threads.
- Cálculo da soma parcial em cada thread e envio dos resultados para um **servidor central**.
- Consolidação do resultado final e exibição dos tempos de execução paralela e sequencial.

## ⚡ **Requisitos**
- **Kotlin** instalado (versão 1.6+).
- **IntelliJ IDEA** ou **Android Studio** configurado para rodar projetos Kotlin.

## ✅ **Guia de Uso**
1. Clone este repositório ou baixe

## 📶Resultado
Iniciando simulação do cluster computacional...

Testando com 10 threads...
Resultados parciais das threads:
Thread 1: Soma Parcial = 705082704
Thread 2: Soma Parcial = 2115148112
Thread 3: Soma Parcial = -769753776
Thread 4: Soma Parcial = 640311632
Thread 5: Soma Parcial = 2050377040
Thread 6: Soma Parcial = -834524848
Thread 7: Soma Parcial = 575540560
Thread 8: Soma Parcial = 1985605968
Thread 9: Soma Parcial = -899295920
Thread 10: Soma Parcial = 510769488
Resultado Consolidado pelo Servidor Central: 1784293664
Tempo de Execução Paralela: 275 ms

Resultado Sequencial: 1784293664
Tempo de Execução Sequencial: 42 ms
----------------------------------------------------

Testando com 25 threads...
Resultados parciais das threads:
Thread 1: Soma Parcial = 800020000
Thread 2: Soma Parcial = -1894947296
Thread 3: Soma Parcial = -294947296
Thread 4: Soma Parcial = 1305052704
Thread 5: Soma Parcial = -1389914592
Thread 6: Soma Parcial = 210085408
Thread 7: Soma Parcial = 1810085408
Thread 8: Soma Parcial = -884881888
Thread 9: Soma Parcial = 715118112
Thread 10: Soma Parcial = -1979849184
Thread 11: Soma Parcial = -379849184
Thread 12: Soma Parcial = 1220150816
Thread 13: Soma Parcial = -1474816480
Thread 14: Soma Parcial = 125183520
Thread 15: Soma Parcial = 1725183520
Thread 16: Soma Parcial = -969783776
Thread 17: Soma Parcial = 630216224
Thread 18: Soma Parcial = -2064751072
Thread 19: Soma Parcial = -464751072
Thread 20: Soma Parcial = 1135248928
Thread 21: Soma Parcial = -1559718368
Thread 22: Soma Parcial = 40281632
Thread 23: Soma Parcial = 1640281632
Thread 24: Soma Parcial = -1054685664
Thread 25: Soma Parcial = 545314336
Resultado Consolidado pelo Servidor Central: 1784293664
Tempo de Execução Paralela: 531 ms

Resultado Sequencial: 1784293664
Tempo de Execução Sequencial: 12 ms
----------------------------------------------------

Testando com 50 threads...
Resultados parciais das threads:
Thread 1: Soma Parcial = 200010000
Thread 2: Soma Parcial = 600010000
Thread 3: Soma Parcial = 1000010000
Thread 4: Soma Parcial = 1400010000
Thread 5: Soma Parcial = 1800010000
Thread 6: Soma Parcial = -2094957296
Thread 7: Soma Parcial = -1694957296
Thread 8: Soma Parcial = -1294957296
Thread 9: Soma Parcial = -894957296
Thread 10: Soma Parcial = -494957296
Thread 11: Soma Parcial = -94957296
Thread 12: Soma Parcial = 305042704
Thread 13: Soma Parcial = 705042704
Thread 14: Soma Parcial = 1105042704
Thread 15: Soma Parcial = 1505042704
Thread 16: Soma Parcial = 1905042704
Thread 17: Soma Parcial = -1989924592
Thread 18: Soma Parcial = -1589924592
Thread 19: Soma Parcial = -1189924592
Thread 20: Soma Parcial = -789924592
Thread 21: Soma Parcial = -389924592
Thread 22: Soma Parcial = 10075408
Thread 23: Soma Parcial = 410075408
Thread 24: Soma Parcial = 810075408
Thread 25: Soma Parcial = 1210075408
Thread 26: Soma Parcial = 1610075408
Thread 27: Soma Parcial = 2010075408
Thread 28: Soma Parcial = -1884891888
Thread 29: Soma Parcial = -1484891888
Thread 30: Soma Parcial = -1084891888
Thread 31: Soma Parcial = -684891888
Thread 32: Soma Parcial = -284891888
Thread 33: Soma Parcial = 115108112
Thread 34: Soma Parcial = 515108112
Thread 35: Soma Parcial = 915108112
Thread 36: Soma Parcial = 1315108112
Thread 37: Soma Parcial = 1715108112
Thread 38: Soma Parcial = 2115108112
Thread 39: Soma Parcial = -1779859184
Thread 40: Soma Parcial = -1379859184
Thread 41: Soma Parcial = -979859184
Thread 42: Soma Parcial = -579859184
Thread 43: Soma Parcial = -179859184
Thread 44: Soma Parcial = 220140816
Thread 45: Soma Parcial = 620140816
Thread 46: Soma Parcial = 1020140816
Thread 47: Soma Parcial = 1420140816
Thread 48: Soma Parcial = 1820140816
Thread 49: Soma Parcial = -2074826480
Thread 50: Soma Parcial = -1674826480
Resultado Consolidado pelo Servidor Central: 1784293664
Tempo de Execução Paralela: 202 ms

Resultado Sequencial: 1784293664
Tempo de Execução Sequencial: 3 ms
----------------------------------------------------

Testando com 100 threads...
Resultados parciais das threads:
Thread 1: Soma Parcial = 50005000
Thread 2: Soma Parcial = 150005000
Thread 3: Soma Parcial = 250005000
Thread 4: Soma Parcial = 350005000
Thread 5: Soma Parcial = 450005000
Thread 6: Soma Parcial = 550005000
Thread 7: Soma Parcial = 650005000
Thread 8: Soma Parcial = 750005000
Thread 9: Soma Parcial = 850005000
Thread 10: Soma Parcial = 950005000
Thread 11: Soma Parcial = 1050005000
Thread 12: Soma Parcial = 1150005000
Thread 13: Soma Parcial = 1250005000
Thread 14: Soma Parcial = 1350005000
Thread 15: Soma Parcial = 1450005000
Thread 16: Soma Parcial = 1550005000
Thread 17: Soma Parcial = 1650005000
Thread 18: Soma Parcial = 1750005000
Thread 19: Soma Parcial = 1850005000
Thread 20: Soma Parcial = 1950005000
Thread 21: Soma Parcial = 2050005000
Thread 22: Soma Parcial = -2144962296
Thread 23: Soma Parcial = -2044962296
Thread 24: Soma Parcial = -1944962296
Thread 25: Soma Parcial = -1844962296
Thread 26: Soma Parcial = -1744962296
Thread 27: Soma Parcial = -1644962296
Thread 28: Soma Parcial = -1544962296
Thread 29: Soma Parcial = -1444962296
Thread 30: Soma Parcial = -1344962296
Thread 31: Soma Parcial = -1244962296
Thread 32: Soma Parcial = -1144962296
Thread 33: Soma Parcial = -1044962296
Thread 34: Soma Parcial = -944962296
Thread 35: Soma Parcial = -844962296
Thread 36: Soma Parcial = -744962296
Thread 37: Soma Parcial = -644962296
Thread 38: Soma Parcial = -544962296
Thread 39: Soma Parcial = -444962296
Thread 40: Soma Parcial = -344962296
Thread 41: Soma Parcial = -244962296
Thread 42: Soma Parcial = -144962296
Thread 43: Soma Parcial = -44962296
Thread 44: Soma Parcial = 55037704
Thread 45: Soma Parcial = 155037704
Thread 46: Soma Parcial = 255037704
Thread 47: Soma Parcial = 355037704
Thread 48: Soma Parcial = 455037704
Thread 49: Soma Parcial = 555037704
Thread 50: Soma Parcial = 655037704
Thread 51: Soma Parcial = 755037704
Thread 52: Soma Parcial = 855037704
Thread 53: Soma Parcial = 955037704
Thread 54: Soma Parcial = 1055037704
Thread 55: Soma Parcial = 1155037704
Thread 56: Soma Parcial = 1255037704
Thread 57: Soma Parcial = 1355037704
Thread 58: Soma Parcial = 1455037704
Thread 59: Soma Parcial = 1555037704
Thread 60: Soma Parcial = 1655037704
Thread 61: Soma Parcial = 1755037704
Thread 62: Soma Parcial = 1855037704
Thread 63: Soma Parcial = 1955037704
Thread 64: Soma Parcial = 2055037704
Thread 65: Soma Parcial = -2139929592
Thread 66: Soma Parcial = -2039929592
Thread 67: Soma Parcial = -1939929592
Thread 68: Soma Parcial = -1839929592
Thread 69: Soma Parcial = -1739929592
Thread 70: Soma Parcial = -1639929592
Thread 71: Soma Parcial = -1539929592
Thread 72: Soma Parcial = -1439929592
Thread 73: Soma Parcial = -1339929592
Thread 74: Soma Parcial = -1239929592
Thread 75: Soma Parcial = -1139929592
Thread 76: Soma Parcial = -1039929592
Thread 77: Soma Parcial = -939929592
Thread 78: Soma Parcial = -839929592
Thread 79: Soma Parcial = -739929592
Thread 80: Soma Parcial = -639929592
Thread 81: Soma Parcial = -539929592
Thread 82: Soma Parcial = -439929592
Thread 83: Soma Parcial = -339929592
Thread 84: Soma Parcial = -239929592
Thread 85: Soma Parcial = -139929592
Thread 86: Soma Parcial = -39929592
Thread 87: Soma Parcial = 60070408
Thread 88: Soma Parcial = 160070408
Thread 89: Soma Parcial = 260070408
Thread 90: Soma Parcial = 360070408
Thread 91: Soma Parcial = 460070408
Thread 92: Soma Parcial = 560070408
Thread 93: Soma Parcial = 660070408
Thread 94: Soma Parcial = 760070408
Thread 95: Soma Parcial = 860070408
Thread 96: Soma Parcial = 960070408
Thread 97: Soma Parcial = 1060070408
Thread 98: Soma Parcial = 1160070408
Thread 99: Soma Parcial = 1260070408
Thread 100: Soma Parcial = 1360070408
Resultado Consolidado pelo Servidor Central: 1784293664
Tempo de Execução Paralela: 211 ms

Resultado Sequencial: 1784293664
Tempo de Execução Sequencial: 7 ms
----------------------------------------------------


Process finished with exit code 0
