import kotlin.math.pow

fun main() {
   /*
    O usuário digitará sua idade e o programa deverá printar o ano
    em que ele nasceu.
    */
    /*
    var nome = "Marcelo"
    var idade = 0

    println("CÁLCULO DO ANO DE NASCIMENTO")
    println("---------------------------")
    print("Digite sua idade: ")
    idade = readLine()!!.toInt()

    println("O ano em que você nasceu foi ${2022 - idade} com base no ano em que estamos, 2022.")
    */

    /*
    Faça um programa em que o usuário digite o diâmetro de um círculo
    e calcule a área e o perímetro dele
    ------------------------------------------------------------------
    raio = diametro /2
    Area = raio² . π
    Perimetro = 2 π . raio
    */


    var raio = 0.0
    var area = 0.0
    var perimetro = 0.0

    println("\nCÁLCULO DAS MEDIDAS DE UM CÍRCULO")
    println("---------------------------------")

    print("Digite o diâmetro do circulo: ")
    var diametro = readLine()!!.toDouble()


    raio = diametro / 2
    area = (raio * raio) * 3.14 // ou pi * raio.pow(2)
    perimetro = 2 * 3.14 * raio


    println("O raio do círculo é $raio, a área do círculo é $area " +
            "e o perimetro do círculo é ${"%.2f".format(perimetro)}")






}
