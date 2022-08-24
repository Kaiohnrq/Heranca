import heranca.Cachorro
import heranca.Cavalo
import heranca.Preguica

fun main() {
    var cachorro = Cachorro("Max", 2)
    cachorro.locomocao()
    cachorro.emiteSom()
    println()
    var cavalo = Cavalo("Serafim", 5)
    cavalo.locomocao()
    cavalo.emiteSom()
    println()
    var preguica = Preguica("Kaio", 25)
    preguica.locomocao()
    preguica.emiteSom()
    println()
}