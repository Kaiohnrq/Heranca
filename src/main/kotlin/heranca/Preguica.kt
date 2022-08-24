package heranca

class Preguica(nome: String, idade: Int) : Animal(nome, idade) {

    override fun emiteSom() {
    println("To cansado, to cansado! ")
    }

    override fun locomocao() {
    println("Escalando arvores! ")
    }
}