package heranca

class Cavalo(nome: String, idade: Int) : Animal(nome, idade) {
    override fun emiteSom() {
        println("Irriiii Irririii ")
    }
}